import re

hand = open('cereals.csv', "r")
names_list = []
ratings_list = []
for line in hand:
    line = line.rstrip()
    name = re.findall('^.+?(?=,[A-Z])', line)
    rating = re.findall('[0-9.]+$', line)
    for yeet in name:
        names_list.append(yeet)
    for element in rating:
        ratings_list.append(float(element))

del names_list[0]
del ratings_list[0]


def Average(l):
    avg = sum(l) / len(l)
    return avg


average = Average(ratings_list)

zipped_lists = zip(ratings_list, names_list)
sorted_zipped_lists = sorted(zipped_lists)
sorted_list1 = [element for _, element in sorted_zipped_lists]
sorted = ratings_list.copy()
sorted.sort()
#print(names_list)
#print(ratings_list)
print("The worst cereal is: " + sorted_list1[0] + " with the rating: " + str(sorted[0]))
print("The average score is:", average)
print("The hgihest rated cereal is: " + sorted_list1[-1] + " with the rating: " + str(sorted[-1]))
