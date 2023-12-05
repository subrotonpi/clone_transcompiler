def import readline
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = FastScanner ( sys.stdin )
        N = sc.__next__ ( )
        maxname = ""
        max = 0
        sum = 0
        for S in sc.split ( ) :
            p = sc.__next__ ( )
            sum += p
            if p > max :
                max = p
                maxname = S
        if max * 2 > sum :
            print ( maxname )
        else :
            print ( "atcoder" )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
        def read ( self ) :
            self.stream.seek ( 0 , os.SEEK_END )
            self.stream.seek ( 0 , os.SEEK_SET )
            self.stream.seek ( 0 , os.SEEK_SET )
            self.stream.read ( )
        def has_next_byte ( self ) :
            if self.stream.read ( ) < self.stream.tell ( ) :
                return True
            else :
                self.stream.seek ( 0 , os.SEEK_SET )
                self.stream.read ( self.stream.tell ( ) )
        def has_next_byte ( self ) :
            if self.stream.read ( ) < self.stream.tell ( ) :
                return True
            else :
                self.stream.seek ( 0 , os.SEEK_SET )
                self.stream.read ( self.stream.tell ( ) )
        def has_next_byte ( self ) :
            if self.stream.read ( ) < self.stream.tell ( ) :
                return True
            else :
                self.stream.seek ( 0 , os.SEEK_SET )
                return False
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def next ( self ) :
            while self.stream.read ( ) < self.stream.tell ( ) :
                self.stream.write ( c )
            return True
        def is_printable_char ( c ) :
            if self.stream.read ( ) < self.stream.tell ( ) :
                return False
            else :
                raise StopIteration
    return Main ( )
