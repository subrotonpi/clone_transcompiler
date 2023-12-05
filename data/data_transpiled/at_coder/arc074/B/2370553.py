def main ( ) :
    import sys
    import random
    import bisect
    from bisect import bisect
    from bisect import bisect_left , bisect_right , bisect
    n = len ( sys.argv )
    left = bisect.bisect_left ( sys.argv [ 1 ] , sys.argv [ 2 ] )
    center = [ ]
    right = bisect.bisect_right ( ( l1 , l2 ) for l1 , l2 in zip ( left , center ) )
    lmove = [ ]
    lmove.append ( left.pop ( 0 ) )
    rmove = [ ]
    rmove.append ( right.pop ( 0 ) )
    for i in range ( n ) :
        left.append ( center [ i ] )
        lmove.append ( lmove [ i ] - left.pop ( 0 ) + center [ i ] )
    for i in range ( n ) :
        right.append ( center [ n - 1 - i ] )
        rmove.append ( rmove [ i ] - right.pop ( 0 ) + center [ n - 1 - i ] )
    ans = bisect.bisect_left ( left , right )
    for i in range ( 0 , n ) :
        temp = lmove [ i ] - rmove [ n - i ]
        ans = max ( temp , ans )
    print ( ans )
