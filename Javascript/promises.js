// promises in javascript are like promises in real life, either promise has completed or rejected

let p = new Promise((resolve,reject) => {
    let a = 1 + 1 + 1;
    if(a==2){
        resolve("passed");
    }else{
        reject("failed")
    }
});

p.then((message) => {
    console.log("then " + message);
}).catch((message) => {
    console.log("catch " +message);
})
