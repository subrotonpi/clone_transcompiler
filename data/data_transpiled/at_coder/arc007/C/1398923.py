def main ( ) :
    import math
    from string import ascii_letters
    sc = Scanner ( )
    c = sc.next ( )
    n = len ( c )
    televi = [ [ 1 for i in range ( n ) ] for i in range ( n ) if c [ i ] == 'o' ]
    for i in range ( 1 , n ) :
        for j in range ( n ) :
            televi [ i ] [ ( j + i ) % n ] = televi [ 0 ] [ j ]
    ans = 20
    for i in range ( 1 , int ( math.pow ( 2 , n ) ) ) :
        watch = [ 0 ] * n
        count = 0
        for k in range ( n ) :
            if i & ( 1 << k ) :
                for j in range ( n ) :
                    watch [ j ] += televi [ k ] [ j ]
                count += 1
        flg = True
        for j in range ( n ) :
            if watch [ j ] == 0 :
                flg = False
        if flg :
            ans = min ( ans , count )
    print ( ans )
