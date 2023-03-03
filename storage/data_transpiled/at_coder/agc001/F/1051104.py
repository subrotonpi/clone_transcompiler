def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.vis = [ False ]
        self.seg = SegTree ( self.n )
        self.idx = 0
        self.query ( a , b , l , r , k )
        if self.l <= self.r :
            return self.val [ self.k ]
        elif self.r <= self.l :
            return int ( self.q [ self.k ] ) / 10
        else :
            with open ( "../" , "r" ) as sc :
                self.n = sc.read ( )
                self.q = [ i for i in range ( self.n ) ]
                self.seg = SegTree ( self.n )
                for i in range ( self.n ) :
                    self.seg.set_val ( i , self.q [ i ] )
                for i in range ( self.n ) :
                    if not self.vis [ i ] :
                        self.dfs ( i )
                lines = [ ]
                t = [ i for i in range ( self.n ) ]
                ans = [ i for i in t ]
                for i in ans :
                    lines.append ( "%d\n" % ( i + 1 ) )
                print ( lines )
    def dfs ( self ) :
        while True :
            min = self.seg.query ( 0 , self.p [ i ] )
            if min < self.n + self.k :
                self.dfs ( min )
            else :
                break
        self.ans [ self.idx ] = i
        self.vis [ self.idx ] = True
        self.seg.set_val ( self.p [ i ] , int ( self.q [ i ] ) / 10 )
    def tr ( self , * args ) :
        print ( " ".join ( args ) )
    class SegTree ( object ) :
        n = 1
        def __init__ ( self , n_ ) :
            while self.n < n_ :
                self.n *= 2
            self.val = [ self.val [ 2 * i ] for i in range ( self.n ) ]
return Main
