def _import ( ) :
    from math import pow , gcd
    class Main ( object ) :
        def __init__ ( self , a , b , m ) :
            if x == 1 :
                return a
            elif x == 0 :
                res = [ [ 1 , 0 ] , [ 0 , 1 ] ]
                t2 = pow ( a , b )
                res *= ( t2 [ 0 ] % m + t2 [ 0 ] % m )
                print ( res % m )
            else :
                return mul ( a , pow ( x / 2 , mul ( a ) ) )
        def mul ( self , a ) :
            res = [ [ 0 , 0 ] , [ 0 , 1 ] ]
            for i in range ( 2 ) :
                for j in range ( 2 ) :
                    for k in range ( 2 ) :
                        res [ i ] [ j ] += ( a [ i ] [ k ] * a [ k ] [ j ] ) % m
                        res [ i ] [ j ] %= m
            return res
        def gcd ( x , y ) :
            if max ( x , y ) % min ( x , y ) == 0 :
                return min ( x , y )
            else :
                return gcd ( min ( x , y ) , max ( x , y ) % min ( x , y ) )
        def pow ( self , x ) :
            if x == 1 :
                return a
            elif x % 2 == 0 :
                return pow ( ( a * a ) % m , x // 2 )
            else :
                return ( pow ( ( a * a ) % m , x // 2 ) * a ) % m
    return Main
