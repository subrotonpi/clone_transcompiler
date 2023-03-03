def main ( ) :
    import sys
    stdin = sys.stdin
    num_cases = len ( stdin.readlines ( ) )
    for loop in range ( 1 , num_cases + 1 ) :
        n , k = stdin.readline ( ).split ( )
        smooth = [ i for i in range ( n - k + 1 ) if i > 0 ]
        offset = [ i for i in range ( k , n ) if i > 0 ]
        offset = [ i for i in range ( k , n ) if i > 0 ] + smooth [ i - k + 1 ] - smooth [ i - k ]
        ranges = [ [ min ( i , j ) for j in range ( k , n ) ] for i in range ( k , n ) ]
        widest , mWidth = 0 , ranges [ 0 ] [ 1 ] - ranges [ 0 ] [ 0 ]
        for i in range ( 1 , k ) :
            if ranges [ i ] [ 1 ] - ranges [ i ] [ 0 ] > mWidth :
                widest = i
                mWidth = ranges [ i ] [ 1 ] - ranges [ i ] [ 0 ]
        min , max = 0 , 0
        for i in range ( k ) :
            min += ( ranges [ widest ] [ 0 ] - ranges [ i ] [ 0 ] )
            max += ( ranges [ widest ] [ 1 ] - ranges [ i ] [ 1 ] )
        res = - 1
        if max - min >= k :
            res = mWidth
        else :
            target = smooth [ 0 ] % k
            if target < 0 :
                target += k
            low = min % k
            if low < 0 :
                low += k
            high = max % k
            if high < 0 :
                high += k
            if low <= high :
                if low <= target <= high :
                    res = - 1
                else :
                    res = - 1
        print ( "Case #%d: %s" % ( loop , res ) )
