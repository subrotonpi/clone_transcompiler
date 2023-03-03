def import _main
class PL ( object ) :
    def __init__ ( self , x , y ) :
        self.x , self.y = x , y
    def __lt__ ( self , o ) :
        return cmp ( self.x , o.x )
    def __repr__ ( self ) :
        return "(%s,%s)" % ( self.x , self.y )
class Main ( object ) :
    def __init__ ( self , n , k ) :
        self.m = len ( k )
        self.q = PriorityQueue ( reverse = True )
        f = self.k [ 0 ]
        a = [ 0 ] * n
        c = 1
        for i in range ( m - 2 , - 1 , - 1 ) :
            nc = 0
            while self.q and self.q [ - 1 ] > k [ i ] :
                t = self.q.pop ( )
                x , y = t [ 0 ] , t [ 1 ]
                qq , r = x // k [ i ] , x % k [ i ]
                nc += y * qq
                if r > f :
                    self.q.append ( ( r , y ) )
                elif r >= 1 :
                    a [ int ( r - 1 ) ] += y
            qq , r = self.k [ i + 1 ] // k [ i ] , k [ i + 1 ] % k [ i ]
            nc += c * qq
            if r > f :
                self.q.append ( ( r , c ) )
            elif r >= 1 :
                a [ int ( r - 1 ) ] += c
            c = nc
        self.a [ int ( f - 1 ) ] += c
        while self.q :
            t = self.q.pop ( )
            x , y = t [ 0 ] , t [ 1 ]
            if x >= 1 :
                a [ int ( x - 1 ) ] += y
        for i in range ( n - 2 , - 1 , - 1 ) :
            a [ i ] += a [ i + 1 ]
        for aa in a :
            print ( aa )
