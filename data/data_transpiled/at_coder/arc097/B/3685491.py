def _import ( ) : return 33
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.M = 0
        self.p = [ ]
        self.q = [ ]
        for i in range ( 1 , N + 1 ) :
            self.p.append ( self.p [ i ] )
            self.q.append ( self.q [ i ] )
    def read ( self ) :
        if not self.hasNext ( ) : raise StopIteration
        n = False
        if self.n == '-' :
            minus = True
        if self.n < '0' or self.n <= '9' :
            n *= 10
        elif self.n == - 1 or not is_printable_char ( self.n ) :
            return int ( minus ) - n
        else :
            raise ValueError ( )
def unite ( self , x ) :
    if self.n == x :
        return self.q [ self.n ]
    else :
        return self.q [ self.n ]
class _FastScanner ( object ) :
    def __init__ ( self , buffer ) :
        self.buffer = buffer
        self.ptr = 0
        self.buflen = 0
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    self.buflen = self.buffer.read ( self.ptr )
                except AttributeError :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def read ( self ) :
            if self.ptr < self.buflen :
                return self.ptr
            else :
                return - 1
    def write ( self , buffer ) :
        self.buffer = buffer
    def write ( self , buffer ) :
        self.ptr = 0
        self.buflen = 0
    def read ( self , ptr ) :
        if self.ptr < self.buflen :
            return self.ptr
        else :
            return - 1
return Main ( )
