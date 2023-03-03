def import _readline
import readline
import readline
import sys
class Main ( readline ) :
    is_debug = False
    fname = 'input.txt'
    def __init__ ( self , mod ) :
        self.MOD = 1000000007
    def solve ( ) :
        ans = ( self.MOD / 10 ) * self.MOD + ( self.MOD / 10 ) * self.MOD
        return int ( ans )
    def next ( ) :
        return readline ( )
    def solve ( ) :
        return ( self.MOD / 10 ) * self.MOD + ( self.MOD / 10 ) * self.MOD
    def read ( ) :
        return readline ( )
    def solve ( ) :
        S = time.time ( )
        sc = ( readline , sys.stdin.fileno ( ) )
        self.solve ( )
        G = time.time ( )
        if is_debug :
            print ( '---Debug--' )
            print ( '%7d ms' % ( G - S ) )
    class FastScanner ( readline ) :
        def __init__ ( self , stream ) :
            self.stream = stream
        def read ( self , stream ) :
            self.stream = stream
        def has_next_byte ( ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    self.buflen = stream.read ( self.BUFFER_SIZE )
                except AttributeError :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def readByte ( self ) :
            if self.ptr < self.buflen :
                return self.stream.read ( self.BUFFER_SIZE )
            else :
                return - 1
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def __iter__ ( self ) :
            while self.ptr < self.ptr :
                yield self.stream.read ( self.BUFFER_SIZE )
    def next ( ) :
        if not self.hasNext ( ) :
            raise StopIteration
        yield None
