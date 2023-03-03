def _import ( ) : return sys.stdin.read ( )
class Main ( object ) :
    def __init__ ( self ) :
        self._fast_reader = _fast_reader ( )
        self.R = self._read_char ( )
        self.C = self._read_char ( )
        self.k = self._read_char ( )
        self.n = self._read_char ( )
        self.r = [ ]
        self.c = [ ]
        self.sum_r = { }
        self.sum_c = { }
        for i in range ( self.n ) :
            self.r.append ( self._read_char ( ) )
            self.c.append ( self._read_char ( ) )
            self.sum_r [ self.r [ i ] ] += 1
            self.sum_c [ self.c [ i ] ] += 1
        self.r_cnt = { }
        for i in range ( self.R ) :
            self.r_cnt [ self.r_cnt [ i ] ] += 1
        self.c_cnt = { }
        for i in range ( self.C ) :
            self.c_cnt [ self.c_cnt [ i ] ] += 1
        self.ans = 0
        for i in range ( self.k ) :
            self.ans += long ( self.r_cnt [ i ] ) * self.c_cnt [ self.k - i ]
        for i in range ( self.n ) :
            if self.sum_r [ self.r_cnt [ i ] ] + self.sum_c [ self.c [ i ] ] == k :
                self.ans -= 1
            if self.sum_r [ self.r_cnt [ i ] ] + self.sum_c [ self.c [ i ] ] == k + 1 :
                self.ans += 1
        print ( self.ans )
class FastScanner ( object ) :
    def __init__ ( self ) :
        self._buffer = [ ]
    def __init__ ( self ) :
        self._buffer = [ ]
        self.ptr = 0
        self.buflen = 0
    def has_next_byte ( self ) :
        if self.ptr < self.buflen :
            return True
        else :
            self.ptr = 0
