def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        i , x , n = sc.readline ( ).strip ( ).split ( ' ' )
        m1 = 1 , m2 = 0
        for i in range ( n ) :
            x = sc.readline ( ).strip ( )
            if m1 < x :
                m2 = m1
                m1 = x
            if m2 < x and m1 != x :
                m2 = x
        print ( m2 )
