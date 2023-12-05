def import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.k = 0
        self.a = [ ]
        self.mod_p = 1000000007
    def run ( self ) :
        with open ( self.n ) as infile :
            self.n = int ( infile.read ( ) )
            self.k = int ( infile.read ( ) )
            self.a = [ ]
