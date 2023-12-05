def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.Q = int ( self.Q )
        self.Ans = [ ]
        self.L = [ ]
        self.R = [ ]
        self.T = [ ]
        for i in range ( self.Q ) :
            self.L.append ( _main ( i ) )
            self.R.append ( _main ( i ) )
            self.T.append ( _main ( i ) )
            for j in range ( self.L [ i ] - 1 , self.R [ i ] ) :
                self.Ans.append ( self.T [ j ] )
