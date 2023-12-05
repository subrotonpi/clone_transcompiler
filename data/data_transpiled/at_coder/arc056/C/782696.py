def _import ( ) : return _skip_unprintable ( )
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self.seq = [ ]
        self.N = self.seq.count ( )
        self.K = self.seq.count ( )
        self.w = self.seq.count ( )
        self.n = self.n
        self.dp = [ ]
        self.memo = [ ]
        for state in range ( ( 1 , self.n ) ) :
            for i in range ( self.n ) :
                self.ret.append ( [ self.n [ i ] , self.n [ i ] ] )
    def next_int_list ( self , n ) :
        for i in range ( self.n ) :
            for j in range ( self.n ) :
                if ( ( self.state >> i ) & 1 ) == 1 and ( ( self.state >> j ) & 1 ) == 1 :
                    self.memo [ state ] += self.n [ i ] [ j ]
    for state in range ( ( 1 , self.n ) ) :
        sub = state
        while True :
            if sub != 0 :
                m = self.memo [ state ] - self.memo [ sub ] - self.memo [ state ^ sub ]
                self.dp [ state ] = max ( self.dp [ state ] , K + self.dp [ state ^ sub ] - m )
            sub = ( sub - 1 ) & state
        print ( self.dp [ ( 1 , self.n ) - 1 ] )
class FastScanner ( object ) :
    def __init__ ( self , debug = None ) :
        self.debug = None
        self.stream = sys.stdin
        self.ptr = 0
        self.buflen = 0
        self.buffer = ''
        self.eos = False
        self.has_next_byte = False
    def next_byte ( self ) :
        while self.ptr < self.buflen :
            self.ptr += 1
        return self.buffer [ self.ptr ]
return Main
