def main ( ) :
    import math
    from numpy import sin , cos , pi
    from numpy import pi
    A = pi * ( A + B )
    B = pi * ( A + B )
    C = pi * ( A + B )
    pi = pi * ( A + B )
    t0 = ( B + 100 ) / A
    f0 = A * t0 + B * sin ( C * pi * t0 )
    temp = t0
    t = 0
    for i in range ( 1000 ) :
        t = temp - ( A * temp + B * sin ( C * pi * temp ) - 100 ) / ( A + B * C * pi * cos ( C * pi * temp ) )
        temp = t
        f = A * t + B * sin ( C * pi * t )
        if abs ( f - 100 ) < 0.00000001 :
            break
    print ( t )
