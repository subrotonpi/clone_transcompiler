def main ( argc ) :
    from math import sin , cos
    sc = sys.stdin
    N = sc.readline ( )
    S = sc.read ( )
    total_E = 0
    x = [ 0 ]
    for i in range ( N + 1 ) :
        if S [ i ] == 'E' :
            total_E += 1
            x [ i + 1 ] = x [ i ] + 1
        else :
            x [ i + 1 ] = x [ i ]
    ans = int ( 1e9 )
    for i in range ( N ) :
        ans = min ( ans , total_E + i - x [ i + 1 ] - x [ i ] )
    print ( ans )
