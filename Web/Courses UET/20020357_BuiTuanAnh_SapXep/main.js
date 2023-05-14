/*
Yeu cau: sap xep theo cot
Flow: len server tai du lieu -> hien thi ra bang -> bat su kien -> sap xep

Ham:
1, Ham len server, tai du lieu va hien thi bang
2, Bat su kien va sap xep
    - Thay doi mui ten:
        Bien:   luu lai trang thai sx truoc do
                luu lai cot dang duoc sx
        TH1: Nhan vao cot dang dc sx -> dao chieu sx, cap nhat lai trang thai cho bien, cap nhat cot dang dc sx
        TH2: Nhan vao cot chua sx -> sx theo chieu tang, thay doi trang thai cua cot con lai, cap nhat cot dang dc sx
    - Sx
*/
function getVowels(str) {
    var m = str.match(/[aeiou]/gi);
    if (m === null) {
        return 0;
    }
    return m.length;
}

console.log(getVowels('sky'));