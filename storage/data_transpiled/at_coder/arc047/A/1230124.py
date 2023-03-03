def _import ( ) : return _fastscan ( )
class Main ( object ) :
    def __init__ ( self ) :
        self._import ( )
        sc = FastScanner ( )
        N = sc.__next__ ( )
        L = sc.__next__ ( )
        s = sc.__next__ ( ) [ 0 ]
        now = 1
        count = 0
        for c in s :
            if c == '+' :
                now += 1
                if now > L :
                    now = 1
                    count += 1
            else :
                now -= 1
        print ( count )
class FastScanner ( object ) :
    def __init__ ( self , debug = None ) :
        self.debug = None
    def __init__ ( self , ptr = 0 ) :
        self.buflen = None
        self.buffer = ''
        self.eos = False
    def has_next_byte ( self ) :
        if self.ptr < self.buflen :
            return True
        else :
            self.ptr = 0
            try :
                if self.debug :
                    self.buflen = len ( self.debug )
                    self.buffer = self.debug.encode ( 'utf-8' )
                    self.eos = True
                else :
                    self.buflen = self.buffer.read ( self.buflen )
            except AttributeError :
                pass
            if self.buflen < 0 :
                self.eos = True
                return False
            elif self.buflen == 0 :
                return False
    def read_byte ( self ) :
        if self.ptr < self.buflen :
            return self.buffer [ self.ptr ]
        else :
            return - 1
    def is_printable_char ( self ) :
        while self.ptr < self.buflen :
            self.ptr += 1
        if self.eos :
            self.eos = False
    def __iter__ ( self ) :
        return iter ( self.buffer )
