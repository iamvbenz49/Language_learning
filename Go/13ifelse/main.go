package main

import "fmt"

func main() {
	if 10 < 2 {
		fmt.Println(10 < 2)
	} else {
		fmt.Println(10 < 12)
	}

	if num := 19; num > 18 {
		fmt.Println("Eligible to vote")
	}
}
