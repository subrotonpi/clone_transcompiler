def _ _ main _ _ ( ) : return 0
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.D1 , self.D2 = [ ] , [ ]
        def __init__ ( self , n ) :
            sc = FastScanner ( self.N )
            self.N = sc.__next__ ( )
            self.D1 = sc.__next__ ( )
            self.D2 = sc.__next__ ( )
            f = open ( '/dev/null' , 'w' )
            for c in solve ( ) :
                f.write ( '%d %d\n' % ( c.x , c.y ) )
            f.flush ( )
    def calc_move ( self ) :
        self.x , self.y = self.x , self.y
    def calc_long ( self ) :
        self.d1 = self.calc ( self.D1 )
        self.d2 = self.calc ( self.D2 )
        answer = [ ]
        for i in range ( 2 * self.N ) :
            for j in range ( 2 * self.N ) :
                if self.d1 [ i ] [ j ] == 1 and self.d2 [ i ] [ j ] == 1 :
                    answer.append ( ( i , j ) )
                    if len ( answer ) == self.N * self.N :
                        return answer
        raise ValueError ( 'wtf : %d' % len ( answer ) )
    def calc ( self ) :
        self.area = [ ]
        ms = self.calc_move ( self.d )
        q = deque ( )
        for i in range ( self.N * self.N ) :
            for j in range ( self.N * self.N ) :
                if self.area [ i ] [ j ] == 0 :
                    run ( i , j , self.area , ms , q )
        return area
    def __init__ ( self ) :
        self.x , self.y = self.x , self.y
    def DX ( self , self , * args ) :
        self.x , self.y = self.x , self.y
        self.DX = DX
    def DY ( self , * args ) :
        self.Y