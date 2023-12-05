def import import sys , os , sys
from time import sleep
from itertools import product , repeat
s = sys.stdin
p = sys.stdout
N = len ( sys.stdin )
for i in range ( 1 , N + 1 ) :
    d = sys.stdin.read ( )
    v1 = [ ]
    v2 = [ ]
    for j in range ( d ) :
        v1.append ( s.read ( ) )
    for j in range ( d ) :
        v2.append ( s.read ( ) )
    u = v1 [ : : - 1 ]
    v = v2 [ : : - 1 ]
    u.sort ( )
    v.sort ( key = lambda a : - ( a [ 1 ] ) )
    res = 0
    for i in range ( len ( u ) ) :
        res += u [ i ] [ 0 ] * v [ i ] [ 0 ]
    p.write ( "Case #%d: %d\n" % ( i , res ) )
