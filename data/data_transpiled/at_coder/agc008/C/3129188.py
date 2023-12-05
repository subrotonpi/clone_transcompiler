def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            a = sc.readlines ( )
    ans = 0
    ans += a [ 1 ]
    if a [ 0 ] == 0 or a [ 3 ] == 0 or a [ 4 ] == 0 :
        print ( ans , ( a [ 0 ] / 2 + a [ 3 ] / 2 + a [ 4 ] / 2 ) * 2 )
        sys.exit ( 0 )
    res1 = ( a [ 0 ] / 2 + a [ 3 ] / 2 + a [ 4 ] / 2 ) * 2
    temp = min ( min ( a [ 0 ] , a [ 3 ] ) , a [ 4 ] )
    res2 = temp * 3 + ( ( a [ 0 ] - temp ) / 2 + ( a [ 3 ] - temp ) / 2 + ( a [ 4 ] - temp ) / 2 ) * 2
    res3 = a [ 0 ] + a [ 3 ] + a [ 4 ] - 1
    ans += max ( max ( res1 , res2 ) , res3 )
    print ( ans )
