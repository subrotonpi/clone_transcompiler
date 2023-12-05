def _ ( x ) : return x
class SC ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        self.N = sc.__next__ ( )
        self.M = sc.__next__ ( )
        self.path = [ [ True ] * N for i in range ( self.M ) ]
        self.visited = [ [ False ] * N for i in range ( self.N ) ]
        self.ans = 0
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = sc.__next__ ( )
            self.M = sc.__next__ ( )
            self.path = [ [ True ] * N for i in range ( self.N ) ]
            self.visited = [ [ False ] * N for i in range ( self.M ) ]
            self.path [ self.N ] [ self.M ] = True
            self.path [ self.N ] [ self.M ] = True
            self.path [ self.N ] [ self.M ] = True
        def dfs ( self ) :
            for i in range ( self.N ) :
                if not self.visited [ i ] and self.path [ v ] [ i ] :
                    self.path [ v ] [ i ] = False
                    self.path [ v ] [ i ] = False
                    self.visited [ i ] = True
                    self.dfs ( i )
                elif self.visited [ i ] and self.path [ v ] [ i ] :
                    self.path [ v ] [ i ] = False
                    self.path [ v ] [ i ] = False
                    self.OK = False
    class SC ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            self.tokens = None
        def __call__ ( self , * args ) :
            sc.next = None
            self.tokens = None
        def __call__ ( self , * args ) :
            if not self.tokens or not self.tokens :
                try :
                    self.tokens = self.tokens
                except AttributeError :
                    raise AttributeError ( 'tokens are not defined' )
            return __call__ ( self , * args )
    