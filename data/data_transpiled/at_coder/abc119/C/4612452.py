def _import ( ) :
    from math import sin , cos , abs , abs
    class Main ( object ) :
        def __init__ ( self ) :
            self.n , a , b , c , l = sys.argv [ 1 : ]
            self.n = n
            self.a = a
            self.b = b
            self.c = c
            self.l = sin ( a )
            self.l = sin ( b )
            print ( self.dfs ( 0 , 0 , 0 , 0 ) )
        def dfs ( cur , a0 , b0 , c0 ) :
            if cur == self.n :
                return ( abs ( a0 - a ) + abs ( b0 - b ) + abs ( c0 - c ) - 30 if abs ( a0 - a ) + abs ( b0 - b ) + abs ( c0 - c ) - 30 else 1000000000 )
            ret0 = self.dfs ( cur + 1 , a0 , b0 , c0 )
            ret1 = self.dfs ( cur + 1 , a0 + self.l [ cur ] , b0 , c0 ) + 10
            ret2 = self.dfs ( cur + 1 , a0 , b0 + self.l [ cur ] , c0 ) + 10
            ret3 = self.dfs ( cur + 1 , a0 , b0 , c0 + self.l [ cur ] ) + 10
            return min ( min ( min ( ret0 , ret1 ) , ret2 ) , ret3 )
    return Main
