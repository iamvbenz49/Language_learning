package main

import "fmt"

func main() {
	fmt.Println("Lesson on Pointers")

	var one int = 3
	var ptr *int = &one
	fmt.Println(one)
	fmt.Println(ptr)
	fmt.Println(*ptr)
	fmt.Println(&ptr)

	var p1 *int
	fmt.Println(p1)

	*ptr = *ptr * 10
	fmt.Println(*ptr)
}
