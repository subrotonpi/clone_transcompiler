def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.parent = [ ]
        self.size = [ ]
        self.N , self.M = self.N , self.M
        self.A , self.B = [ ] , [ ]
        self.ans = [ ]
        for i in range ( self.M + 1 ) :
            self.A.append ( self.A [ i ] )
            self.B.append ( self.B [ i ] )
        self.UnionFindTree ( self.N )
        self.ans.append ( 0 )
        count = 0
        for i in range ( self.M - 1 , - 1 , - 1 ) :
            if not self.same ( A [ i ] , B [ i ] ) :
                count += long ( self.size [ self.find ( A [ i ] ) ] ) * self.size [ self.find ( B [ i ] ) ]
            self.ans.append ( count )
            self.union ( A [ i ] , B [ i ] )
        for j in range ( 1 , self.M + 1 ) :
            print ( long ( self.N * ( self.N - 1 ) / 2 - self.ans [ j ] ) )
class UnionFindTree ( int ) :
    def __init__ ( self , Size ) :
        self.parent = [ ]
        self.size = [ ]
        for i in range ( 1 , self.Size + 1 ) :
            self.MakeSet ( i )
    def MakeSet ( self , x ) :
        self.parent.append ( x )
        self.size.append ( 1 )
    def Union ( self , x , y ) :
        if x == y :
            pass
        else :
            ( x_root , y_root ) = self.Find ( x )
            if x_root != y_root :
                self.parent [ y_root ] = x_root
                self.size [ x_root ] += self.size [ y_root ]
    def Find ( self ) :
        if x != self.parent [ x ] :
            self.parent [ x ] = self.find ( self.parent [ x ] )
        return self.parent [ x ]
