function PrintLines(args) {
    for (let obj of args) {
        if(obj!='Stop') {
            console.log(obj)
        }else {
            break;
        }
    }
}


PrintLines([
    'Line 1',
    'Line 2',
    'Line 3',
    'Stop'
]);

PrintLines([
    '3',
    '6',
    '5',
    '4',
    'Stop'
]);