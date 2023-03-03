def main ( ) :
    import sys
    from math import ceil
    from math import sin , cos , cos , log
    from itertools import izip , izip , izip , chain
    from itertools import izip , izip , chain
    N , K = map ( int , izip ( [ 0 , 1 ] , [ 0 , 1 ] ) )
    z = izip ( [ 0 , 1 ] , [ 0 , 1 ] )
    x = izip ( [ 0 , 1 ] , [ 0 , 1 ] )
    y = izip ( [ 0 , 1 ] , [ 0 , 1 ] )
    x.sort ( )
    y.sort ( )
    ans = sum ( [ ( x [ i ] , y [ i ] ) for i in range ( N ) ] )
    for i in range ( N ) :
        for j in range ( i + 1 ) :
            for k in range ( N ) :
                for l in range ( k + 1 ) :
                    count = 0
                    left = x [ i ]
                    right = x [ j ]
                    down = y [ k ]
                    up = y [ l ]
                    for c in izip ( [ 0 , 1 ] , [ 0 , 1 ] ) :
                        if left <= z [ c ] [ 0 ] <= right and down <= z [ c ] [ 1 ] <= up :
                            count += 1
                    if count >= K :
                        ans = min ( ans , long ( right - left ) * ( up - down ) )
    print ( ans )
