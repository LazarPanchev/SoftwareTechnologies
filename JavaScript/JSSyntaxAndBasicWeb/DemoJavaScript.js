function MultiplyValuesForAKey (args) {
    let searchedKey=args.pop();
    let map=new Map();
    for (let i = 0; i < args.length; i++) {
        let tokens=args[i].split(' ');
        let key=tokens[0];
        let value=tokens[1];

        if(!map.has(key)) {
            map.set(key,new Array());
        }
        map.get(key).push(value);

    }

    if(map.has(searchedKey)) {
        // for (let obj of map.get(searchedKey)) {
        //     console.log(obj);
        // }
        console.log(map.get(searchedKey).join('\n'));

    }else {
        console.log('None');
    }

}

MultiplyValuesForAKey([
    'key value',
    'key eulav',
    'test tset',
    'key'
]);
MultiplyValuesForAKey([
    '3 test',
    '3 test1',
    '4 test2',
    '4 test3',
    '4 test5',
    '4'
]);
MultiplyValuesForAKey([
    '3 bla',
    '3 alb',
    '2'
]);