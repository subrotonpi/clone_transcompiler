def import readline
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = FastScanner ( sys.stdin )
        N = sc.__next__ ( )
        if N % 2 == 0 :
            print ( N / 2 )
            for i in range ( N / 2 ) :
                print ( 2 )
        else :
            print ( ( N - 1 ) / 2 + 1 )
            print ( 1 )
            for i in range ( ( N - 1 ) / 2 ) :
                print ( 2 )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
        def read ( self ) :
            self.stream.seek ( 0 )
            self.stream.seek ( 0 )
        def has_next_byte ( self ) :
            if self.stream.seek ( 0 ) :
                return True
            else :
                self.stream.seek ( 0 )
                try :
                    self.stream.read ( self.stream.tell ( ) )
                except IOError :
                    pass
                if self.stream.tell ( ) <= 0 :
                    return False
            return True
        def readByte ( self ) :
            if self.stream.read ( 1 ) :
                return self.stream.read ( 1 )
            else :
                return - 1
        def isPrintableChar ( c ) :
            return 33 <= c <= 126
        def __iter__ ( self ) :
            while self.stream.read ( 1 ) and not isPrintableChar ( self.stream.read ( 1 ) ) :
                self.stream.seek ( 0 )
            return True
        def next ( self ) :
            if not self.stream.read ( 1 ) :
                raise StopIteration
            yield self.stream.read ( 1 )
    def read ( self ) :
        if self.stream.read ( 1 ) == b'' :
            return - b if self.stream.tell ( ) < b else b
        else :
            raise StopIteration
return Main ( )
