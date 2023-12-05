def _import ( * args ) : return sys.stderr.write ( "\n".join ( args ) )
class Main ( object ) :
    def __init__ ( self ) :
        self.stream = sys.stdin
        self.stream = sys.stdout
        self.k = self.stream.read ( 1 )
        self.n = self.stream.read ( 1 )
        self.ret = [ ]
        if self.k == 1 :
            for i in range ( self.n + 1 ) :
                self.ret.append ( 1 )
        elif self.k % 2 == 0 :
            self.ret.append ( self.k / 2 )
            for i in range ( 1 , self.n ) :
                self.ret.append ( self.k )
        else :
            for i in range ( self.n ) :
                self.ret.append ( self.k )
        self.shouldback = self.n / 2
        pos = self.n - 1
        while self.shouldback > 0 :
            self.shouldback -= 1
            self.ret [ pos ] -= 1
            if self.ret [ pos ] == 0 :
                pos -= 1
            else :
                for tp in range ( pos + 1 , self.n ) :
                    self.ret [ tp ] = self.k
                pos = self.n - 1
        for i in range ( self.n ) :
            if self.ret [ i ] == 0 :
                break
            if i >= 1 :
                self.stream.write ( " " )
            self.stream.write ( self.ret [ i ] )
        self.stream.write ( "\n" )
        self.stream.flush ( )
    def _solve_bf ( self ) :
        dfs ( [ ] )
        self.list.sort ( lambda x , y : cmp ( x [ 0 ] , y [ 0 ] ) )
        for l in range ( 1 , self.k + 1 ) :
            ll = [ x [ l ] for x in self.list ]
            dfs ( ll )
    def _solve_bf ( self ) :
        if len ( self.ho ) > self.n :
            return
        self.list = _solve_bf ( self )
