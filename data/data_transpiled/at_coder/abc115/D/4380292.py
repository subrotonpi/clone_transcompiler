def import import sys , string , randrange
from numpy.core import zeros , float32 , float64
from numpy.core import sin , cos , pi
from numpy.core import in
from numpy.core import sin , cos , pi
from numpy.core import in
from numpy.core import sin , cos , pi
from numpy.core import in
n = int ( sys.stdin.readline ( ) )
x = int ( sys.stdin.readline ( ) )
a = [ 1 ] * 51
p = [ 1 ] * 51
for i in range ( 50 ) :
    a [ i + 1 ] = 2 * a [ i ] + 3
    p [ i + 1 ] = 2 * p [ i ] + 1
out ( f ( a , p , n , x ) )
def f ( a , p , n , x ) :
    if x == 1 : return n > 0
    if x == 3 + 2 * a [ n - 1 ] : return p [ n - 1 ] * 2 + 1
    if x == a [ n - 1 ] + 2 : return p [ n - 1 ] + 1
    if 1 < x <= a [ n - 1 ] + 1 : return f ( a , p , n - 1 , x - 1 )
    return p [ n - 1 ] + 1 + f ( a , p , n - 1 , x - a [ n - 1 ] - 2 )
