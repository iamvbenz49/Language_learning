package main

import "fmt"

func main() {
	defer fmt.Println("world")
	defer fmt.Println("one")
	defer print()
	fmt.Println("HEllo")
}

func print() {
	fmt.Println("Hello World")
}
