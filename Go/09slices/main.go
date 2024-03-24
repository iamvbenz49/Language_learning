package main

import (
	"fmt"
	"sort"
)

func main() {
	fmt.Println("Hello Slices!")
	var nums = []int{1, 2, 3, 4, 5}
	fmt.Printf("type %T", nums)
	fmt.Println(nums)
	fmt.Println(nums[1:3])

	highScore := make([]int, 4)
	highScore[0] = 12
	highScore[1] = 43
	highScore = append(highScore, 12, 43, 21, 290)
	fmt.Println(highScore)

	sort.Ints(highScore)

	fmt.Println(highScore)

	//removing value
	highScore = append(highScore[:3], highScore[5:]...)
	fmt.Println(highScore)
}
