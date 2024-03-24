package main

import "fmt"

func main() {
	fmt.Println("Welcome to Functions!!")
	greeter()

	helper()
	fmt.Println(add(10, 30))
	fmt.Println(proAdder(10, 20, 30, 40, 50))
}

func add(a int, b int) int {
	return a + b
}

func proAdder(val ...int) int {
	total := 0
	for _, val := range val {
		total += val
	}
	return total
}
func helper() {
	greeter()
}

func greeter() {
	fmt.Println("Namaste!")
}
