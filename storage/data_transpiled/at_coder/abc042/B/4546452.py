def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = self.L
        self.L = self.L
    def inputs ( self ) :
        self.inputs = [ ]
        for i in range ( self.N ) :
            self.inputs.append ( self.inputs [ i ] )
        self.inputs.sort ( )
        output = ''.join ( self.inputs )
        print ( output )
