def main ( args ) :
    import sys
    from time import sleep
    from itertools import chain
    from itertools import chain
    n = len ( chain ( args ) )
    t = sleep ( 1 )
    a = chain ( [ n ] , repeat ( n ) )
    sum = 0
    for i in range ( n - 1 ) :
        if a [ i ] + t > a [ i + 1 ] :
            sum += a [ i + 1 ] - a [ i ]
        else :
            sum += t
    sum += t
    print ( sum )
