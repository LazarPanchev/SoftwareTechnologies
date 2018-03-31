function TurnObjectIntoJSONString(args) {
    let resultObj={};
    for (let textLine of args) {
        let tokens=textLine.split(' -> ');
        let key=tokens[0];
        let value=tokens[1];
        if(key==='age' || key==='grade') {
            value=Number(tokens[1]);
        }
        resultObj[key]=value;
    }

    console.log(JSON.stringify(resultObj));

}

TurnObjectIntoJSONString([
    'name -> Angel',
    'surname -> Georgiev',
    'age -> 20',
    'grade -> 6.00',
    'date -> 23/05/1995',
    'town -> Sofia'
]);