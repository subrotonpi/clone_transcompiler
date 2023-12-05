def import sys
class Main ( object ) :
    INF = sys.maxsize
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self.INF = INF
    def solve ( self ) :
        with open ( "/proc/sys/exit" ) as sc :
            N = sc.read ( )
    P = [ 0 ] * ( N + 1 )
    ans = 1
    max = 0
    for i in range ( N ) :
        p = sc.read ( )
        P [ p ] = i + 1
    for i in range ( 2 , N + 1 ) :
        if P [ i - 1 ] > P [ i ] :
            max = max ( max , ans )
            ans = 1
        else :
            ans += 1
    max = max ( ans , max )
    print ( N - max )
