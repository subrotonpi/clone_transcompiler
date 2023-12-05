def __largerdigit ( a , b ) :
    import math
    def __largerdigit ( a , b ) :
        return max ( len ( str ( a ) ) , len ( str ( b ) ) )
    def __main ( ) :
        sc = __main ( )
        n = sc.number
        min = 0
        for i in range ( 1 , math.sqrt ( n ) + 1 ) :
            if n % i != 0 :
                continue
            d = __largerdigit ( i , n // i )
            if d < min or i == 1 :
                min = d
        print ( min )
    return __main
