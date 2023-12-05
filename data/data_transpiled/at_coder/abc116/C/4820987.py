def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.flowers = [ _main.get ( self.flowers [ k ] ) for k in range ( self.N ) ]
    def run ( self ) :
        self.flowers.append ( _main.get ( self.flowers [ k ] ) )
