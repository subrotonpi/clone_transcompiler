def _import ( ) : return sys.stdin.read ( )
class Main ( object ) :
    def __init__ ( self , f ) :
        self.f = f
        self.out = sys.stdout
        self.solve ( )
        self.out.close ( )
    def solve ( self ) :
        n = ord ( self.f.read ( 1 ) )
        x = ord ( self.f.read ( 1 ) )
        a , b = [ ] , [ ]
        if self.f.read ( 1 ) == '-' :
            return - ret
        while True :
            ret = ret * 10 + self.f.read ( 1 )
            if self.f.read ( 1 ) == '.' :
                while self.f.read ( 1 ) == '-' :
                    self.f.write ( self.f.read ( 1 ) )
        if self.f.read ( 1 ) == '-' :
            return - ret
    def fill_buffer ( self ) :
        self.f.seek ( 0 , 0 )
        self.f.read ( 1 )
    def read ( self ) :
        self.f.seek ( 0 , 0 )
        self.f.read ( 1 )
    def write ( self , buf ) :
        self.f.write ( buf )
    def read ( self , n ) :
        self.f.seek ( 0 , 0 )
        self.f.read ( n )
    def write ( self , buf ) :
        self.f.write ( buf )
    def read ( self , n ) :
        self.f.read ( n )
    def write ( self , buf ) :
        self.f.write ( buf )
    def readline ( self ) :
        self.f.readline ( )
