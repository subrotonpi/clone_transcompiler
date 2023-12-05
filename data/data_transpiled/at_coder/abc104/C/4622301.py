def Main ( ) :
    global _Main
    d , g = _Main.value
    p , c = [ _Main.value for _Main in range ( d ) ]
    ans = 10000
    for i in range ( 1 << d ) :
        sum , count , zero = 0 , 0 , 0
        for j in range ( d ) :
            if ( 1 << j & i ) :
                sum += ( j + 1 ) * 100 * p [ j ] + c [ j ]
                count += p [ j ]
            else :
                zero = j
        if sum < g :
            t = int ( math.ceil ( ( g - sum ) / ( ( zero + 1 ) * 100F ) ) )
            if p [ zero ] < t :
                continue
            count += math.ceil ( ( g - sum ) / ( ( zero + 1 ) * 100F ) )
        ans = min ( ans , count )
    print ( ans )
