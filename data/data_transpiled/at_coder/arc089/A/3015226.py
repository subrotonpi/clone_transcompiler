def import import sys , string , traceback
from time import sleep
from time import sleep
from sys import stdout
from time import sleep
from math import fabs
from math import log as f
from math import log as e
from math import log as f
N = int ( f.read ( ) )
t = [ int ( i ) for i in range ( 1 , N + 1 ) ]
x = [ int ( i ) for i in range ( 1 , N + 1 ) ]
y = [ int ( i ) for i in range ( 1 , N + 1 ) ]
for i in range ( 1 , N + 1 ) :
    tdiff = t [ i ] - t [ i - 1 ]
    xd = abs ( x [ i ] - x [ i - 1 ] )
    yd = abs ( y [ i ] - y [ i - 1 ] )
    dd = xd + yd
    if tdiff >= dd and ( tdiff % 2 == dd % 2 ) :
        continue
    else :
        print ( "No" )
        return
print ( "Yes" )
