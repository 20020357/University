function Person(name, birthday, gender) {
    this.name = name
    this.birthday = birthday
    this.gender = gender
}

function CheckboxListener(table) {
    if (table instanceof HTMLTableElement) {
        this.table = table
        this.allowElementChange = true

        let checkbox = table.querySelector("tr th input")
        
        if (checkbox instanceof HTMLInputElement) {
            this.globalCheckbox = checkbox

            this.globalCheckbox.onchange = () => this.onGlobalChange()
        } else {
            throw Error("Invalid table")
        }
    } else {
        throw Error('Invalid argument')
    }

    this.getElementCheckboxes = function() {
        let checkboxes = []
        let rows = this.table.querySelectorAll("tr")
        for (let row of rows) {
            let checkbox = row.querySelector("td input")
            if (checkbox instanceof HTMLInputElement) {
                checkboxes.push(checkbox)
            }
        }
        return checkboxes
    }

    this.onGlobalChange = function() {
        this.allowElementChange = false // block element update
        let elementCheckboxes = this.getElementCheckboxes()

        for (let checkbox of elementCheckboxes) {
            if (checkbox.checked.toString() !== this.globalCheckbox.checked.toString()) {
                checkbox.click()
            }
        }

        this.allowElementChange = true
    }

    this.onElementChange = function() {
        if (this.allowElementChange) {
            let elementCheckboxes = this.getElementCheckboxes()

            let counter = 0
            for (let checkbox of elementCheckboxes) {
                if (checkbox.checked) {
                    counter += 1
                }
            }

            if (counter == elementCheckboxes.length) {
                this.globalCheckbox.checked = true
            } else if (this.globalCheckbox.checked) {
                this.globalCheckbox.checked = false
            }
        }
    }
}

function getColor(index) {
    if (index % 2 == 0) {
        return "#FF8787"
    } else {
        return "#F8C4B4"
    }
}

function addPersonToTable(
    table,
    person,
    listener
) {
    if (table instanceof HTMLTableElement && 
        person instanceof Person &&
        listener instanceof CheckboxListener) {
        let row = table.insertRow()

        // Init checkbox
        let checkbox = document.createElement("input")
        checkbox.setAttribute("type", "checkbox")

        // Setup event action
        checkbox.onchange = () => {
            // Call global listener
            listener.onElementChange()

            if (checkbox.checked) {
                row.style.backgroundColor = "#FCFFB2"
            } else {
                row.style.backgroundColor = getColor(row.rowIndex)
            }
        }
    
        row.onmouseover = () => {
            if (!checkbox.checked) {
                row.style.backgroundColor = '#BCE29E'
            }
        }
        row.onmouseout = () => {
            if (!checkbox.checked) {
                row.style.backgroundColor = getColor(row.rowIndex)
            }
        }
        row.onclick = () => checkbox.click()

        row.style.backgroundColor = getColor(row.rowIndex)
        row.insertCell().appendChild(checkbox)
        row.insertCell().innerHTML = person.name
        row.insertCell().innerHTML = person.birthday
        row.insertCell().innerHTML = person.gender
    } else {
        throw new Error('Invalid arguments')
    }
}


const people = [
    new Person('Hoàng Thị Thảo', '23/6/1990', 'Nữ'),
    new Person('Ngô Mạng Quân', '14/4/1992', 'Nam'),
    new Person('Nguyễn Thanh Tùng', '27/9/1991', 'Nam'),
    new Person('Hoàng Thị Ngân', '12/12/1992', 'Nữ')
]

const table = document.getElementById("table")
const headerListener = new CheckboxListener(table)

if (table instanceof HTMLTableElement) {
    for (var person of people) {
        addPersonToTable(table, person, headerListener)
    }
}