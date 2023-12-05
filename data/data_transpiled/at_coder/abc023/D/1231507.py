def main ( ) :
    import math
    from time import sleep
    sc = Scanner ( )
    N = sc.nextInt ( )
    h = [ sc.nextLong ( ) for i in range ( N ) ]
    s = [ sc.nextLong ( ) for i in range ( N ) ]
    ans = 0
    left = 1
    right = 2 * int ( pow ( 10 , 14 ) )
    while left < right :
        med = ( left + right ) / 2
        time = [ ]
        flg = True
        for i in range ( N ) :
            if med - h [ i ] < 0 :
                flg = False
                break
            time.append ( ( med - h [ i ] ) / s [ i ] )
        time = [ ( med - h [ i ] ) / s [ i ] for i in range ( N ) ]
        time = [ ( med - h [ i ] ) / s [ i ] for i in range ( N ) ]
        time = [ ( med - h [ i ] ) / s [ i ] for i in range ( N ) ]
        if flg :
            ans = med
            right = med
        else :
            left = med + 1
    print ( ans )
