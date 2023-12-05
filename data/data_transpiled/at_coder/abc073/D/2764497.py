def import _main
class Main ( object ) :
    mod_P = 1000000007
    inf = 1 << 61
    def __init__ ( self , n , m , r ) :
        self.n = n
        self.m = m
        self.r = r
        self.R = [ ]
        self.dist = [ ]
        self.ans = inf
        self.visited = [ ]
        self.dist = [ ]
        self.visited = [ False ]
        self.dist = [ ]
        for i in range ( n ) :
            [ self.dist [ i ] ] = inf
            self.dist [ i ].append ( 0 )
        for a , b , c in _main ( ) :
            self.dist [ a ] [ b ] = c
            self.dist [ b ] [ a ] = c
        for k in range ( m ) :
            for i in range ( n ) :
                for j in range ( n ) :
                    self.dist [ i ] [ j ] = min ( self.dist [ i ] [ k ] + self.dist [ k ] [ j ] , self.dist [ i ] [ j ] )
        self.dfs ( 1 , - 1 , 0 )
        self.print ( self.ans )
    def dfs ( self , cnt , last , d ) :
        if cnt == self.r + 1 :
            self.ans = min ( self.ans , d )
            return
        for i in range ( r ) :
            if not self.visited [ i ] :
                self.visited [ i ] = True
                if last == - 1 :
                    self.dfs ( cnt + 1 , i , 0 )
                else :
                    self.dfs ( cnt + 1 , i , d + self.dist [ R [ last ] ] [ R [ i ] ] )
                self.visited [ i ] = False
