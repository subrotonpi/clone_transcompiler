def _import ( ) : return _import ( )
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self._import ( )
    def __init__ ( self ) :
        sc = FastScanner ( )
        self.N = sc.__next__ ( )
        self.from_list = [ ]
        self.to_list = [ ]
        for i in range ( N - 1 ) :
            self.from_list.append ( sc.__next__ ( ) )
        self.to_list.append ( sc.__next__ ( ) )
    def next_long_list ( self , n ) :
        self.to_list = [ ]
        for i in range ( n ) :
            self.to_list.append ( sc.__next__ ( ) )
        self.live = [ ]
        self.live.append ( True )
        self.live = [ ]
        for i in range ( n ) :
            for j in range ( m ) :
                self.live.append ( i )
        return self.live
    def dfs ( self , self , pre , tree ) :
        ret = 0
        for next in tree [ self.live ] :
            if next != pre :
                v = self.dfs ( next , self , tree )
                if v < 0 :
                    return v
                ret += v
        if self.live :
            return - 1
        else :
            return ( ret + 1 ) % 2
    def pack_u ( self , n , from_list , to_list ) :
        g = [ ]
        p = [ ]
        for f in from_list :
            p.append ( f )
        for t in to_list :
            p.append ( t )
        for i in range ( n ) :
            g.append ( [ p [ i ] , to_list [ i ] ] )
        return g
class FastScanner ( object ) :
    def __init__ ( self ) :
        self.debug = None
        self._import ( )
        self._import ( )
        self._import ( )
        self._import ( )
