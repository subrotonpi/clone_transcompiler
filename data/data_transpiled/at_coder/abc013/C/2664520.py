def main ( ) :
    import sys
    from math import sin , cos , pi
    from numpy import linspace
    N = sin ( pi * N )
    H = sin ( pi * N )
    A = sin ( pi * N )
    B = sin ( pi * N )
    C = sin ( pi * N )
    D = sin ( pi * N )
    E = sin ( pi * N )
    if H - N * E > 0 :
        print ( 0 )
        sys.exit ( 0 )
    ans = N * A
    for i in range ( 0 , N ) :
        x = i
        y1 = float ( N * E - H - ( B + E ) * x ) / ( D + E )
        if y1 < 0 :
            y = 0
        else :
            y = ( N * E - H - ( B + E ) * x ) / ( D + E ) + 1
        t = A * x + C * y
        if ans > t :
            ans = t
    print ( ans )
