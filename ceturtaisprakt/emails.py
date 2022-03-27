import re
from collections import Counter

file = open("mbox-short.txt", 'r')
text = file.read().lower()
letters = re.findall("[a-z]", text)

print(Counter(letters))
