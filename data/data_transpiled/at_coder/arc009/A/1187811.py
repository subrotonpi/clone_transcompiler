def _import ( ) : return next ( )
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = FastScanner ( )
        self.N = self.sc.randint ( 1 , self.N )
        sum = 0
        for i in range ( self.N ) :
            sum += self.sc.randint ( 1 , self.N ) * self.sc.randint ( 1 , self.N )
        print ( sum * 105 / 100 )
    def __init__ ( self , n ) :
        self.debug = None
        self.stdin = sys.stdin
        self.ptr = 0
        self.buflen = 0
        self.buffer = ''
        self.eos = False
        def has_next_byte ( ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    if self.debug :
                        self.buflen = len ( self.debug )
                        self.buffer = self.debug.read ( self.buflen )
                        self.debug = ''
                        self.eos = True
                    else :
                        self.buflen = self.buffer.read ( self.buflen )
                except IndexError :
                    pass
                if self.buflen < 0 :
                    self.eos = True
                    return False
                elif self.buflen == 0 :
                    return False
            return True
        def read_byte ( self ) :
            if self.ptr < self.buflen :
                return self.buffer [ self.ptr ]
            else :
                return - 1
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( self ) :
            while self.has_next_byte ( ) and not is_printable_char ( self.buffer [ self.ptr ] ) :
                self.ptr += 1
        def is_eos ( self ) :
            return self.eos
        def __iter__ ( self ) :
            return iter ( self )
    def __next__ ( self ) :
        return __next__
