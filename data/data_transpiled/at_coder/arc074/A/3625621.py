def main ( ) :
    import sys
    from random import randint
    from math import fabs
    from math import sin , cos
    from math import sin , cos
    from math import cos , sin
    from math import sin , cos
    from math import sin , cos
    H = randint ( 1 , 1000000000.0 )
    W = randint ( 1 , 1000000000.0 )
    min = min ( solve ( H , W ) , sin ( W , H ) )
    print ( min )
    def solve ( a , b ) :
        min = 1000000000
        min *= min
        d = b
        for i in range ( 1 , a ) :
            c = a - i
            size1 = i * b
            if b % 2 == 0 or c % 2 == 0 :
                size2 = b * c / 2
                min = min ( min , abs ( size1 - size2 ) )
            else :
                e = c
                d = min ( b , e )
                c = max ( b , e )
                size2 = d * ( c / 2 )
                size3 = d * ( c / 2 + 1 )
                max = 0
                max = max ( max , abs ( size1 - size2 ) )
                max = max ( max , abs ( size2 - size3 ) )
                max = max ( max , abs ( size3 - size1 ) )
                min = min ( min , max )
        return min
    return solve
