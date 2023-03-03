def main ( ) :
    import sys
    from itertools import islice
    from itertools import islice
    from itertools import islice
    a = islice ( sys.stdin.read ( ) , 0 , 0 , 0 )
    b = islice ( sys.stdin.read ( ) , 0 , 0 , 0 )
    ans = islice ( b , 0 , a )
    b = islice ( b , 0 , a )
    b.sort ( )
    for i in range ( 1 , a ) :
        if b [ i ] == b [ i - 1 ] :
            ans += 1
    print ( ans )
