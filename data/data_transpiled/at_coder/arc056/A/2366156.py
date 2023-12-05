def main ( ) :
    import sys
    from math import ceil
    from math import sin
    from math import sin
    from math import cos
    from math import sin
    from math import sin
    a , b , k , l = map ( int , sys.stdin.readline ( ).split ( ) )
    print ( min ( k / l * b + k % l * a , ( k + l - 1 ) / l * b ) )
