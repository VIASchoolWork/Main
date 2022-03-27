import re
from collections import Counter
def getEmailDomains():
    inpFile = input('Which file?(include .txt etc.) ')
    file = open(inpFile)
    text = file.read()
    mail = re.findall('@([\w.\-+]+)', text)
    print(Counter(mail))
getEmailDomains()
