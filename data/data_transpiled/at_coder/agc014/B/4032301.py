def main ( ) :
    import sys
    from itertools import islice
    from itertools import islice
    n = islice ( sys.stdin.readline ( ) , 0 , 0 , 0 )
    m = islice ( sys.stdin.readline ( ) , 0 , 0 , 0 )
    node = islice ( sys.stdin.readline ( ) , 0 , n + 1 , 0 )
    for a , b in islice ( node , 0 , n + 1 , 0 ) :
        node [ a ] = not node [ a ]
        node [ b ] = not node [ b ]
    for i in range ( 1 , n + 1 ) :
        if node [ i ] :
            print ( "NO" )
            return
    print ( "YES" )
