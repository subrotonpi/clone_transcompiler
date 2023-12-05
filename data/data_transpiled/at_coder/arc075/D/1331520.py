def import _solve
class Main ( object ) :
    def __init__ ( self , D , l , t , x ) :
        Scanner ( ).__init__ ( self )
        D = int ( D )
        print ( solve ( D ) )
        sc.close ( )
    MAXL = 17
    def solve ( D ) :
        if D % 9 != 0 :
            return 0
        D /= 9
        B = [ 1 ]
        for i in range ( 1 , MAXL ) :
            B [ i ] = B [ i - 1 ] * 10
        ans = 0
        for i in range ( 1 , MAXL + 1 ) :
            N = ( i + 1 ) // 2
            v = [ 0 ] * N
            for j in range ( N ) :
                for k in range ( j , i - j ) :
                    v [ j ] += B [ k ]
            ans += count ( D , i , 0 , [ ] )
        return ans
    def count ( D , l , t , x ) :
        if t == N :
            if D != 0 :
                return 0
            ans = 1
            for i in range ( N ) :
                ans *= ( 9 if i == 0 else 10 ) - abs ( x [ i ] )
            if l % 2 == 0 :
                ans *= 10
            return ans
        ans = 0
        for m in range ( - 9 , 9 + 1 ) :
            if - v [ t ] < D + v [ t ] * m and D + v [ t ] * m < v [ t ] :
                x [ t ] = m
                ans += count ( D + v [ t ] * m , l , t + 1 , x )
        return ans
return Main
