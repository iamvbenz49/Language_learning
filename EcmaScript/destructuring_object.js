let information = {
        name: "Vijay",
        age: 17,
        Education: "SSLC"
    }
    /*
            NORMAL JAVASCRIPT 
            */

const { name, age, Education } = information
console.log(name, age, Education)


/*
        ECMASCRIPT 
        */
const { name: n, age: a, Education: e } = information;
console.log(n, a, e)