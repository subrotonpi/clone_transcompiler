def _import ( ) : return '!'
import sys
import struct
import struct
class Main ( object ) :
    def __init__ ( self ) :
        self.dx = [ 1 , 0 , - 1 , 0 ]
        self.dy = [ 0 , 1 , 0 , - 1 ]
        self.MOD = 1000000007
    def read ( self ) :
        if not self.startswith ( '-' ) :
            raise StopIteration
        n = False
        if self.b == '-' :
            minus = True
        if self.b < '0' or self.b <= '9' :
            n *= 10
        elif self.b == - 1 or not is_printable_char ( self.b ) :
            return - n if minus else n
        else :
            raise ValueError ( )
    def main ( self ) :
        sc = struct.Struct ( 'I' )
        h , w = sc.unpack ( '<H' )
        a = [ [ ] for _ in range ( h + 2 ) ]
        for y in range ( 1 , h + 1 ) :
            for x in range ( 1 , w + 1 ) :
                a [ y ] [ x ] = sc.unpack ( '<B' ) [ 0 ]
        sum = 0
        memo = [ [ ] for _ in range ( h + 2 ) ]
        for y in range ( 1 , h + 1 ) :
            for x in range ( 1 , w + 1 ) :
                sum += dp ( y , x )
                sum %= MOD
        print ( sum )
    def dp ( y , x ) :
        if memo [ y ] [ x ] > 0 :
            return memo [ y ] [ x ]
        result = 1
        for i in range ( 4 ) :
            ny = y + dy [ i ]
            nx = x + dx [ i ]
            if a [ y ] [ x ] < a [ ny ] [ nx ] :
                result = ( result + dp ( ny , nx ) ) % MOD
        return memo [ y ] [ x ] = result
class Scanner ( object ) :
    def __init__ ( self ) :
        self.buffer = ''
        self.ptr = 0
        self.buflen = 0
    def __iter__ ( self ) :
        if self.