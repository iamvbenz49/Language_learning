const recordVideoOne = new Promise((resolve,reject) => {
    resolve("Video 1 recorded");
})

const recordVideoTwo = new Promise((resolve,reject) => {
    resolve("Video 2 recorded");
})

const recordVideoThree = new Promise((resolve,reject) => {
    resolve("Video 3 recorded");
})

// return all the results in array
Promise.all([  // [ 'Video 1 recorded', 'Video 2 recorded', 'Video 3 recorded' ]
    recordVideoOne,
    recordVideoTwo,
    recordVideoThree
]).then((message) => {
    console.log(message);
})

//returns the first completed result as an array
Promise.race([ // Video 1 recorded
    recordVideoOne,
    recordVideoTwo,
    recordVideoThree
]).then((message) => {
    console.log(message);
})
