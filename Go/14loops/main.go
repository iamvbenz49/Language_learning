package main

import "fmt"

func main() {
	fmt.Println("Loops")
	days := []int{1, 2, 3, 4, 5, 6, 7}

	fmt.Println(days)
	for d := 0; d < len(days); d++ {
		fmt.Println(days[d])
	}

	for i := range days {
		fmt.Print(days[i], " ")
	}

	for _, day := range days {
		fmt.Println(day)
	}

	val := 1

	for val < 10 {
		if val == 3 {
			goto lco
		}
		if val == 4 {
			break
		}
		fmt.Println(val)
		val++
	}

lco:
	fmt.Println("Go to")
}
