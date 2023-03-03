def _import ( ) : return _import ( )
class Main ( object ) :
    def __init__ ( self ) :
        self._fastscan = FastScanner ( )
        self.N = self.N
        self.A = self.A
        self.B = self.B
        h = self._fastscan ( N )
        C = self._fastscan ( N )
        left = self.right = sys.maxint
        while left <= right :
            k = ( self.left + right ) / 2
            count = 0
            for v in h :
                last = v - k * B
                if last > 0 :
                    count += ( last + C - 1 ) / C
            if count > k :
                left = k + 1
            else :
                right = k - 1
        print ( left )
class FastScanner ( object ) :
    debug = None
    def __init__ ( self , stream ) :
        self.stream = stream
        self.ptr = stream.ptr
        self.buflen = stream.buffer
        self.eos = False
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    if self.debug :
                        self.buflen = len ( self.debug )
                        self.debug = ""
                        self.eos = True
                    else :
                        self.buflen = stream.buffer.read ( self.buflen )
                except AttributeError :
                    pass
                if self.buflen < 0 :
                    self.eos = True
                    return False
                elif self.buflen == 0 :
                    return False
        def read_byte ( self ) :
            if self.has_next_byte ( ) :
                return self.buffer [ ptr ]
            else :
                return - 1
        def is_printable_char ( self ) :
            return 33 <= self.peek ( )
        def skip_unprintable ( self ) :
            while self.has_next_byte ( ) and not is_printable_char ( self.buffer [ ptr ] ) :
                ptr += 1
return Main ( )
