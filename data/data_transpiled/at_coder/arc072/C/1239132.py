def _import ( ) : return _sys.stdout.read ( )
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self.N = self.N
        D = self.D
        d = self._long_list ( N )
        Q = self.Q
        q = self._long_list ( Q )
        p = [ D ]
        for i in range ( self.N ) :
            for j in range ( self.N ) :
                ret.append ( _randint ( b ) )
        return ret
    def next_long_table ( self , n ) :
        ret = [ ]
        for i in range ( self.N ) :
            ret.append ( _randint ( b ) )
        return ret
    def next_int_table ( self , n ) :
        ret = [ ]
        for i in range ( self.N ) :
            ret.append ( _randint ( b ) )
        return ret
    def next_int_table ( self , n ) :
        ret = [ ]
        for i in range ( self.N ) :
            ret.append ( _randint ( b ) )
        return ret
    dp = [ 1 ]
    for i in range ( self.N - 1 , - 1 , - 1 ) :
        dp.append ( dp [ i + 1 ] if i >= 0 else dp [ i + 1 ] + d [ i ] )
    s = [ ]
    for v in q :
        if p [ v - 1 ] >= dp [ v ] :
            s.append ( "YES\n" )
        else :
            s.append ( "NO\n" )
    print ( s )
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
        if self.ptr < self.buflen :
            return True
        else :
            ptr = 0
            try :
                if self.debug :
                    self.debug = self.debug
                    self.eos = False
                elif