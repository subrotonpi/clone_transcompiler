def import readline
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stream = sys.stdin
        self.N = int ( self.stream.read ( 1 ) )
        self.S = int ( self.stream.read ( 1 ) )
        self.T = int ( self.stream.read ( 1 ) )
        self.W = int ( self.stream.read ( 1 ) )
        cnt = 0
        if self.W >= S and self.W <= T :
            cnt += 1
        for i in range ( 2 , self.N + 1 ) :
            A = int ( self.stream.read ( 1 ) )
            self.W += A
            if self.W >= S and self.W <= T :
                cnt += 1
        print ( cnt )
class FastScanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
    def read ( self ) :
        self.stream.seek ( 0 )
    def has_next_byte ( self ) :
        if self.ptr < self.buflen :
            return True
        else :
            self.ptr = 0
            try :
                buflen = self.stream.read ( self.ptr )
            except AttributeError :
                pass
            if self.buflen <= 0 :
                return False
        return True
    def read_byte ( self ) :
        if self.ptr < self.buflen :
            return self.stream.read ( self.ptr )
        else :
            return - 1
    def is_printable_char ( c ) :
        return 33 <= c <= 126
    def __iter__ ( self ) :
        while self.ptr < self.buflen and not is_printable_char ( self.stream.read ( self.ptr ) ) :
            self.ptr += 1
        return self.stream.read ( self.ptr )
    def readline ( self ) :
        if not self.stream.read ( 1 ) :
            raise StopIteration
        yield self.stream.read ( 1 )
def get_long ( self ) :
    n = 0
    minus = False
    b = read_byte ( self )
    if b == '-' :
        minus = True
        b = read_byte ( self )
    if