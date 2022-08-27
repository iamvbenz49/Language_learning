function arr(nums = [1, 2, 3, 4]) {
    let total = 1
    nums.forEach((element) => {
        total *= element
    })
    console.log(total)
}
arr()