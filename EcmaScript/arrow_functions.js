function nums(...nums) {
    //NORMAL FUNCTIONS
    let total_nf = nums.reduce(function(x, y) {
        return x + y
    });
    console.log("USING NORMAL FUNCTION", total_nf)

    //ARROW FUNCTIONS
    let total_af = nums.reduce((x, y) => x + y)
    console.log("USING ARROW FUNCTION", total_af)
}

nums(1, 2, 3, 4)