def main ( srgs ) :
    import sys
    from itertools import count
    from itertools import chain
    a = next ( srgs )
    b = next ( srgs )
    an = [ 0 ] * a
    for i in range ( 0 , b ) :
        c = next ( srgs )
        d = next ( srgs )
        an [ c - 1 ] += 1
        an [ d - 1 ] += 1
    for i in range ( 0 , a ) :
        print ( an [ i ] )
