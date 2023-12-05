def _import ( ) : return sys.stdin.read ( 1024 )
class Main ( object ) :
    def __init__ ( self , args ) :
        super ( Main , self ).__init__ ( )
        self.args = args
    def read ( self ) :
        sc = FastScanner ( )
        self.H = sc.read ( 1 )
        self.W = sc.read ( 1 )
        self.N = sc.read ( 1 )
        self.x = [ - 1 , - 1 , 0 , 0 , 0 , 1 , 1 , 1 ]
        self.y = [ - 1 , 0 , 1 , - 1 , 0 , 1 , - 1 , 0 , 1 ]
        self.n = 0
        self.b = self.read_byte ( )
        if self.b == '-' :
            self.n *= 10
        elif self.b == '' or not is_printable_char ( self.b ) :
            return int ( self.n )
        else :
            raise ValueError ( )
    b = read_byte ( )
    for i in range ( self.N ) :
        a = int ( sc.read ( 1 ) )
        b = int ( sc.read ( 1 ) )
        for j in range ( 9 ) :
            if 1 < a + x [ j ] < H and 1 < b + y [ j ] < W :
                p = ( a + x [ j ] , b + y [ j ] )
                if p in self.map :
                    self.map [ p ] = self.map [ p ] + 1
                else :
                    self.map [ p ] = 1
        self.ans = [ ]
        for pa in self.map :
            j = self.map [ pa ]
            self.ans.append ( j )
        print ( long ( self.H - 2 ) * long ( self.W - 2 ) - len ( self.map ) )
        for i in range ( 1 , 10 ) :
            print ( self.ans [ i ] )
class FastScanner ( object ) :
    def __init__ ( self ) :
        self.stream = sys.stdin
