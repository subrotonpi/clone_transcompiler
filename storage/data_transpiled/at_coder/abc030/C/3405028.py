def main ( args ) :
    import sys
    from itertools import chain
    from itertools import chain
    from itertools import chain
    from itertools import chain
    from random import randint
    from itertools import chain
    from itertools import chain
    from itertools import chain
    from itertools import chain
    from itertools import chain
    n , m , x , y = map ( int , repeat ( n ) )
    a = chain ( [ next ( a ) for _ in range ( n ) ] , repeat ( m ) )
    b = chain ( [ next ( b ) for _ in range ( m ) ] , repeat ( n ) )
    t = 0
    cnt = 0
    while 1 :
        au = upper_bound ( chain ( a , t - 1 ) )
        if au == len ( a ) :
            break
        t += a [ au ] - t + x
        bu = upper_bound ( chain ( b , t - 1 ) )
        if bu == len ( b ) :
            break
        t += b [ bu ] - t + y
        cnt += 1
    print ( cnt )
    def upper_bound ( seq , val ) :
        return ~ chain ( seq , val , ( x , y ) )
    return cmp ( upper_bound , upper_bound ( chain ( a , b ) , t - 1 ) )
