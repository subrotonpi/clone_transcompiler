def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    from itertools import chain
    n = len ( chain ( sys.stdin.readline ( ).strip ( ).split ( ) ) )
    alist = [ chain ( [ a for a in chain ( sys.stdin.readline ( ).strip ( ).split ( ) , 1 ) ] , repeat ( 2 ) ) for a in chain ( itertools.chain ( * chain ( sys.stdin.readline ( ).split ( ) , 1 ) ) ) ]
    for i in range ( 2 ) :
        for j in range ( n ) :
            alist [ i ] [ j ] = repeat ( i , n )
    sys.stdout.write ( '\n' )
    max = 0
    for i in range ( n ) :
        tmpmax = alist [ 0 ] [ 0 ]
        for j in range ( i ) :
            tmpmax += alist [ 0 ] [ j + 1 ]
        for j in range ( i , n ) :
            tmpmax += alist [ 1 ] [ j ]
        if max < tmpmax :
            max = tmpmax
    print ( max )
