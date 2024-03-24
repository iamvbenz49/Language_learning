package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	welcome := "user input"
	fmt.Println(welcome)
	reader := bufio.NewReader(os.Stdin)

	//comma ok syntox || err ok
	//In golang we dont have exception handling
	input, _ := reader.ReadString('\n')
	fmt.Println(input)
}
