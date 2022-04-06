import urllib.request, urllib.parse, urllib.error
import json

lat=input('Latitude: ')
lon=input('Longitude: ')
url='https://nominatim.openstreetmap.org/reverse?lat='+lat+'&lon='+lon+'&format=geojson'
try:
    work = urllib.request.urlopen(url)
    data = work.read().decode()
    js = json.loads(data)
except:
    js = None
if js is None or 'features' not in js:
    print('Something went wrong.')
    exit()

name = js['features'][0]['properties']['display_name'].split(',')[0]
type = js['features'][0]['properties']['category']
country = js['features'][0]['properties']['address']['country']
countryCode = js['features'][0]['properties']['address']['country_code']


print('Name : ', name)
print('Type : ', type)
print('Country : ', country)
print('Country code : ', countryCode)




