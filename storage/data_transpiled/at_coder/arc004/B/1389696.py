def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.argv.count ( 'N' )
    def __init__ ( self ) :
        self.N = sys.argv.count ( 'N' )
    def __init__ ( self ) :
        self.dpmax = [ ]
        self.dpmin = [ ]
        d0 = sys.stdin.read ( )
        self.dpmax.append ( d0 )
        self.dpmin.append ( d0 )
        for i in range ( 1 , N ) :
            d = sys.stdin.read ( )
            self.dpmax [ i ] = self.dpmax [ i - 1 ] + d
            if d >= self.dpmin [ i - 1 ] and d <= self.dpmax [ i - 1 ] :
                pass
            elif d < self.dpmin [ i - 1 ] :
                self.dpmin [ i ] = self.dpmin [ i - 1 ] - d
            else :
                self.dpmin [ i ] = d - self.dpmax [ i - 1 ]
        print ( self.dpmax [ self.N - 1 ] )
        print ( self.dpmin [ self.N - 1 ] )
