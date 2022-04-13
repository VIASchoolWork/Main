import sqlite3
import re

conn = sqlite3.connect('homework1.sqlite')
cur = conn.cursor()

cur.execute('DROP TABLE IF EXISTS emailaddress')
cur.execute('DROP TABLE IF EXISTS domain')
cur.execute('DROP TABLE IF EXISTS weekday')
cur.execute('DROP TABLE IF EXISTS mails')
cur.execute('''CREATE TABLE emailaddress
                 (id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,name text unique)''')
cur.execute('''CREATE TABLE domain
                 (id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,domain text unique)''')
cur.execute('''CREATE TABLE weekday
                 (id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,day text unique)''')
cur.execute('''CREATE TABLE mails
                 (emailaddress_id integer, domain_id integer, day_id integer, PRIMARY KEY (emailaddress_id, domain_id, day_id))''')
conn.commit()

datafile = open("mbox-short.txt", "r")
for line in datafile:
    if line.startswith('From:'):
        continue
    if line.startswith('From'):
        words = line.split(" ")
        email = words[1].split('@')[0]
        domain = words[1].split('@')[1]
        day = words[2]
        cur.execute('INSERT OR IGNORE INTO emailaddress (name) VALUES (?)',
                    (email,))
        cur.execute('INSERT OR IGNORE INTO domain (domain) VALUES (?)',
                    (domain,))
        cur.execute('INSERT OR IGNORE INTO weekday (day) VALUES (?)',
                    (day,))
        cur.execute('SELECT id FROM emailaddress WHERE name=(?)', (email,))
        email_id = cur.fetchone()[0]
        cur.execute('SELECT id FROM domain WHERE domain=(?)', (domain,))
        domain_id = cur.fetchone()[0]
        cur.execute('SELECT id FROM weekday WHERE day=(?)', (day,))
        day_id = cur.fetchone()[0]
        cur.execute('INSERT OR IGNORE INTO mails (emailaddress_id, domain_id, day_id) VALUES (?, ?, ?)',
                    (email_id, domain_id, day_id,))
cur.execute('SELECT domain FROM domain')
for row in cur:
    print(row)
needle = input('WHICH DOMAIN? :')
cur.execute('SELECT emailaddress.name, domain.domain, weekday.day '
            'FROM mails '
            'JOIN emailaddress '
            'JOIN domain '
            'JOIN weekday '
            'ON emailaddress_id = emailaddress.id AND domain_id = domain.id AND day_id = weekday.id '
            'WHERE domain.domain = (?) AND weekday.day = "Fri" OR domain.domain = (?) AND weekday.day = "Sat" '
            'ORDER BY emailaddress.name, domain.domain, weekday.day', (needle, needle,))
all = cur.fetchall()
for one in all:
    print('Name :', one[0], 'Domain :', one[1], 'Day:', one[2])
conn.commit()
cur.close()
