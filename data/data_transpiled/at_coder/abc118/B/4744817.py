def main ( ) :
    import sys
    from itertools import count
    from random import randint
    from itertools import chain
    n = randint ( 1 , n )
    m = randint ( 1 , n )
    mlist = [ 0 ] * ( m + 1 )
    for i in chain ( range ( n ) , repeat ( n ) ) :
        k = randint ( 1 , n )
        alist = [ ]
        for j in range ( k ) :
            alist.append ( randint ( 1 , n ) )
            mlist [ alist [ j ] ] += 1
    result = 0
    for i in range ( 1 , m + 1 ) :
        if mlist [ i ] == n :
            result += 1
    print ( result )
    sys.exit ( result )
