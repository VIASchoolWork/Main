#Pirmais Uzdeums
def pirmaisuzd():
    try:
        print("Enter the ammount of hours")
        x = int(input())
    except:
        print("Error, please enter numeric input")
        print("Enter the ammount of hours")
        x = int(input())
    try:
        print("Enter hourly rate")
        y = int(input())
    except:
        print("Error, please enter numeric input")
        print("Enter hourly rate")
        y = int(input())
    if x > 40:
        b = x - 40
        x = 40
        totalpay = x * y + 17.5 * b
        print(totalpay)
    else:
        totalpay = x * y
        print(totalpay)
pirmaisuzd()
#THE ACTAL VERSION?
def task2():
    line_one = ""
    for _ in range(2):
        line_one += " "
    for _ in range(8):
        line_one += "*"
    line_two = ""
    for _ in range(1):
        line_two += " "
    for _ in range(10):
        line_two += "*"
    line_three = ""
    for _ in range(4):
        line_three += "*"
    for _ in range(4):
        line_three += " "
    for _ in range(4):
        line_three += "*"

    print(line_one)
    print(line_two)
    print(line_three)
    print(line_three)
    print(line_two)
    print(line_one)
    print(line_two)
    print(line_three)
    print(line_three)
    print(line_two)
    print(line_one)
#THE BEST VERSION
def betterversion():
    data = {
        1: "  ********  ",
        2: " ********** ",
        3: "****    ****",
    }
    order_list = [1, 2, 3, 3, 2, 1, 2, 3, 3, 2, 1]
    for key in order_list:
        print(data[key])
#COOL VERSION
def bruh():
    fool_data = ["001111111100",
                 "011111111110",
                 "111100001111",
                 "111100001111",
                 "011111111110",
                 "001111111100",
                 "011111111110",
                 "111100001111",
                 "111100001111",
                 "011111111110",
                 "001111111100"]
    for row in fool_data:
        for char in row:
            if char == "1":
                print("*", end='')
            elif char == "0":
                print(" ", end='')
        print()
#THE OTHER  ACTUAL VERSION?
def piesis():
    def atstarpe(a):
        a = a + ' '
        return a

    def zvaigzne(a):
        a = a + '*'
        return a

    zimejums = '001111111100011111111110111100001111111100001111011111111110001111111100011111111110111100001111111100001111011111111110001111111100'
    line = ''
    count = 0
    size = 0
    z = 0
    while True:
        if count == 12:
            print(line)
            line = ''
            size += 1
            z += 1
            count = 0
            continue
        if size == 11:
            break
        if zimejums[0] == '0':
            line = atstarpe(line)
            count += 1
            z += 1
            zimejums = zimejums[1:]
            continue
        if zimejums[0] == '1':
            line = zvaigzne(line)
            count += 1
            z += 1
            zimejums = zimejums[1:]
            continue
#THE FIRST TRY
def fast():
   for i in[ "  ********  ", " ********** ", "****    ****", "****    ****", " ********** ", "  ******** ", " ********** " , "****    ****", "****    ****", " ********** ", "  ******** "]:
    print(i)
#SECOND TRY
def seconduzd():
    list1 = ["  ********  ", " ********** ", "****    ****", "****    ****", " ********** ", "  ******** ",
             " ********** ", "****    ****", "****    ****", " ********** ", "  ******** "]
    i = 0
    print("\n")
    while i < len(list1):
        print(list1[i])
        i += 1

task2()
#seconduzd()
#piesis()
#bruh()
#betterversion()
#fast()
