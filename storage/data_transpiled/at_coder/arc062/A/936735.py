def _import ( ) : return 2 << 29
class Main ( ) :
    def __init__ ( self ) :
        self.MOD = 2 << 29
    def read ( self ) :
        sc = FastScanner ( )
        N = sc.read ( )
        A = 1
        B = 1
        for i in range ( N ) :
            T = sc.read ( )
            U = sc.read ( )
            MA = A / T + ( A % T == 0 )
            MB = B / U + ( B % U == 0 )
            max = max ( MA , MB )
            A = T * max
            B = U * max
        print ( ( A + B ) )
class FastScanner ( object ) :
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
                    buflen = self.buffer.read ( self.buflen )
                except AttributeError :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def read_byte ( self ) :
            if self.ptr < self.buflen :
                return self.ptr
            else :
                return - 1
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( self ) :
            while self.ptr < self.buflen and not is_printable_char ( self.buffer [ self.ptr ] ) :
                self.ptr += 1
        def __next__ ( self ) :
            return self.ptr
        def __next__ ( self ) :
            return self.ptr
    def __iter__ ( self ) :
        if not self.hasNext ( ) :
            raise StopIteration
