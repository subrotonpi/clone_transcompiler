def import import _main
class Main ( object ) :
    def __init__ ( self , sc ) :
        self.n = sc.__next__ ( )
        a = [ ]
        b = [ ]
        for i in range ( n ) :
            ai = sc.__next__ ( )
            for j in range ( 1 , 29 ) :
                a [ j - 1 ] [ i ] = ai % ( 1 << j )
        for i in range ( n ) :
            bi = sc.__next__ ( )
            for j in range ( 1 , 29 ) :
                b [ j - 1 ] [ i ] = bi % ( 1 << j )
        ans = 0
        tmp = 1
        for bit in range ( 29 ) :
            [ tmp ] = b [ bit ]
            bi = 0
            for i in range ( n ) :
                bi += self._check ( a [ bit ] [ i ] , tmp , b [ bit ] )
                bi %= 2
            ans += ( bi << bit )
            tmp *= 2
        print ( ans )
    def check ( a , t , n ) :
        cnt1 = search ( 2 * t - a , n ) - search ( t - a , n )
        cnt2 = search ( 4 * t - a , n ) - search ( 3 * t - a , n )
        return ( cnt1 + cnt2 ) % 2
    def search ( t , n ) :
        l = r = len ( n ) - 1
        if t <= n [ 0 ] :
            return 0
        if n [ r ] < t :
            return r + 1
        c = 0
        while l < r :
            c = ( l + r ) // 2
            if t < n [ c ] :
                r = c
            elif t > n [ c ] :
                l = c + 1
            else :
                r = c
        return l
