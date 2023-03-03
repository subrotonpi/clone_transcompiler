def import import count
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.s = [ 0 ] * ( n + 1 )
        ans = 0
        for i in range ( 2 , n + 1 ) :
            t = i
            for j in range ( 2 , t + 1 ) :
                while t % j == 0 :
                    self.s [ j ] += 1
                    t //= j
        ans += count ( 74 )
        ans += count ( 24 ) * ( count ( 2 ) - 1 )
        ans += count ( 14 ) * ( count ( 4 ) - 1 )
        ans += count ( 4 ) * ( count ( 4 ) - 1 ) * ( count ( 2 ) - 2 ) / 2
        print ( ans )
    def count ( u ) :
        res = 0
        for i in range ( 2 , n + 1 ) :
            if s [ i ] >= u :
                res += 1
        return res
