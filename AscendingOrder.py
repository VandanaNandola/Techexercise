List = []

Number = int(input("Enter Number of List Elements: "))
for i in range(1, Number + 1):
    value = int(input("Enter the Element %d value: " %i))
    List.append(value)

for i in range (Number):
    for j in range(i + 1, Number):
        if(List[i] > List[j]):
            temp = List[i]
            List[i] = List[j]
            List[j] = temp

print("Element List in Ascending Order is : ", List)
