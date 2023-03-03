def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.readline ( ).split ( )
        s1 = int ( s [ 0 ] )
        s2 = int ( s [ 1 ] )
        t = sc.readline ( ).split ( )
        t1 = int ( t [ 0 ] )
        t2 = int ( t [ 1 ] )
        u = sc.readline ( ).split ( )
        u1 = int ( u [ 0 ] )
        u2 = int ( u [ 1 ] )
        m1 = ( s1 * s2 ) / 10
        m2 = ( t1 * t2 ) / 10
        m3 = ( u1 * u2 ) / 10
        print ( m1 + m2 + m3 )
