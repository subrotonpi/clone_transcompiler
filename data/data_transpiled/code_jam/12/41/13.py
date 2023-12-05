def main ( args ) :
    import sys
    from matplotlib import pyplot as plt
    from matplotlib.utils import get_fignums
    plt.show ( )
    T = len ( args )
    for ca in range ( 1 , T + 1 ) :
        rtn = False
        n = len ( args )
        a = [ ( x , y ) for x , y in zip ( args [ ca ] , args [ ca ] ) ]
        d = len ( args )
        s = [ a [ 0 ] [ 0 ] ]
        for i in range ( n ) :
            for j in range ( i + 1 , n ) :
                if a [ j ] [ 0 ] <= s [ i ] + a [ i ] [ 0 ] :
                    s [ j ] = max ( s [ j ] , min ( a [ j ] [ 0 ] - a [ i ] [ 0 ] , a [ j ] [ 1 ] ) )
        for i in range ( n ) :
            if d <= a [ i ] [ 0 ] + s [ i ] :
                rtn = True
        print ( "Case #{}: {}".format ( ca , "YES" if rtn else "NO" ) )
