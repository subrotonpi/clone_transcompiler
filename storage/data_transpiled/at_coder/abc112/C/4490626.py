def _import ( ) : return _fastscan ( )
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
    def read ( self ) :
        N = self.sc.read ( 1 )
        self.buf = [ ]
        while is_printable_char ( self.buf ) :
            self.buf.append ( self.buf.pop ( 0 ) )
        return self.buf
    def read ( self ) :
        if not self.buf :
            raise StopIteration
        n = False
        if self.buf [ 0 ] == '-' :
            minus = True
            self.buf = [ ]
        if self.buf [ 0 ] < '0' or self.buf [ 1 ] < '9' :
            raise ValueError ( )
        while True :
            if self.buf [ 0 ] <= '9' :
                n *= 10
            elif self.buf [ 0 ] == '-' or not is_printable_char ( self.buf [ 1 ] ) :
                return minus , n
            else :
                raise ValueError ( )
        return ord ( self.buf [ 0 ] )
    def read ( self ) :
        return self.buf [ 0 ]
class Hint ( ) :
    def __init__ ( self , x , y , h ) :
        self.x = x
        self.y = y
        self.h = h
class FastScanner ( object ) :
    def __init__ ( self , stream = sys.stdin ) :
        self.stream = stream
        self.buffer = [ ]
        self.ptr = 0
        self.buflen = 0
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    self.buflen = stream.read ( self.ptr )
                except AttributeError :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def read_bytes ( self ) :
            if self.buf :
                return self.buf [ 0 ]
            else :
                return self.buf
return Main ( )
