function getData(self) {
    self.disabled = true;
    let xmlHttpRequest = new XMLHttpRequest();
    
    xmlHttpRequest.onreadystatechange = () => {
        if (xmlHttpRequest.readyState == 4) {
            if (xmlHttpRequest.status == 200) {
                let data = xmlHttpRequest.responseText;
                let jsonData = JSON.parse(data);

                for (let i in jsonData) {
                    let row = document.createElement('tr');
                    let cellName = document.createElement('td');
                    let cellAge = document.createElement('td');
                    let cellCars = document.createElement('td');

                    cellName.innerHTML = jsonData[i].name;
                    cellAge.innerHTML = jsonData[i].age;
                    cellCars.innerHTML = jsonData[i].cars.length;
                    for (let j in jsonData[i].cars) {
                        cellCars.innerHTML += '<br>' + jsonData[i].cars[j].name + ' - ' + jsonData[i].cars[j].models;
                    }

                    row.append(cellName);
                    row.append(cellAge);
                    row.append(cellCars);

                    document.getElementById('tableData').append(row);
                }
            }
        }
    }

    xmlHttpRequest.open('GET', './data.json');

    xmlHttpRequest.send(null);
}