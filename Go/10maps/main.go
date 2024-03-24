package main

import "fmt"

func main() {
	dict := make(map[int]int)
	dict[0] = 1
	dict[10] = 1
	fmt.Println(dict)
	delete(dict, 0)
	fmt.Println(dict)
	for key, value := range dict {
		fmt.Println(key, value)
	}
}
