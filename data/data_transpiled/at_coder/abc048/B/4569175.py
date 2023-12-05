def main ( ) :
    import sys
    from time import sleep
    from math import sin , cos
    from math import log
    a , b , x = map ( int , sys.argv [ 1 : ] )
    a = ( a - 1 ) // x + 1 if a > 0 else 0
    b = b // x + 1
    cnt = b - a
    print ( cnt )
