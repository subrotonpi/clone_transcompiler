def import import sys
import struct
class Main ( struct.Struct ) :
    def __init__ ( self ) :
        struct.Struct.__init__ ( self )
        self.buf = sys.stdin.read ( )
        self.input = sys.stdin.read ( )
        self.N = struct.Struct.unpack ( self.buf )
        self.print ( self.solve ( self.N ) )
    def solve ( self , n ) :
        if n == 0 : return 1
        if n == 1 : return 2
        if self.n / 2 in self.check :
            a = self.check [ self.n / 2 ]
        else :
            a = self.solve ( self.n / 2 ) % 1000000007
            self.check [ self.n / 2 ] = a
        if self.n / 2 - 1 in self.check :
            b = self.check [ self.n / 2 - 1 ]
        else :
            b = self.solve ( self.n / 2 - 1 ) % 1000000007
            self.check [ self.n / 2 - 1 ] = b
        if self.n % 2 == 1 :
            return ( 2 * a + b ) % 1000000007
        else :
            return ( 2 * b + a ) % 1000000007
