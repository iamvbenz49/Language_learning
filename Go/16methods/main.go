package main

import "fmt"

func main() {
	fmt.Println("Structs in Go")
	// no inheritance

	hitesg := User{"Bennz", "hd@gmail.com", true, 12}
	fmt.Println(hitesg)
	fmt.Printf("%+v", hitesg)
	fmt.Printf("%v ", hitesg.Name)
	fmt.Println(hitesg.GetAge())
	fmt.Println(hitesg.changeAge()) //values changes
	fmt.Println(hitesg)             // no change
}

type User struct {
	Name   string
	Email  string
	Status bool
	Age    int
}

func (u User) GetAge() int {
	return u.Age
}

func (u User) changeAge() int {
	u.Age = 122
	return u.Age
}
