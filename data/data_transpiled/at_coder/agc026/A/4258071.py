def main ( srgs ) :
    import sys
    from time import sleep
    from itertools import chain
    a = range ( 0 , a )
    c = chain ( a , b )
    count = 0
    for i in chain ( a , b ) :
        c [ i ] = b
    for i in range ( a - 1 ) :
        if c [ i ] == c [ i + 1 ] :
            count += 1
            i += 1
    print ( count )
