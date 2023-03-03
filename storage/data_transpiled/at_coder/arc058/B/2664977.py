def main ( ) :
    from math import ceil
    from itertools import chain
    sc = iter ( sys.stdin )
    H , W , A , B = map ( int , sc.next ( ).split ( ) )
    mod = 1000000007
    c = combination ( H + W , mod )
    x = B + 1
    y = H - A
    ans = 0
    while 1 <= x <= W and 1 <= y <= H :
        ans = ( ans + c.C ( x - 1 + y - 1 , x - 1 ) * c.C ( W - x + H - y , W - x ) % mod ) % mod
        x += 1
        y -= 1
    print ( ans )
    class combination ( ) :
        def __init__ ( self , n , p ) :
            self.n = n
            self.p = p
            self.fact_table = [ 1 ]
            for i in range ( 1 , n + 1 ) :
                self.fact_table.append ( self.fact_table [ i - 1 ] * i % p )
            self.reverce_table = [ 1 ]
            x = self.fact_table [ n ]
            m = p - 2
            while m > 0 :
                if m & 1 == 1 :
                    self.reverce_table.append ( self.reverce_table [ n ] * x % p )
                x = x * x % p
                m >>= 1
            for i in range ( n - 1 , 0 , - 1 ) :
                self.reverce_table.append ( self.reverce_table [ i + 1 ] * ( i + 1 ) % p )
        def C ( self , n , r ) :
            if r < 0 or n < r :
                return 0
            else :
                return ( self.fact_table [ n ] * self.reverce_table [ r ] % p ) * self.reverce_table [ n - r ] % p
