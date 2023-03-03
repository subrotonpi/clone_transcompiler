def _main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = 0
            self.W = 0
            self.a = [ ]
            self.b = [ ]
            self.maxA = 0
            self.maxB = 0
            for i in range ( self.N ) :
                self.a.append ( self.a [ i ] )
                self.b.append ( self.b [ i ] )
                self.maxA = max ( self.a [ i ] , self.maxA )
                self.maxB = max ( self.b [ i ] , self.maxB )
    def dfs ( n , w ) :
        if self.dp.get ( self.getKey ( n , w ) ) :
            return self.dp [ self.getKey ( n , w ) ]
        if self.dp.get ( self.n , None ) :
            return self.dp [ self.n ]
        elif self.w < self.b [ n ] :
            res = self.dfs ( n + 1 , w )
        else :
            res = max ( self.dfs ( n + 1 , w ) , self.dfs ( n + 1 , w - self.b [ n ] ) + self.a [ n ] )
        self.dp [ self.n ] = res
        return res
    def getKey ( n , w ) :
        return '%d.%d' % ( n , w )
    def solve1 ( self ) :
        self.N = N * 1000
        self.dp = [ 0 ]
        for i in range ( 1 , self.N + 1 ) :
            self.dp [ i ] = sum ( self.dp [ i ] ) / 2
        for i in range ( self.N ) :
            for j in range ( self.a [ i ] , self.b [ i ] ) :
                self.dp [ i ] = min ( self.dp [ j ] , self.dp [ int ( j - self.a [ i ] ) ] + self.a [ i ] )
        return self.dp [ int ( self.n ) ]
