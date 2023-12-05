def _ _ init _ _ ( ) : return
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = FastScanner ( )
        self.n = self.sc.read ( )
        self.m = self.sc.read ( )
        self.a = [ ]
        self.buflen = 0
        self.hasNextByte = False
        self.b = [ ]
        for i in range ( self.m - 1 , - 1 , - 1 ) :
            self.a.append ( self.sc.read ( ) )
            self.b.append ( self.sc.read ( ) )
    def read ( self ) :
        self.buflen = 0
        if self.b == '-' :
            self.minus = True
        elif self.b == '' or not self.isPrintableChar ( self.b ) :
            self.ptr += 1
        else :
            raise ValueError ( )
        self.b = self.readByte ( )
    def read ( self ) :
        self.buflen = 0
        while self.b == '' :
            self.b = self.readByte ( )
        return self.b
    def read ( self ) :
        self.buflen = 0
    def write ( self , data ) :
        self.b = data
    def read ( self ) :
        self.buflen = 0
    def write ( self , data ) :
        self.b = data
    def read ( self ) :
        self.buflen = 0
    def read ( self ) :
        self.ptr += 1
    def write ( self , data ) :
        self.b = data
    def read ( self ) :
        self.buflen = 0
    def read ( self ) :
        self.ptr += 1
    def write ( self , data ) :
        self.b = data
    def read ( self ) :
        self.buflen = 0
    def read ( self ) :
        self.ptr += 1
    def write ( self , data ) :
        self.b = data
    def read ( self ) :
        self.ptr += 1
    def write ( self , data ) :
        self.write ( data )
    return write , read
