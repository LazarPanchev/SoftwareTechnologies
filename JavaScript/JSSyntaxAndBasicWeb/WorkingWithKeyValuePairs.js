function StoreKeyValuePair(args) {
    let obj={};
    let searchedKey=args.pop();
    for (let current of args) {
        let tokens=current.split(' ');
        let key=tokens[0];
        let value=tokens[1];
        obj[key]=value;
    }

    if(obj.hasOwnProperty(searchedKey)) {
        console.log(obj[searchedKey]);
    }else {
        console.log('None');
    }
}

StoreKeyValuePair([
    'key value',
    'key eulav',
    'test tset',
    'key'
]);
StoreKeyValuePair([
    '3 test',
    '3 test1',
    '4 test2',
    '4 test3',
    '4 test5',
    '4'
]);
StoreKeyValuePair([
    '3 bla',
    '3 alb',
    '2'
]);