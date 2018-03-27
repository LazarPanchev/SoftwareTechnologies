function SetValues(args) {
    let lenghtN=Number(args[0]);
    let array=[];
    for (let i = 0; i < lenghtN; i++) {
        array[i]=0;
    }

    for (let i = 1; i < args.length; i++) {
        let tokens=args[i].split(' - ');
        let index=Number(tokens[0]);
        let value=Number(tokens[1]);
        array[index]=value;
    }
    console.log(array.join('\n'));
    
}

SetValues([
    '3',
    '0 - 5',
    '1 - 6',
    '2 - 7'
]);
SetValues([
    '2',
    '0 - 5',
    '0 - 6',
    '0 - 7'
]);
SetValues([
    '5',
    '0 - 3',
    '3 - -1',
    '4 - 2'
]);