def main ( ) :
    import sys
    from math import sin , cos , pi
    from os import urandom
    from os import urandom
    n = urandom ( 1 )
    a = [ 0 ] * ( n + 1 )
    ru = [ 0 ] * ( n + 1 )
    for i in range ( 1 , n + 1 ) :
        a [ i ] = urandom ( 1 )
        ru [ i ] = ru [ i - 1 ] + a [ i ]
    ru.sort ( )
    sta , gol = 0 , 0
    a1 , ans = 0 , 0
    for i in range ( 1 , n + 1 ) :
        if ru [ i - 1 ] - ru [ i ] != 0 :
            gol = i
            a1 , ans = gol - sta , ans + cou ( a1 )
            sta = gol
    a1 = n + 1 - sta
    ans = ans + cou ( a1 )
    print ( ans )
    def cou ( a ) :
        global a
        c = a * ( a - 1 )
        c = c / 2
        return c
    return cou
