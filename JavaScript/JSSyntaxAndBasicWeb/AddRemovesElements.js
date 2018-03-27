function AddRemoveElements(args) {
    let arrResult=[];
    for (let obj of args) {
        let tokens=obj.split(' ');
        let command=tokens[0];
        let num=Number(tokens[1]);
        switch (command) {
            case 'add':
                arrResult.push(num);
                break;
            case 'remove':
                arrResult.splice(num, 1);
                break;
            default:
                break;
        }
    }

    console.log(arrResult.join('\n'));

}

AddRemoveElements([
    'add 3',
    'add 5',
    'add 7'
]);
AddRemoveElements([
    'add 3',
    'add 5',
    'remove 1',
    'add 2'
]);
AddRemoveElements([
    'add 3',
    'add 5',
    'remove 2',
    'remove 0',
    'add 7'
]);