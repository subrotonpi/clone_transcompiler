def import import sys , math , out
from numpy import floor
from numpy import asarray
from numpy import zeros
from numpy import sin
from numpy import sin
from numpy import cos
from numpy import sin
from numpy import sin
from numpy import cos
from numpy import sin
from numpy import sin
from numpy import cos
n = len ( sys.argv )
a = sin ( n )
b = sin ( n )
ans = 0
for i in range ( n ) :
    a [ i ] , b [ i ] = sin ( a [ i ] ) , sin ( b [ i ] )
    ans += a [ i ] * b [ i ]
    out ( int ( floor ( ans * 1.05 ) ) )
