def _import ( ) : return sys.stdin.read ( 1 << 15 )
import io
import struct
import sys
class Main ( ) :
    def solve ( self ) :
        n , m = ni ( ) , ni ( )
        dis = [ ]
        for arr in dis :
            arr.append ( int ( arr ) / 10 )
        for i in range ( n ) :
            dis [ i ] = 0
        for i in range ( m ) :
            a , b , c = ni ( ) - 1 , ni ( ) - 1 , ni ( )
            dis [ a ] [ b ] = c
        for k in range ( n ) :
            for i in range ( n ) :
                for j in range ( n ) :
                    dis [ i ] [ j ] = min ( dis [ i ] [ j ] , dis [ i ] [ k ] + dis [ k ] [ j ] )
        for i in range ( n ) :
            for j in range ( i + 1 , n ) :
                sum += dis [ i ] [ j ]
    def read ( self ) :
        self._import ( )
        return self._import ( )
    def write ( self , data ) :
        self._import ( )
        self._import ( )
        self._import ( )
        self._import ( )
        self._import ( )
        self._sys = sys.stdout = None
    def write ( self , data ) :
        self._sys = sys.stdout = None
        self._sys = None
    def read ( self , data ) :
        self._sys = None
        self._sys = None
        self._sys = None
    def write ( self , data ) :
        self._sys = None
        self._sys = None
        self._sys = None
