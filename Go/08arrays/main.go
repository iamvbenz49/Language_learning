package main

import "fmt"

func main() {
	fmt.Println("Arrays in Go")
	var nums [4]int

	nums[0] = 1
	nums[1] = 2
	nums[2] = 99
	fmt.Println(nums)
	fmt.Println(len(nums))

	var arr = [3]int{1, 2, 4}
	fmt.Println(arr)
}
