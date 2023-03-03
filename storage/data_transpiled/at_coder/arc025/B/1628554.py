def import _input
class Main ( object ) :
    def __init__ ( self ) :
        self.H = int ( self.H )
        self.W = int ( self.W )
        self.C = [ [ 0 ] * ( self.W - 1 ) for i in range ( self.H ) ]
    def input ( self ) :
        with open ( self.C , 'r' ) as f :
            self.H = int ( f.read ( ) )
            self.W = int ( f.read ( ) )
            self.C = [ [ 0 ] * ( self.W - 1 ) for i in range ( self.H ) ]
