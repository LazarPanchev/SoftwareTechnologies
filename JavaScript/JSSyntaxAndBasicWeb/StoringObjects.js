function StoringObjects(args) {
    let resArray=[];
    for (let line of args) {
        let tokens=line.split(' -> ');
        let name=tokens[0];
        let age=tokens[1];
        let grade=tokens[2];
        let resultObj={};
        resultObj['name']=name;
        resultObj['age']=age;
        resultObj['grade']=grade;
        resArray.push(resultObj);
    }

    for (let obj of resArray) {
        console.log(`Name: ${obj.name}`);
        console.log(`Age: ${obj.age}`);
        console.log(`Grade: ${obj.grade}`);0
    }0
}

StoringObjects([
    'Pesho -> 13 -> 6.00',
    'Ivan -> 12 -> 5.57',
    'Toni -> 13 -> 4.90'
]);