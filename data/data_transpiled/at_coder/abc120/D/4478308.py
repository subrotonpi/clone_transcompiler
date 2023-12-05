def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.parent = [ ]
        self.size = [ ]
        self.N , self.M = self.N , self.M
        self.A , self.B = [ ] , [ ]
        self.ans = [ ]
        for i in range ( self.M ) :
            self.A.append ( self.A [ i ] )
            self.B.append ( self.B [ i ] )
        self.UnionFindTree ( self.N )
        self.ans.append ( long ( self.N * ( self.N - 1 ) ) / 2 )
        for i in range ( self.M - 1 , 1 , - 1 ) :
            if not self.same ( self.A [ i ] , B [ i ] ) :
                self.count += long ( self.size [ self.find ( A [ i ] ) ] ) * self.size [ self.find ( B [ i ] ) ]
            self.ans.append ( count )
            self.union ( self.A [ i ] , B [ i ] )
        for i in range ( 1 , self.M ) :
            print ( long ( self.N * ( self.N - 1 ) ) / 2 - self.ans [ i ] )
        print ( long ( self.N * ( self.N - 1 ) ) / 2 )
    def UnionFindTree ( self , Size ) :
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
                self.parent.append ( x_root )
                self.size.append ( self.size [ x_root ] )
    def Find ( self , x ) :
        if x != self.parent :
            self.parent = self.parent
        return self.parent
    