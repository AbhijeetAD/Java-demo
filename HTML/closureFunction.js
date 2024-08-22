function greeting(){
    var messsage="Hi";

    function sayHi(){
        console.log(messsage);

    }
    return sayHi;
}
let hi=greeting();
hi();