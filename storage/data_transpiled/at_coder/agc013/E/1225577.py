def _import ( ) : return _import ( )
from itertools import product
from itertools import repeat
from itertools import product
from itertools import chain
from itertools import product
from itertools import product
from itertools import repeat
MODULO = 1_000_000_000 + 7
A = [ [ 1 , 0 , 1 ] , [ 2 , 1 , 2 ] , [ 1 , 1 , 2 ] ]
for n , pow in product ( [ 1 , 0 , 1 ] , repeat ( [ 2 , 1 , 2 ] ) ) :
    if n % 2 == 1 :
        ret = mul ( ret , pow )
def tr ( * args ) :
    a = [ [ 1 ] , [ 2 ] , [ 1 ] ]
    if m == 0 :
        a = mul ( pow ( A , n - 1 ) , a )
    else :
        a = mul ( pow ( A , x [ 0 ] - 1 ) , a )
        a = mul ( B , a )
    for i in range ( 1 , m ) :
        a = mul ( pow ( A , ( x [ i ] - 1 ) - x [ i - 1 ] ) , a )
        a = mul ( B , a )
    if m > 0 :
        a = mul ( pow ( A , ( n - 1 ) - x [ m - 1 ] ) , a )
    print ( a [ 2 ] [ 0 ] )
def run ( ) :
    with open ( 'test.txt' , 'r' ) as f :
        n , m = next ( f )
        x = [ ]
        for i in range ( m ) :
            x.append ( f.read ( ) )
        solve ( n , m , x )
for i , j in enumerate ( product ( [ 1 , 2 ] , repeat ( [ 1 , 2 ] ) ) ) :
    ret = [ ]
    for i in range ( len ( a ) ) :
        for j in range ( len ( b [ i ] ) ) :
            for k in range ( len ( a [ i ] ) ) :
                ret.append ( ( ret [ i ] [ j ] + a [ i ] [ k ] * b [ j ] ) % MODULO )
    return ret
