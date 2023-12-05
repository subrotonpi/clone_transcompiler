def _import ( ) : return 33
import sys
import struct
from struct import calcsize
from struct import Struct
from struct import calcsize
from struct import Struct
from struct import calcsize
from struct import Struct
from struct import Struct
from struct import calcsize
from struct import Struct
from struct import calcsize
from struct import Struct
from struct import Struct
class Main ( object ) :
    def __init__ ( self ) :
        Struct ( )
    def tr ( self , * args ) :
        self.write ( "" )
    def read ( self ) :
        if not hasNext ( ) :
            raise StopIteration
        n = False
        if self.read ( ) == '-' :
            minus = True
            self.write ( "".join ( self.read ( ) ) )
        else :
            raise Struct ( )
    def read ( self ) :
        nl = unpack ( '<' , self.read ( 1 ) ) [ 0 ]
        x = [ ]
        sum = [ ]
        X = struct.unpack ( '<' , self.read ( 1 ) ) [ 0 ]
        for i in range ( N ) :
            x.append ( struct.unpack ( '<' , self.read ( 1 ) ) [ 0 ] )
        for i in range ( N ) :
            sum.append ( ( sum [ i - 1 ] if i - 1 >= 0 else 0 ) + x [ i ] )
        ans = Struct ( ).size
        out :
        for i in range ( N ) :
            len = N - i
            cur = 0
            cur += X * len
            cur += 2 * ( sum [ N - 1 ] - ( i - 1 >= 0 else 0 ) )
            cntK = 0
            for j in range ( N - 1 , - 1 , - 1 , - 1 ) :
                range = sum [ j ] - ( j - len >= 0 else 0 )
                cur += ( 2 * ( cntK + 1 ) + 1 ) * range
                cntK += 1
                if cur - X * len > 1e15 :
                    continue
                if cur > ans :
                    continue
            ans = min ( ans , cur )
        print ( ans + X * N )
    class Scanner ( ) :
        def __init__ ( self ) :
            self.seek ( 0 )