def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    from itertools import chain
    n = len ( chain ( * repeat ( sys.argv [ 1 : ] ) ) )
    a = [ ]
    for i in range ( 0 , n - 1 ) :
        a.append ( chain ( * repeat ( sys.argv [ 1 : ] ) ) )
    sys.stdin.close ( )
    count = 0
    a = chain ( a , repeat ( sys.argv [ 1 : ] ) )
    for i in range ( 0 , n - 2 ) :
        if a [ i ] == a [ i + 1 ] :
            count += 1
    if count % 2 :
        count += 1
    print ( n - count )
