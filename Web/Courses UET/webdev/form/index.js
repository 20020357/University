function _is_only_letters(s) {
    if (typeof s === "string") {
        const re = /^[a-zA-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễếệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\s]+$/
        return re.test(s.normalize("NFC"))
    }

    return false
}

function validateEmail(email) {
    return String(email)
        .toLowerCase()
        .match(
            /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/
        );
};

function name_standardized(name) {
    if (typeof name === "string" && _is_only_letters(name)) {
        const tokens = name.split(" ")
        for (let i = 0; i < tokens.length; i++) {
            tokens[i] = tokens[i].substring(0, 1).toUpperCase() + tokens[i].substring(1).toLowerCase()
        }

        return tokens.join(" ")
    }

    throw Error
}

function clear_inputs() {
    const inputs = document.getElementsByTagName("input")
    for (let i of inputs) {
        i.value = ""
    }
}

// Chuyển tiếp inputfield
const inputs = document.querySelectorAll("input:not([type=radio], [type=file])")

for (let i = 0; i < inputs.length - 1; i++) {
    inputs[i].addEventListener("keydown", (e) => {
        if (e.key === "Enter") {
            inputs[i + 1].focus()
        }
    })
}

// Chuẩn hoá tên
const input_name = document.querySelector(".name .value input")
const name_error_span = document.querySelector(".name .error")
if (input_name instanceof HTMLInputElement) {
    input_name.addEventListener("blur", () => {
        try {
            input_name.value = name_standardized(input_name.value)
            name_error_span.textContent = null
        } catch {
            name_error_span.textContent = "Tên không hợp lệ"
        }
    })
}

// Thêm separator ngày sinh
const input_date = document.querySelector(".birthday .value input")
const date_error_span = document.querySelector(".birthday .error")
if (input_date instanceof HTMLInputElement) {
    input_date.addEventListener("keydown", (ev) => {
        if (ev.key === "Backspace") {
            return;
        }

        let tokens = input_date.value.split("/")
        let newval = ""

        for (let i = 0; i < tokens.length; i++) {
            if (Number.isNaN(tokens[i])) {
                date_error_span.textContent = "Ngày sinh không hợp lệ"
            } else {
                if (i == 0 || i == 1) {
                    if (tokens[i].length <= 1) {
                        newval += tokens[i]
                    } else if (tokens[i].length == 2) {
                        newval += tokens[i] + "/"
                    } else {
                        date_error_span.textContent = "Ngày sinh không hợp lệ"
                    }
                } else if (i == 2) {
                    if (tokens[i].length <= 4) {
                        newval += tokens[i]
                    } else {
                        date_error_span.textContent = "Ngày sinh không hợp lệ"
                    }
                } else {
                    date_error_span.textContent = "Ngày sinh không hợp lệ"
                }
            }
        }

        input_date.value = newval
    })

    input_date.addEventListener("blur", () => {
        let tokens = input_date.value.split("/")

        if (tokens.length == 3 && tokens[0].length == 2 && tokens[1].length == 2 && tokens[2].length == 4) {
            date_error_span.textContent = null
        } else {
            date_error_span.textContent = "Ngày sinh không hợp lệ"
        }
    })
}

// Kiểm tra mật khẩu
const re_pass = document.querySelector(".re-password .value input")
const pass = document.querySelector(".password .value input")
const pass_error_span = document.querySelector(".re-password .error")

if (re_pass instanceof HTMLInputElement && pass instanceof HTMLInputElement) {
    re_pass.addEventListener("change", () => {
        if (re_pass.value !== pass.value) {
            pass_error_span.textContent = "Mật khẩu không khớp"
        } else {
            pass_error_span.textContent = null
        }
    })
}

// Kiểm tra email
const email_input = document.querySelector(".email .value input")
const email_error_span = document.querySelector(".email .error")

if (email_input instanceof HTMLInputElement) {
    email_input.addEventListener("blur", () => {
        const email  = email_input.value
        if (email.length != 0 && !validateEmail(email)) {
            email_error_span.textContent = "Email không hợp lệ"
        } else {
            email_error_span.textContent = null
        }
    })
}

// On-click ignore button
document.getElementById("ignore-btn").addEventListener("click", clear_inputs)


// On-click submit button
document.getElementById("accept-btn").addEventListener("click", () => {
    const require_inputs = document.getElementsByClassName("require")
    const error_spans = document.getElementsByClassName("error")

    for (let i = 0; i < require_inputs.length; i++) {
        if (require_inputs[i].value.length == 0) {
            error_spans[i].textContent = "Bắt buộc"
        }
    }
})