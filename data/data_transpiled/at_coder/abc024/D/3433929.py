def _import ( ) : return int ( next ( ) )
def _import ( ) : return next ( )
def _import ( ) : return next ( )
def _import ( ) :
def _import ( ) :
    fc = _import ( )
    A = [ ]
    B = [ ]
    C = [ ]
    print ( solve ( ) )
MOD = 1_000_000_007
def _solve ( ) :
    AdB = _div ( A , B )
    AdC = _div ( A , C )
    rc1 = rev ( sub ( sum ( AdB , AdC ) , 1 ) )
    c1 = mul ( AdB , rc1 )
    r1 = mul ( AdC , rc1 )
    return sub ( r1 , 1 ) + ' ' + sub ( c1 , 1 )
def _mul ( a , b ) :
    return int ( long ( a ) * b % MOD )
def _sum ( a , b ) :
    return int ( ( long ( a ) + b ) % MOD )
def _sub ( a , b ) :
    return ( a + MOD - b ) % MOD
def _div ( a , b ) :
    return _mul ( a , _rev ( b ) )
def _rev ( a ) :
    return _pow ( a , MOD - 2 )
def _pow ( base , exp ) :
    if not exp : return 1
    ans = 1
    base %= MOD
    while exp :
        if exp & 1 == 1 :
            ans = _mul ( ans , base )
        base = _mul ( base , base )
        exp = exp >> 1
    return ans
from itertools import chain
from itertools import repeat
for i in range ( 10 ) :
    if not repeat or i not in repeat :
        try :
            next ( )
        except StopIteration :
            break
    else :
        next ( )
return repeat ( next ( ) )
