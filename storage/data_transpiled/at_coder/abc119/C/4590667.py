def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N , self.A , self.B , self.C = _main ( )
        self.l = [ ]
        for i in range ( self.N ) :
            self.l.append ( _main ( ) )
        print ( self.cost ( 0 , 0 , 0 , 0 ) )
        self.l.append ( _main ( ) )
    def cost ( self , depth , a , b , c ) :
        INF = int ( 10e8 )
        if depth == self.N :
            if a and b and c :
                return abs ( a - A ) + abs ( b - B ) + abs ( c - C ) - 30
            else :
                return INF
        self.pattern0 = self.cost ( self.depth + 1 , a , b , c )
        self.pattern1 = self.cost ( self.depth + 1 , a + self.l [ depth ] , b , c ) + 10
        self.pattern2 = self.cost ( self.depth + 1 , a , b + self.l [ depth ] , c ) + 10
        self.pattern3 = self.cost ( self.depth + 1 , a , b , c + self.l [ depth ] ) + 10
        return min ( min ( self.pattern0 , self.pattern1 ) , min ( self.pattern2 , self.pattern3 ) )
