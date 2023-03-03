def main ( ) :
    import sys
    from itertools import islice
    from itertools import islice
    from itertools import islice
    from random import shuffle
    n = islice ( sys.stdin.readline ( ) , 0 , 0 , 0 )
    k = islice ( sys.stdin.readline ( ) , 0 , 0 , 0 )
    l = islice ( sys.stdin.readline ( ) , n , k )
    l = islice ( l , n , k )
    l.sort ( )
    sum = 0
    for i in range ( n - 1 , n - k , - 1 ) :
        sum += l [ i ]
    print ( sum )
    sys.stdout.flush ( )
