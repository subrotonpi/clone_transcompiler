def main ( ) :
    import sys
    from math import sin , cos
    from math import ceil
    from math import sin
    a = sin ( a )
    b = sin ( b )
    c = sin ( c )
    if a % 2 == 0 or b % 2 == 0 or c % 2 == 0 :
        print ( 0 )
    else :
        print ( min ( a * b , min ( b * c , c * a ) ) )
