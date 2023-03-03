def _import ( ) : return 0
class A ( object ) :
    def __init__ ( self ) :
        self.n , self.m , self.best , self.ans = 0 , 0 , 0
        self.s = [ ]
        self.a = [ ]
        self.x1 , self.y1 , self.x2 , self.y2 = [ ]
        self.a.append ( ( self.x1 , self.y1 , self.x2 , self.y2 ) )
        self.a.append ( ( self.x1 , self.y1 , self.x2 , self.y2 ) )
    def main ( self ) :
        return max ( abs ( self.x1 - self.x2 ) , abs ( self.y1 - self.y2 ) )
    def dist_from_point ( x , y , p ) :
        self.a = [ ]
        self.n = 1
        for i in range ( 1 , n + 2 ) :
            if not self.used [ i ] and self.a [ i ] [ j ] <= min :
                self.a [ i ] [ j ] = self.a [ i ] [ j ]
                self.a [ i ] [ j ] = ( self.x1 , self.x2 , self.y2 )
        self.a = [ ]
        self.a.append ( ( self.a [ i ] , self.a [ i ] [ j ] ) )
    def solve ( self ) :
        try :
            self.scanner = open ( 'C-large.in' , 'r' )
            self.writer = open ( 'output.txt' , 'w' )
            self.solve ( )
            self.writer.close ( )
        except :
            sys.exit ( 1 )
    def readline ( self ) :
        while self.scanner is None or not self.scanner.closed :
            s = self.readline ( )
            if not s :
                return False
            self.a = [ ]
        return self.a
    def readline ( self ) :
        while self.scanner is None or self.scanner.closed :
            self.scanner.close ( )
    def readline ( self ) :
        return self.a [ 0 ]
    def dist ( self , x , y , p ) :
        return 1
    