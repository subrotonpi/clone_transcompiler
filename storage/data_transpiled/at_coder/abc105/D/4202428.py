def main ( ) :
    import sys
    from math import ceil
    sc = sys.stdin
    N = int ( sc.readline ( ) )
    M = int ( sc.readline ( ) )
    d = { }
    sum = [ 0 ] * ( N + 1 )
    A = [ int ( sc.readline ( ) ) ] + [ 0 ] * ( N + 1 )
    d [ int ( sum [ 1 ] % M ) ] = 1
    for i in range ( 2 , N + 1 ) :
        A [ i ] = int ( sc.readline ( ) )
        sum [ i ] = sum [ i - 1 ] + A [ i ]
        mod = int ( sum [ i ] % M )
        if mod in d :
            d [ mod ] = d [ mod ] + 1
        else :
            d [ mod ] = 1
    ans = 0
    for ( mod , d ) in d.items ( ) :
        temp = 0
        if mod == 0 :
            for i in range ( d ) :
                temp += i
        else :
            for i in range ( d [ - 1 ] , d [ - 1 ] ) :
                temp += i
        if temp != 0 or mod == 0 :
            ans += temp
    print ( ans )
