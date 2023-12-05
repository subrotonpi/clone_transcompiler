def main ( ) :
    import sys
    import random
    import time
    import time
    import time
    time.append ( 0 )
    time.append ( 0 )
    time.append ( 0 )
    for i , k in enumerate ( range ( 2 , n ) ) :
        time [ k ] = random.randint ( 0 , 3 )
        time [ k ] += time [ k - 1 ]
    time.append ( time [ n + 1 ] )
    total_time = time [ n + 2 ]
    maxv.append ( 0 )
    maxv.append ( 0 )
    for i in range ( 1 , n + 1 ) :
        maxv [ i ] = random.randint ( 0 , 3 )
    maxV_Every_0_5_seconds = [ ]
    maxv_Every_0_5_seconds.append ( int ( time [ n + 1 ] ) )
    for i in range ( total_time * 2 + 1 ) :
        for j in range ( n + 2 ) :
            if i <= 2 * time [ j ] :
                maxv_Every_0_5_seconds [ int ( i ) ] = min ( maxv_Every_0_5_seconds [ int ( i ) ] , maxv [ j ] + time [ j ] - ( i / 2 ) )
            if i >= 2 * time [ j + 1 ] :
                maxv_Every_0_5_seconds [ int ( i ) ] = min ( maxv_Every_0_5_seconds [ int ( i ) ] , maxv [ j ] - time [ j + 1 ] + ( i / 2 ) )
            if i >= 2 * time [ j ] and i <= 2 * time [ j + 1 ] :
                maxv_Every_0_5_seconds [ int ( i ) ] = min ( maxv_Every_0_5_seconds [ int ( i ) ] , maxv [ j ] - time [ j + 1 ] + ( i / 2 ) )
    ans = 0
    for i in range ( total_time * 2 ) :
        ans += 0.25 * ( maxv_Every_0_5_seconds [ i ] + maxv_Every_0_5_seconds [ i + 1 ] )
    print ( ans )
