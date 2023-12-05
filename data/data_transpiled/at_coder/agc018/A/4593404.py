def _import ( ) : return 33
import sys
import struct
import math
class Main ( object ) :
    def solve ( self , f , out ) :
        n , k = struct.unpack ( '>I' , f.read ( 1 ) )
        balls = [ ]
        max = sum ( [ ord ( c ) for c in range ( n ) ] )
        for i in range ( n ) :
            balls.append ( ord ( c ) )
            max = max ( max , balls [ i ] )
        out.write ( 'POSSIBLE' if k <= max and k % gcd ( balls ) == 0 else 'IMPOSSIBLE' )
    def close ( self ) :
        try :
            self.close ( )
        except :
            pass
def gcd ( * ar ) :
    t , length = 1 , len ( ar ) , temp
    while t <= length :
        for i in range ( 0 , length , ( t << 1 ) ) :
            if i + t < length :
                temp = 0
                while ( temp % ar [ i + t ] != 0 ) :
                    ar [ i ] , temp = ar [ i + t ] , temp
                ar [ i ] , temp = ar [ i + t ] , temp
        t = t << 1
    return ar
def write ( * ar ) :
    print ( "".join ( map ( lambda x : chr ( x ) , ar ) ) , file = sys.stderr )
def main ( ) :
    f = open ( sys.stdin , "w" )
    out = open ( sys.stdout , "w" )
    main = Main ( )
    main.solve ( f , out )
    f.close ( )
    out.close ( )
class FastScanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.stream = stream
        self.length , p = 0 , 0
    def has_next_byte ( self ) :
        if p < length : return True
        else :
            p = 0
            try : length = stream.read ( p )
            except : pass
            if length <= 0 : return False
        return True
    def read_bytes ( self ) :
        return bytes
