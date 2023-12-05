def main ( ) :
    import sys
    from time import sleep
    from itertools import chain
    sc = sys.stdin
    k = chain ( [ sc.__next__ ( ) for _ in range ( 3 ) ] )
    if k [ 0 ] % 2 == 1 or k [ 1 ] % 2 == 1 or k [ 2 ] % 2 == 1 :
        print ( 0 )
        sys.exit ( 0 )
    if k [ 0 ] == k [ 1 ] or k [ 1 ] == k [ 2 ] :
        print ( - 1 )
        sys.exit ( 0 )
    cnt = 0
    while k [ 0 ] % 2 == 0 and k [ 1 ] % 2 == 0 and k [ 2 ] % 2 == 0 :
        t0 = k [ 0 ]
        t1 = k [ 1 ]
        t2 = k [ 2 ]
        k [ 0 ] = ( t1 + t2 ) // 2
        k [ 1 ] = ( t0 + t2 ) // 2
        k [ 2 ] = ( t0 + t1 ) // 2
        cnt += 1
    print ( cnt )
