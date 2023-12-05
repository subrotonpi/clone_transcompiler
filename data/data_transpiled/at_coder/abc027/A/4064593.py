def import struct
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        num = [ sc.randint ( 0 , 3 ) for i in range ( 3 ) ]
        num.sort ( )
        if num [ 0 ] == num [ 1 ] :
            print ( num [ 2 ] )
        else :
            print ( num [ 0 ] )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
        def read ( self ) :
            self.stream.seek ( 0 , os.SEEK_END )
            self.stream.seek ( 0 , os.SEEK_SET )
        def has_next_byte ( self ) :
            if self.stream.read ( self.stream.tell ( ) ) < self.stream.tell ( ) :
                return True
            else :
                self.stream.seek ( self.stream.tell ( ) )
                self.stream.seek ( self.stream.tell ( ) )
            if self.stream.tell ( ) <= self.stream.tell ( ) :
                return False
        def read ( self ) :
            if self.stream.tell ( ) == self.stream.tell ( ) :
                return self.stream.read ( self.stream.tell ( ) )
            else :
                return - 1
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def __iter__ ( self ) :
            while self.stream.tell ( ) == self.stream.tell ( ) :
                self.stream.seek ( self.stream.tell ( ) )
            return True
        def next ( self ) :
            if not self.stream.tell ( ) == self.stream.tell ( ) :
                raise StopIteration
            yield self.stream.read ( self.stream.tell ( ) )
    def read ( self ) :
        nl = next ( self )
        if b == '-' :
            minus = True
            b = self.stream.read ( self.stream.tell ( ) )
        if b < '0' or b > '9' :
            raise ValueError
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b ==