def main ( ) :
    import sys
    from math import sin , cos
    from math import pi
    from math import pi
    from math import pi
    a = pi.real
    b = pi.imag
    pi.real = pi.real
    if a <= 0 and b >= 0 :
        print ( "Zero" )
    elif b < 0 :
        l = abs ( b - a )
        if l % 2 == 1 :
            print ( "Positive" )
        else :
            print ( "Negative" )
    else :
        print ( "Positive" )
