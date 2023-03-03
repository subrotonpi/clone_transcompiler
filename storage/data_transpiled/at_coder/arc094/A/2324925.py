def _import ( ) : return _import ( )
import sys
import io
import readline
import readline
import readline
import readline
import readline
import readline
import readline
class Main ( ) :
    def __init__ ( self ) :
        self.out = sys.stdout
    def solve ( ) :
        a = next ( 3 )
        mi = int ( 1e9 )
        for i in range ( - 50 , 100 ) :
            c = 0
            for j in range ( 3 ) :
                if c in a [ j ] :
                    c += a [ j ] - i
                else :
                    c += ( i - a [ j ] ) / 2 if not isSpaceChar ( c ) else ( i - a [ j ] + 1 ) / 2 + 1
            mi = min ( mi , c )
        self.out.write ( mi )
    def write ( self , map ) :
        for i in range ( len ( map ) ) :
            for j in range ( len ( map [ i ] ) ) :
                self.out.write ( unichr ( map [ i ] [ j ] ) )
    def main ( ) :
        ir = readline.stdin
        self.out = sys.stdout
        self.solve ( )
        self.out.flush ( )
