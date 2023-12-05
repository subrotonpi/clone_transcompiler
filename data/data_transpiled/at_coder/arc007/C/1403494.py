def _import ( ) : return _import ( '' )
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self.N = len ( '' )
    def __init__ ( self , * args ) :
        super ( Main , self ).__init__ ( * args )
        sc = FastScanner ( )
        c = sc.next ( ).decode ( 'utf-8' )
        N = len ( c )
        code = [ ]
        code.append ( encode ( c ) )
        for i in range ( 1 , N ) :
            code.append ( rot ( code [ i - 1 ] ) )
        ret = dfs ( code [ 0 ] , 0 , 1 )
        print ( ret )
    def dfs ( self , n , m ) :
        if self.now == 0 :
            return self.depth
        if self.shift == N :
            return sum ( [ v for v in self.code [ i ] if v ] )
        min = sum ( [ v for v in self.code [ i ] if v ] )
        return min
    def rot ( self , x ) :
        flg = ( x & ( 1 << ( N - 1 ) ) ) != 0
        return ( ( x << 1 ) & ( ( 1 << N ) - 1 ) ) | ( flg and 1 or 0 )
    def encode ( self ) :
        x = 0
        for v in self.code :
            x <<= 1
            if v == 'x' :
                x |= 1
        return x
class FastScanner ( object ) :
    def __init__ ( self , debug = None ) :
        self.debug = None
    def __init__ ( self , ptr = 0 ) :
        self.buflen = 0
    def buffer ( self ) :
        self.eos = False
    def has_next_byte ( self ) :
        if ptr < self.buflen :
            return True
        else :
            ptr = 0
            try :
                if self.debug :
                    self.buflen = self.debug.decode ( 'utf-8' )
                    self.debug = ''
                    self.eos = True
                else :
                    self.buflen = self.debug.decode ( 'utf-8' )
    