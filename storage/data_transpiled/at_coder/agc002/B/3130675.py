def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.M = int ( self.M )
        self.redable = [ ]
        self.balls = [ 1 for i in range ( self.N ) ]
        self.redable.append ( True )
        for i in range ( self.M ) :
            x = self.balls [ i ] - 1
            y = self.balls [ i ] - 1
            if self.redable [ x ] :
                self.redable [ y ] = True
            self.balls [ x ] -= 1
            self.balls [ y ] += 1
            if self.balls [ x ] == 0 :
                self.redable [ x ] = False
    ans = 0
    for i in range ( self.N ) :
        if self.redable [ i ] :
            ans += 1
        print ( ans )
        return
