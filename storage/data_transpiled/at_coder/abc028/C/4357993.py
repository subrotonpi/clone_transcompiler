def main ( ) :
    import sys
    from itertools import izip
    from itertools import izip
    from itertools import chain
    a = next ( iter ( sys.stdin ) )
    b = next ( iter ( sys.stdin ) )
    c = next ( iter ( sys.stdin ) )
    d = next ( iter ( sys.stdin ) )
    e = next ( iter ( sys.stdin ) )
    ans = chain ( a + b + c , a + b + d , a + b + e , a + c + d , a + c + e , a + d + e , b + c + d , b + c + e , b + c + e , b + d + e , c + d + e )
    cnt = 1
    for x in ans :
        if cnt == len ( ans ) - 2 :
            print ( x )
        cnt += 1
