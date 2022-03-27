def getFromEmails():
    inpFile = input('Which file?(include .txt etc.) ')
    file = open(inpFile)
    for line in file:
        if line.startswith('From:'):
            continue
        if line.startswith('From'):
            email = line.split(' ')
            print(email[1])
getFromEmails()
