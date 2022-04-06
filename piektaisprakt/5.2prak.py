import urllib.request, urllib.parse,urllib.error
from bs4 import BeautifulSoup
url = input('Enter the website: ')
html = urllib.request.urlopen(url).read()
soup = BeautifulSoup(html, 'html.parser')
tags = soup.find_all(attrs={'class': 'sc-11eed019-7 dlEERm'})

for role in tags:
    name = role.find(attrs={'class': 'sc-11eed019-1 jFeBIw'})
    playing = role.find(attrs={'class': 'sc-11eed019-5 gUFDaA'})
    if not playing:
        print(name.text)
        continue
    print(name.text,' playing ', playing.text)
