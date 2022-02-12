def otraisuzd():
    print("Enter the ammount of hours")
    x = input()
    print("Enter hourly rate")
    y = input()
    if x > 40:
        b = x - 40
        x = 40
        totalpay = x * y + 17.5 * b
        print(totalpay)
    else:
        totalpay = x * y
        print(totalpay)
   
    
otraisuzd()