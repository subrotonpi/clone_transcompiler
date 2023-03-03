def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.K = int ( self.K )
        l = [ ]
        ans = 0
        for i in range ( self.N ) :
            l.append ( _main ( self ) )
        l.sort ( )
        for i in range ( self.K ) :
            ans += l [ ( self.N - 1 ) - i ]
        print ( ans )
