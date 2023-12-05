def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.k = int ( self.k )
        a = [ ]
        b = [ ]
        for i in range ( self.n ) :
            a.append ( _main ( i ) )
        for i in range ( self.n ) :
            b.append ( _main ( i ) )
        a.sort ( )
        b.sort ( )
        max = a [ - 1 ] * b [ - 1 ]
        print ( _bin_search ( max , - 1 , k , a , b ) )
    def bin_search ( self , ok , ng , k , a , b ) :
        while abs ( ok - ng ) > 1 :
            mid = ( ok + ng ) / 2
            if _solve ( mid , a , b ) >= k :
                ok = mid
            else :
                ng = mid
        return ok
    def solve ( self , k , a , b ) :
        cnt = 0
        for i in range ( self.n ) :
            if b [ 0 ] * a [ i ] > k :
                continue
            ok = 0
            ng = self.n
            while abs ( ok - ng ) > 1 :
                mid = ( ok + ng ) / 2
                if b [ int ( mid ) ] * a [ i ] <= k :
                    ok = mid
                else :
                    ng = mid
            cnt += ok + 1
        return cnt
return Main
