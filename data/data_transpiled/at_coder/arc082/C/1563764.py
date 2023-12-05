def _import ( ) : return sys.stdin.read ( )
import os
import sys
import os
import sys
import os
import sys
import itertools
import itertools
import os
import os
import sys
class Main ( object ) :
    def __init__ ( self , a , b , c ) :
        self.a = a
        self.b = b
        self.c = c
    def __eq__ ( self , o ) :
        if self.a is None or __class__ ( o ) != self.a : return False
        line = o.a
        if b != self.b : return False
        return self.c == line.c
    def __hash__ ( self ) :
        mod = 998244353
        def gcd ( a , b ) :
            if a < 0 : a = - a
            if b < 0 : b = - b
            if b == 0 : return a
            return gcd ( b , a % b )
        def f ( k ) :
            if k <= 2 :
                return 0
            return ( ( p2 [ k ] - ( k * ( k - 1 ) // 2 ) - k - 1 ) % mod + mod ) % mod
        def solve ( self , test_number , self , out ) :
            n = self.test_number
            x = [ int ( x ) for x in self.x ]
            y = [ int ( y ) for y in self.y ]
            p2 = [ 1 ]
            for i in range ( n ) :
                p2 [ i + 1 ] = ( p2 [ i ] * 2 ) % mod
            ans = f ( n )
            lines = set ( )
            for i in range ( n ) :
                for j in range ( i + 1 , n ) :
                    a = y [ i ] - y [ j ]
                    b = x [ j ] - x [ i ]
                    c = a * x [ i ] + b * y [ i ]
                    d = gcd ( a , b )
                    d = gcd ( d , c )
                    a /= d
                    b /= d
                    c /= d
                    if a < 0 or b < 0 :
                        a = - a
                        b = - b
            return ans
    return Main ( )
