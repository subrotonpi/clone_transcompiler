def import _solve
import os
import sys
import os
import sys
class B ( object ) :
    def __init__ ( self , s ) :
        self.s = s
        self.k = self.n
        self.n = self.n
    def run ( self ) :
        try :
            self.solve ( )
        except :
            pass
modulo = 10009
if sys.version_info [ 0 ] < 3 :
    s = '+'.join ( [ 'a' ] * modulo for _ in range ( 1 , len ( s ) ) )
else :
    s = ''.join ( [ 'a' ] * modulo for _ in range ( 1 , len ( s ) ) )
if sys.version_info [ 0 ] < 3 :
    s = '+'.join ( [ 'a' ] * modulo for _ in range ( 1 , len ( s ) ) )
else :
    s = ''.join ( [ 'a' ] * modulo for _ in range ( 1 , len ( s ) ) )
tests = int ( sys.version_info [ 0 ] )
for test in range ( 1 , tests + 1 ) :
    s = ( s + '+'.join ( [ 'a' ] * ( k - 1 ) ) ).encode ( 'utf-8' )
    k = int ( sys.version_info [ 0 ] )
    n = int ( sys.version_info [ 1 ] )
    chars = [ [ 0 ] * 26 for _ in range ( n ) ]
    for i in range ( 26 ) :
        s = s [ i ]
        chars [ i ] = 0
        for j in range ( len ( s ) ) :
            chars [ i ] [ j - 'a' ] += 1
    result = [ 0 ] * k
    current = [ 0 ] * 26
    for i in range ( n ) :
        current [ i ] -= 1
def check ( t ) :
    if t > 0 :
        return check ( t )
    if t == k :
        return
    for i in range ( n ) :
        for c in range ( 26 ) :
            current [ i ] += 1
    return True
