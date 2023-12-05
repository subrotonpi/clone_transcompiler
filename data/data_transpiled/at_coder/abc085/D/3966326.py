def _import ( ) : return 33
class Main ( object ) :
    def __init__ ( self ) :
        self.stream = sys.stdin
        self.stream = sys.stdout
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        self.stream.read ( 1 )
    def read ( self ) :
        if not self.stream.read ( 1 ) :
            raise StopIteration
        n = False
        if self.stream.read ( 1 ) == '-' :
            minus = True
        if self.stream.read ( 1 ) == '0' or self.stream.read ( 1 ) == '0' :
            raise ValueError
        while True :
            if self.stream.read ( 1 ) == '0' :
                self.stream.seek ( 0 )
                self.stream.read ( 1 )
        if self.stream.read ( 1 ) == '-' or self.stream.read ( 1 ) == '0' :
            raise ValueError
        return - n if minus else n
    def write ( self , data ) :
        self.stream.seek ( 0 )
        self.stream.read ( 1 )
    def read ( self ) :
        nl = self.stream.read ( 1 )
        if self.stream.read ( 1 ) == '-' :
            raise StopIteration
        return int ( nl )
    def write ( self , data ) :
        self.stream.seek ( 0 )
        self.stream.write ( data )
    def read ( self ) :
        if self.stream.read ( 1 ) == '-' :
            return - 1
        else :
            if self.stream.read ( 1 ) >= self.stream.read ( 1 ) :
                return 1
            else :
                return - 1
class FastScanner ( object ) :
    def __init__ ( self ) :
        self.stream = sys.stdin
    def read ( self , ptr = 0 ) :
        self.stream.seek ( 0 )
        self.stream.read ( ptr )
    def write ( self , data ) :
        self.stream.write ( data )
