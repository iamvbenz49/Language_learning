package main

import "fmt"

func main() {
	fmt.Println("Structs in Go")
	// no inheritance

	hitesg := User{"Bennz", "hd@gmail.com", true, 12}
	fmt.Println(hitesg)
	fmt.Printf("%+v", hitesg)
	fmt.Printf("%v", hitesg.Name)
}

type User struct {
	Name   string
	Email  string
	Status bool
	Age    int
}
