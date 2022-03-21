file = open("cereals.csv", "r")
x = 0
names = []
ratings = []
float_lst = []

for line in file:
    line = line.strip()
    arr1 = line.split(",")
    names.append(arr1[0])
    ratings.append(arr1[-1])

del names[0]
del ratings[0]
print(names)
for item in ratings:
    float_lst.append(float(item))

def Average(l):
    avg = sum(l) / len(l)
    return avg

cerealnames = []

for string in names:
    new_string = string.replace("_", " ")
    cerealnames.append(new_string)

zipped_lists = zip(ratings, cerealnames)
sorted_zipped_lists = sorted(zipped_lists)
sorted_list1 = [element for _, element in sorted_zipped_lists]
sorted = float_lst.copy()
sorted.sort()
average = Average(float_lst)

#print(float_lst)
print("The worst cereal is: " + sorted_list1[0] + " with the rating: " + str(sorted[0]))
print("The average score is: " + str(average))
print("The hgihest rated cereal is: " + sorted_list1[-1] + " with the rating: " + str(sorted[-1]))
