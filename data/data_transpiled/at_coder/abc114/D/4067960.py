def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            N = sc.read ( )
            sosu = [ ]
            for i in range ( 0 , N + 1 ) :
                temp = i
                cnt = 2
                while temp > 1 and cnt < N :
                    while temp % cnt == 0 :
                        sosu [ cnt ] += 1
                        temp = temp / cnt
                    cnt += 1
    ans = 0
    d = { }
    n74 = ( d [ 74 ] , d [ 74 ] )
    n24 = ( d [ 24 ] , d [ 24 ] )
    n14 = ( d [ 14 ] , d [ 14 ] )
    n4 = ( d [ 4 ] , d [ 4 ] )
    n2 = ( d [ 2 ] , d [ 2 ] )
    for i in range ( 0 , N + 1 ) :
        n74 = ( d [ 74 ] , d [ 74 ] )
        n24 = ( d [ 24 ] , d [ 24 ] )
        n14 = ( d [ 14 ] , d [ 14 ] )
        n4 = ( d [ 4 ] , d [ 4 ] )
        n2 = ( d [ 2 ] , d [ 2 ] )
        if sosu [ i ] >= 74 :
            d [ 74 ] = n74 + 1
        if sosu [ i ] >= 24 :
            d [ 24 ] = n24 + 1
        if sosu [ i ] >= 14 :
            d [ 14 ] = n14 + 1
        if sosu [ i ] >= 4 :
            d [ 4 ] = n4 + 1
        if sosu [ i ] >= 2 :
            d [ 2 ] = n2 + 1
    return ans
