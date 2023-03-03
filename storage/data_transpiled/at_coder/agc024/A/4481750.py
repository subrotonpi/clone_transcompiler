def main ( ) :
    import sys
    from time import sleep
    from math import pi
    from math import log
    from math import pi
    A , B , C , K = map ( int , sys.stdin.read ( ).split ( ) )
    if C == 0 :
        sys.exit ( 0 )
    ans = B - A
    if K % 2 == 0 :
        ans *= - 1
    print ( ans )
