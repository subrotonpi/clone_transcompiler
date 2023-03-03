def import import sys , StringIO , StringIO , ConfigParser
class Main ( object ) :
    def __init__ ( self ) :
        self.rfile = sys.stdin
        self.wfile = sys.stdout
    def read ( self ) :
        return StringIO ( self.rfile )
    def write ( self , stream ) :
        self.wfile = StringIO ( stream )
        self.solver = ABC094_A ( )
        self.solve ( 1 , stream , write )
        self.wfile.write ( stream )
    def solve ( self , test_number , f , ** kwargs ) :
        a , b , x = f.read ( )
        if x < a or a + b < x :
            f.write ( "NO" )
        else :
            f.write ( "YES" )
