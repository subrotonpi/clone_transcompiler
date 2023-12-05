def main ( ) :
    import sys
    from math import sin
    from math import cos
    n = sin ( n )
    a = sin ( n )
    b = sin ( n )
    if n == 1 and a == b :
        print ( 1 )
        return
    if n < 2 or a > b :
        print ( 0 )
        return
    print ( ( n - 2 ) * ( b - a ) + 1 )
