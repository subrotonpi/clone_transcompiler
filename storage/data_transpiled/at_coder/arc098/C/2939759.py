def _import ( ) : return next ( )
import sys
from io import BytesIO
import readline
import readline
import readline
import readline
import readline
import sys
class Main ( readline ) :
    def __init__ ( self ) :
        readline.parse_and_bind ( '' )
        self.N = int ( readline.readline )
        self.K = int ( readline.readline )
        self.Q = int ( readline.readline )
        self.A = readline.split ( )
        print ( self.solve ( ) )
    def solve ( self ) :
        S = [ i for i in self.A ]
        S.sort ( )
        ans = sys.maxint
        for a in S :
            ans = min ( self.calc ( a ) , ans )
        return ans
    def calc ( min ) :
        values = [ ]
        cur = [ ]
        for i in range ( N ) :
            if i < min :
                if len ( cur ) >= K :
                    cur.sort ( key = lambda x : x [ 1 ] )
                    for j in range ( len ( cur ) - K + 1 ) :
                        values.append ( cur [ j ] )
                cur = [ ]
            else :
                cur.append ( A [ i ] )
        if len ( cur ) >= K :
            cur.sort ( key = lambda x : x [ 1 ] )
            for j in range ( len ( cur ) - K + 1 ) :
                values.append ( cur [ j ] )
        values.sort ( key = lambda x : x [ 1 ] )
        if len ( values ) < Q :
            return sys.maxint
        else :
            max = values [ Q - 1 ]
            return max - min
    @ readline
    def readline ( ) :
        readline.parse_and_bind ( '' )
        try :
            readline.parse_and_bind ( '' )
        except :
            readline.parse_and_bind ( '' )
            raise
        return readline
