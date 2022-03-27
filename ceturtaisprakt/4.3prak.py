import re
def getLetterAmount():
    inpFile = input('Which file?(include .txt etc.) ')
    file = open(inpFile)
    text = file.read().lower()
    letters = {}
    for line in text:
        new = line.split()
        b = ''.join(new)
        if re.match('[a-z]', b):
            for letter in new:
                letters[letter] = letters.get(letter, 0 ) + 1
    newList = sorted(letters.items(), reverse=True)
    print(newList)

getLetterAmount()
