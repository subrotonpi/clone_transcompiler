def _import ( ) : return sys.stdin.read ( )
def _import ( stream , filter = None ) : return filter
def _import ( stream , filter = None ) : return filter
def _import ( stream , filter = None ) : return filter
def _import ( stream , filter = None ) : return filter
def _import ( stream , filter = None ) : return filter
def _import ( stream , filter = None ) : return filter
def _import ( stream , filter = None ) : return filter
def _import ( stream , filter = None ) :
    stream = sys.stdin
    stream = sys.stdout
    reader = _import ( stream , filter )
    writer = _import ( stream , filter )
    solver = ARightTriangle ( )
    solver.solve ( 1 , reader , writer )
    stream.close ( )
class ARightTriangle ( object ) :
    def solve ( self , test_number , stream , writer ) :
        a , b , c = stream.read ( )
        area = int ( 0.5 * a * b )
        writer.write ( area )
class _import ( stream , filter = _import ) :
    def __init__ ( self , stream , writer = None ) :
        self.stream = stream
        self.writer = writer
    def write ( self , stream ) :
        self.stream.write ( stream )
    def _import ( self , stream ) :
        self.stream.write ( stream )
    def _import ( self , stream ) :
        self.stream.write ( stream )
    def read ( self ) :
        if not self.stream.read ( ) :
            raise EOFError
        if self.stream.read ( ) >= self.stream.read ( ) :
            self.stream.read ( )
        return self.stream.read ( )
    def _import ( stream , filter = None ) :
        if filter is not None :
            return filter ( lambda x : x in filter )
        return _import ( stream , filter )
