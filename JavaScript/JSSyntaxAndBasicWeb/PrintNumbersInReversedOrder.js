function PrintInReversedOrder(args) {
    for (let i = args.length-1; i >=0; i--) {
        console.log(args[i]);
    }
}

PrintInReversedOrder([
    '10',
    '15',
    '20'
]);

PrintInReversedOrder([
    '5',
    '5.5',
    '24',
    '-3'
]);
PrintInReversedOrder([
    '20',
    '1',
    '20',
    '1',
    '20'
]);