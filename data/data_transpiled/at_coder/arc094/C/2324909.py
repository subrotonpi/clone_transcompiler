def import import sys , string , traceback , time
from os import urandom
import sys
import struct
from os import urandom
import random
import sys
import struct
from os import urandom
import string
import sys
n = int ( urandom.encode ( 'utf-8' ) )
a = [ ]
b = [ ]
result = 0
min_b = int ( sys.maxint )
same = True
for i in range ( n ) :
    tmplist = sys.stdin.readline ( ).split ( )
    a.append ( int ( tmplist [ 0 ] ) )
    b.append ( int ( tmplist [ 1 ] ) )
    result += a [ i ]
    if a [ i ] > b [ i ] and min_b > b [ i ] :
        min_b = b [ i ]
    if a [ i ] != b [ i ] :
        same = False
if not same :
    result -= min_b
else :
    result = 0
print ( result )
