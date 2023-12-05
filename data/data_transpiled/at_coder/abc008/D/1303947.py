def import import sys , os , sys , traceback
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
    def solve ( self ) :
        with open ( sys.argv [ 1 ] ) as f :
            W , H , N = struct.unpack ( '>IIII' , f.read ( 8 ) )
            x = [ i - 1 for i in range ( N ) ]
            y = [ i - 1 for i in range ( N ) ]
        self.x = x
        self.y = y
        self.hashdict = { }
        self.max = self.dfs ( 0 , 0 , W - 1 , H - 1 )
        print ( self.max )
    def dfs ( w1 , h1 , w2 , h2 ) :
        if w1 > w2 or h1 > h2 :
            return 0
        key = hash ( w1 , h1 , w2 , h2 )
        if key in self.hashdict :
            return self.hashdict [ key ]
        self.max = 0
        for i in range ( N ) :
            if x [ i ] < w1 or w2 < x [ i ] or y [ i ] < h1 or h2 < y [ i ] :
                continue
            earn = ( w2 - w1 ) + ( h2 - h1 ) + 1
            earn += dfs ( w1 , h1 , x [ i ] - 1 , y [ i ] - 1 )
            earn += dfs ( x [ i ] + 1 , h1 , w2 , y [ i ] - 1 )
            earn += dfs ( w1 , y [ i ] + 1 , x [ i ] - 1 , h2 )
            earn += dfs ( x [ i ] + 1 , y [ i ] + 1 , w2 , h2 )
            self.max = max
        self.hashdict [ key ] = self.max
        return self.max
    def hash ( w1 , h1 , w2 , h2 ) :
        return "%s_%s_%s_%s" % ( w1 , h1 , w2 , h2 )
