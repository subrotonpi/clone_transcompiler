def import solve
import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.solve ( )
    def solve ( self ) :
        with open ( 'input.txt' , 'r' ) as sc :
            n = len ( sc.read ( ) )
            s = [ sc.read ( ) ]
            t = 'abcdefghijklmnopqrstuvwxyz'
            for i in range ( n ) :
                s.append ( sc.read ( ) )
    num = [ [ ] for i in range ( n ) ]
    for i in range ( 26 ) :
        for j in range ( len ( s [ i ] ) ) :
            num [ i ] [ ord ( s [ i ] ) - ord ( 'a' ) ] += 1
    ans = [ ]
    for i in range ( 26 ) :
        ans.append ( num [ 0 ] [ i ] )
        for j in range ( 1 , n ) :
            ans [ i ] = min ( ans [ i ] , num [ j ] [ i ] )
    for i in range ( 26 ) :
        for j in ans [ i ] :
            sys.stdout.write ( t [ i ] )
    sys.stdout.write ( '\n' )
