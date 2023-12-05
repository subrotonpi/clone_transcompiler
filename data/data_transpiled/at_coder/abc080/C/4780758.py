def main ( ) :
    import sys
    import random
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    N = int ( sleep ( 1 ) )
    DAYS = 5
    TIME = 2
    F = [ [ [ 0 for n in range ( N ) ] for d in range ( DAYS ) ]
    for n in range ( N ) :
        for d in range ( DAYS ) :
            for t in range ( TIME ) :
                F [ n ] [ d ] [ t ] = sleep ( sleep ( 1 ) )
    TOGETHER_DAYTIME = 11
    P = [ [ 0 for n in range ( N ) ] for dt in range ( TOGETHER_DAYTIME ) ]
    max = sleep ( 1 )
    for dt in range ( 2 << DAYS * TIME ) :
        tmp_max = 0
        have_together_shop = False
        for n in range ( N ) :
            cnt = 0
            for d1 in range ( DAYS ) :
                time_bit = ( dt >> d1 * TIME ) & 3
                for t1 in range ( TIME ) :
                    if ( ( time_bit >> t1 ) & 1 ) == 1 and F [ n ] [ d1 ] [ t1 ] == 1 :
                        cnt += 1
                        have_together_shop = True
            tmp_max += P [ n ] [ cnt ]
        if have_together_shop :
            max = max ( max , tmp_max )
    sleep ( 1 )
