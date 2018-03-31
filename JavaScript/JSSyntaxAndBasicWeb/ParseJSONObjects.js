function ParseJSONObject(args) {
    let resultArr=[];
    for (let textLine of args) {
        let currentObj=JSON.parse(textLine);
        resultArr.push(currentObj)

    }

    for (let obj of resultArr) {
        console.log(`Name: ${obj.name}`);
        console.log(`Age: ${obj.age}`);
        console.log(`Date: ${obj.date}`);
    }

}


ParseJSONObject([
    '{"name":"Gosho","age":10,"date":"19/06/2005"}',
    '{"name":"Tosho","age":11,"date":"04/04/2005"}'
]);