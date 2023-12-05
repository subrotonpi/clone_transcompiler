def _import ( ) : return sys.stdin.read ( 1024 )
class Main ( object ) :
    def __init__ ( self , args ) :
        self.buffer = sys.stdin.read ( 1024 )
        self.n = self.buflen = 0
        self.m = self.read ( 1 )
        self.R = self.read ( 1 )
        self.r = [ ]
        for i in range ( self.R ) :
            self.r.append ( self.read ( 1 ) )
    def read ( self ) :
        self.n = self.n
        self.m = self.read ( 1 )
        self.r = [ ]
        for i in range ( self.n ) :
            self.r.append ( self.read ( 1 ) )
        return self.r
    def write ( self , data ) :
        self.n = self.n
        self.m = self.read ( 1 )
        self.r = [ ]
        self.r.append ( data )
    def read ( self ) :
        self.n = self.n
        self.m = self.read ( 1 )
        self.r.append ( data )
        return self.r
    def write ( self , data ) :
        self.r.append ( data )
    def read ( self ) :
        self.n = self.n
        self.m = self.read ( 1 )
        self.r.append ( data )
        return self.r
    def read ( self ) :
        self.n = self.n
        self.m = self.read ( 1 )
        self.r.append ( data )
        return self.r
    def write ( self , data ) :
        self.r.append ( data )
        return self.r
    def read ( self ) :
        self.n = self.n
        self.m = self.read ( 1 )
        self.r.append ( data )
        return self.r
    def read ( self ) :
        self.n = self.n
        self.m = self.read ( 1 )
        self.r.append ( data )
        return self.r
    def write ( self , data ) :
        self.r.append ( data )
        return self.r
