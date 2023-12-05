def import _main
class Main ( object ) :
    class Criteria ( object ) :
        def __init__ ( self , l , r , x ) :
            self.l , self.r , self.x = l , r , x
    class N :
        def __init__ ( self , i , j , k ) :
            self.l , self.r , self.x = i , r , x
    def isOK ( self , i , j , k ) :
        self.l , self.r , self.x = self.l , self.r , self.x
        return self.l , self.r , self.x
    def isOK ( self , i , j , k ) :
        self.ci3 , self.ci1 = self.min ( i , j ) , self.max ( i , k )
        self.ci2 , self.ci3 = self.min ( i , j ) , self.max ( i , k )
        self.list = [ [ ] for i in range ( self.N + 1 ) ]
        for i in range ( self.M ) :
            l , r , x = self.l , self.r , self.x
            self.list [ r ].append ( ( l , r , x ) )
        dp = [ [ 1 , 0 , 0 ] ]
        for i in range ( self.N ) :
            for j in range ( self.N ) :
                for k in range ( self.N ) :
                    if self.dp [ i ] [ j ] [ k ] == 0 : continue
                    if isOK ( self , i , j , k ) :
                        self.ans = ( self.ans + self.dp [ N ] [ i ] [ j ] + self.dp [ j ] [ k ] ) % MOD
                        self.dp [ i ] [ j ] [ k ] = int ( self.dp [ i ] [ j ] [ k ] ) % MOD
                        self.dp [ i ] [ j ] [ k ] = int ( self.dp [ i ] [ j ] [ k ] ) % MOD
                        self.dp [ i ] [ j ] [ k ] = int ( self.dp [ i ] [ j ] [ k ] ) % MOD
        return True
