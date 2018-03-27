function Product(args) {
    let [x,y,z] = args.map(Number);
    let count=0;

    if(x===0 || y===0 || z===0) {
        console.log('Positive');
        return;
    }

    [x,y,z].forEach(e =>{
        if(e<0) {
            count++;
        }
        });
    console.log(count % 2 === 0 ? 'Positive' : 'Negative');
}

Product(['2','3','-1']);
Product(['5','4','3']);
Product(['-3','-4','5']);