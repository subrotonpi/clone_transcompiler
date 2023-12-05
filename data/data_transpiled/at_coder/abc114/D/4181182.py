def import _legendre
class Main ( object ) :
    def __init__ ( self ) :
        sc = _legendre.Scanner ( )
        N = sc.__next__ ( )
        p = [ 2 , 3 , 5 , 7 , 11 , 13 , 17 , 19 , 23 , 29 , 31 , 37 , 41 , 43 , 47 , 53 , 59 , 61 , 67 , 71 , 73 , 79 , 83 , 89 , 97 ]
        p_total = [ _legendre ( N , p ) for p in p ]
        ans = 0
        for i in range ( len ( p ) ) :
            if p_total [ i ] >= 74 :
                ans += 1
        for i in range ( len ( p ) ) :
            for j in range ( len ( p ) ) :
                if i != j and p_total [ i ] >= 2 and p_total [ j ] >= 24 :
                    ans += 1
        for i in range ( len ( p ) ) :
            for j in range ( len ( p ) ) :
                if i != j and p_total [ i ] >= 4 and p_total [ j ] >= 14 :
                    ans += 1
        ans += plus / 2
        print ( ans )
    def legendre ( n , p ) :
        c = 0
        m = p
        while m <= n :
            c += n // m
            m *= p
        return c
