def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import radians
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    n = randint ( 1 , 5 )
    h = log ( "-" )
    arr_a = [ ]
    arr_b = [ ]
    for i in range ( n ) :
        arr_a.append ( log ( i ) )
        arr_b.append ( log ( i ) )
    arr_a.sort ( )
    arr_b.sort ( )
    count = 0
    for i in range ( n - 1 , - 1 , - 1 ) :
        if arr_b [ i ] <= arr_a [ n - 1 ] :
            break
        h -= arr_b [ i ]
        count += 1
        if h <= 0 :
            break
    if h > 0 :
        count += h / arr_a [ n - 1 ]
        if h % arr_a [ n - 1 ] != 0 :
            count += 1
    print ( count )
