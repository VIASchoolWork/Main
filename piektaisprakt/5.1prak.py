import socket
try:
    website = input('Enter the website: ')
    parts = website.split('/')
    mysock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    mysock.connect((parts[2], 80))
    cmd = 'GET '+website+' HTTP/1.0\r\n\r\n'
    mysock.send(cmd.encode())
except:
    print('Website is incorrect.')

while True:
    data = mysock.recv(2056)
    if (len(data) < 1):
        break
    export = list(data.decode())
printout = ''
for char in export:
    printout += char
    if(len(printout) == 2200):
        print('Exceeding the maximum amount of characters.')
        break
print(printout)
    
mysock.close()