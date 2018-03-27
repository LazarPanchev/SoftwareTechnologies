function MultiplyDivide(arr) {
    let firstNumN=Number(arr[0]);
    let secondNumX=Number(arr[1]);
    if(firstNumN>secondNumX) {
        return firstNumN/secondNumX;
    }
    else {
        return firstNumN*secondNumX;
    }


}

console.log(MultiplyDivide([
    '144',
    '12'
]));