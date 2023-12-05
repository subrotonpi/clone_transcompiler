def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.stick = set ( )
        self.dupli = [ ]
        self.dupli.append ( 0 )
        for i in range ( self.N ) :
            inp = int ( self.dupli [ i ] )
            if not ( stick.add ( inp ) ) :
                self.dupli.append ( inp )
                self.stick.remove ( inp )
        self.dupli.sort ( )
        ans = self.dupli [ N - 1 ]
        ans *= self.dupli [ N - 2 ]
        print ( ans )
