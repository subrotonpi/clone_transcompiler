def _import ( ) : return int ( string ( ) )
def _import ( * arrays ) : return [ int ( a ) for a in arrays ]
def _import ( * arrays ) :
    l = [ len ( a ) for a in arrays ]
    for i in range ( l ) :
        for j in range ( l ) :
            arrays [ i ] [ j ] = _import ( i , j )
class _main ( object ) :
    def __init__ ( self ) :
        self.rfile = sys.stdin
        self.wfile = sys.stdout
        self.rfile = light_scanner ( self.rfile )
        self.wfile = sys.stdout
        self.solver = dbig_bang ( )
        self.solve ( 1 , self.rfile , self.wfile )
        self.wfile.close ( )
class _DBig_bang ( _DBig_bang ) :
    def solve ( self , test_number , f , g ) :
        n = self.rfile.ints
        ax , ay = [ ] , [ ]
        bx , by = [ ] , [ ]
        f.args = ( ax , ay )
        f.args = ( bx , by )
        g.args = ( ax , by )
        g.args = ( bx , by )
        g.args = ( ax , ay )
        g.args = ( bx , by )
        g.args = ( ax , ay )
        g.args = ( bx , by )
        g.args = ( ax , ay )
    def d ( self , x1 , y1 , x2 , y2 ) :
        return ( x1 - x2 ) ** 2 + ( y1 - y2 ) ** 2
    def rad ( self , x , y ) :
        xs = _import ( x , y )
        ys = _import ( y , y )
        m = 0
        xs /= len ( x )
        ys /= len ( y )
        for i in range ( len ( x ) ) :
            t = d ( xs , ys , x [ i ] , y [ i ] )
            if t > m :
                m = t
        return m
