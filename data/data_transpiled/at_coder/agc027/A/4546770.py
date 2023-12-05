def main ( ) :
    import sys
    from itertools import islice
    from itertools import islice
    from itertools import islice
    n , x = islice ( sys.stdin.readline ( ) , 0 , None )
    a = islice ( sys.stdin.readline ( ) , n )
    a.sort ( )
    for i in islice ( a , n ) :
        x -= a [ i ]
        if x < 0 :
            print ( i )
            return
    print ( x or n - 1 )
