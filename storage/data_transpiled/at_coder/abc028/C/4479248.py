def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    from itertools import chain
    from itertools import chain
    a = chain ( [ 1 ] * 5 , repeat ( 10 ) )
    b = chain ( [ 1 ] * 10 , repeat ( 10 ) )
    m = - 1
    for i in range ( 4 , 2 , - 1 ) :
        for j in range ( i - 1 , 1 , - 1 ) :
            for l in range ( j - 1 , - 1 , - 1 ) :
                m += 1
                b [ m ] = a [ i ] + a [ j ] + a [ l ]
    b.sort ( )
    print ( b [ 7 ] )
