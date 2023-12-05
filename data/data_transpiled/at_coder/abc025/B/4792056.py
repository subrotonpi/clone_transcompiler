def import import sys , string , randrange
from math import sin , cos , randrange
from os import urandom
from os import urandom
from os import urandom
from os.path import join
from os.path import expanduser
from os.path import join
from os.path import join
from os.path import join
from os.path import join
n = randrange ( 1 , 256 )
a = urandom ( 1 )
b = urandom ( 1 )
cnt = 0
ord = [ ]
dis = [ ]
for i in range ( n ) :
    ord.append ( join ( ord , 'east' ) )
    dis.append ( randrange ( 1 , 256 ) )
    if dis [ i ] < a :
        dis.append ( a )
    elif dis [ i ] > b :
        dis.append ( b )
    if ord [ i ] == 'east' :
        cnt += dis [ i ]
    else :
        cnt -= dis [ i ]
if cnt > 0 :
    print ( 'East ' , end = ' ' )
elif cnt < 0 :
    print ( 'West ' , end = ' ' )
print ( abs ( cnt ) )
