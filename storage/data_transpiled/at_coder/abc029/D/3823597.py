def _import ( ) : return ( b , c )
import sys
import os
import sys
import io
import sys
import io
import readline
import readline
import readline
import readline
import readline
readline = readline
readline = open
class Main ( object ) :
    def __init__ ( self ) :
        self.fh = sys.stdin
        self.fh = sys.stdout
        self.stdout = sys.stdout
        self.readline = readline
        self.stdout = io.stdout
        self.solver = TaskD ( )
        self.solver.solve ( 1 , self.fh , self.stdout )
        readline.close ( )
    def solve ( self , test_number , f , out ) :
        import string
        n = string.ascii_letters [ test_number ]
        digit = len ( n )
        memo = [ [ 0 , 0 , 0 ] for d in range ( digit + 1 ) ]
        for l in range ( 2 ) :
            for o in range ( digit ) :
                lim = '9' if l == 1 else n [ d ]
                for i in range ( '0' , lim + 1 ) :
                    less = ( l == 1 or i < n [ d ] )
                    one = o + ( ( i == '1' ) and 1 or 0 )
                    memo [ d + 1 ] [ less ] [ one ] += memo [ d ] [ l ] [ o ]
        ans = 0
        for l in range ( 2 ) :
            for o in range ( 1 , digit + 1 ) :
                ans += o * memo [ digit ] [ l ] [ o ]
            out.write ( ans )
    def read ( self , f ) :
        self.fh = f
        self.buffer = f
        self.bufpointer = 0
        self.buflength = 0
        return ( self.bufpointer , self.buflength )
