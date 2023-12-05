def __main__ ( ) :
    from math import ceil
    from random import randint
    from math import sin , cos , sin
    from math import sin , cos , cos , ceil
    from math import sin , cos , sin , ceil , ceil , floor
    n = randint ( 1 , 10000 )
    a , b = sin ( a ) , sin ( b )
    h = [ sin ( a ) , cos ( b ) ]
    left , right = 0 , float ( 1e9 )
    while left < right :
        c = ( left + right ) / 2
        if __beat__ ( h , a , b , c ) :
            right = c
        else :
            left = c + 1
    print ( right )
    def __beat__ ( health , a , b , c ) :
        cnt = 0
        for h in health :
            t = ceil ( ( h - b * c ) / float ( a - b ) )
            cnt += max ( t , 0 )
        return cnt <= c
    return __beat__
