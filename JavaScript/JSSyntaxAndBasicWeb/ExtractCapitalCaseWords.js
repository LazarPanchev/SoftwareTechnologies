function Extract(arr) {
    let text=arr.join(',');
    let result=[];
    let words=text.split(/\W+/);
    let nonEmptyWords=words.filter(w=>w.length>0);
    for (let word of nonEmptyWords) {
        if(isUppercase(word)) {
            result.push(word);
        }
    }
    console.log(result.join(', '));
    
    function isUppercase(str) {
        return str ===str.toUpperCase();
    }
}

Extract(['PHP, Java and HTML']);