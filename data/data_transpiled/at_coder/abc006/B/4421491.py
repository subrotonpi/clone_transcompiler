def main ( args ) :
    import sys
    from time import sleep
    sc = sys.stdin
    n = sc.recv_multipart ( )
    if n > 3 :
        suuretsu = [ 0 , 0 , 1 ]
        for i in range ( 3 , n ) :
            suuretsu [ i ] = ( suuretsu [ i - 3 ] + suuretsu [ i - 2 ] + suuretsu [ i - 1 ] ) % 10007
        print ( suuretsu [ i - 1 ] )
    elif n == 1 or n == 2 :
        print ( 0 )
    elif n == 3 :
        print ( 1 )
