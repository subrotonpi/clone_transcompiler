def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.a = [ ]
        self.b = [ ]
        self.dp = [ ]
    def dfs ( self , w , k , x ) :
        self.a = [ ]
        self.b = [ ]
        self.dp = [ ]
        for i in range ( n ) :
            self.a.append ( self.a [ i ] )
            self.b.append ( self.b [ i ] )
        print ( self.dfs ( w , k , n - 1 ) )
    def dfs ( self , w , k , x ) :
        if x < 0 :
            return 0
        if self.dp [ w ] [ k ] [ x ] != 0 :
            return self.dp [ w ] [ k ] [ x ]
        aa = self.dfs ( w , k , x - 1 )
        bb = 0
        if self.w - a [ x ] >= 0 and self.k - 1 >= 0 :
            bb = self.dfs ( self.w - a [ x ] , self.k - 1 , self.x - 1 ) + b [ x ]
        self.dp [ w ] [ k ] [ x ] = max ( aa , bb )
        return self.dp [ w ] [ k ] [ x ]
