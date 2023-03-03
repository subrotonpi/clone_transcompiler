def import _readline
import sys
import os
import sys
class b :
    def __init__ ( self ) :
        f = sys.stdin
        lines = f.readlines ( )
        def LINE ( self ) :
            return f.readline ( )
        def STR ( self ) :
            while not lines :
                lines = [ line.rstrip ( ) for line in lines ]
            return lines.pop ( 0 )
        def INT ( self ) :
            return int ( self )
        def LONG ( self ) :
            return long ( self )
        def DOUBLE ( self ) :
            return float ( self )
        def PD ( d , n ) :
            return '%.' + str ( n ) + 'f' * ( d.count ( '.' ) + 1 )
        def main ( self ) :
            return b.go ( )
        def gcd ( a , b ) :
            if b == 0 : return a
            return gcd ( b , a % b )
        def go ( self ) :
            cases = self.INT ( )
            caseno = 1
            while cases :
                N = self.INT ( )
                a = [ _readline ( STR ( ) ) for _ in range ( N ) ]
                g = a [ 0 ] - a [ 1 ]
                ferdig : for i in range ( N - 1 ) :
                    for j in range ( i + 1 , N ) :
                        x = a [ i ] - a [ j ]
                        g = gcd ( g , x )
                        if g == 1 : break ferdig
                res = a [ 0 ] % g
                if res > 0 : res = g - res
                print ( "Case #%d: %s\n" % ( caseno , res ) )
return b
