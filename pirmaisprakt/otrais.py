def otraisuzd():
    print("Enter the ammount of hours")
    x = int(input())
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
   
    
otraisuzd()