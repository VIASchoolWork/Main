def tresaisuzd():
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
    
tresaisuzd()