def main ( ) :
    import sys
    from itertools import islice
    from itertools import islice
    n = islice ( sys.stdin.readline ( ) , 0 , 0 , 0 )
    a = islice ( sys.stdin.readline ( ) , 0 , n )
    ans = islice ( a , n )
    idx = islice ( n - 1 , 0 , 0 )
    for i , j in islice ( a , n - 1 , 0 , - 1 ) :
        if idx < 0 :
            break
        ans [ i ] = a [ idx ]
        idx -= 1
        if idx < 0 :
            break
        ans [ j ] = a [ idx ]
        idx -= 1
    for i in ans :
        sys.stdout.write ( i + " " )
