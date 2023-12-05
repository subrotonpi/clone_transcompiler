def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.m = int ( self.m )
        self.jwels = [ 0 ] * m
        self.total = 0
        for l , r , s in __main__.items ( ) :
            self.jwels [ l - 1 ] += s
            if r - 1 < m - 1 :
                self.jwels [ r ] -= s
            self.total += s
        for i in range ( 1 , m ) :
            self.jwels [ i ] += self.jwels [ i - 1 ]
        self.jwels.sort ( )
        print ( self.total - self.jwels [ 0 ] )
