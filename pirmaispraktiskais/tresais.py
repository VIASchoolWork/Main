def tresaisuzd():
    try:
        print("Enter the ammount of hours")
        x = input()
    except:
        print("Error, please enter numeric input")
        print("Enter the ammount of hours")
        x = input()
    try:
        print("Enter hourly rate")
        y = input()
    except:
       print("Error, please enter numeric input")
       print("Enter hourly rate")
       y = input()
    if x > 40:
        b = x - 40
        x = 40
    totalpay = x * y + 17.5 * y
    print(totalpay)
    
tresaisuzd()