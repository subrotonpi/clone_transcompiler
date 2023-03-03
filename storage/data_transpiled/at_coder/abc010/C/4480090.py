def import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.readline ( ).split ( )
        ax = int ( s [ 0 ] )
        ay = int ( s [ 1 ] )
        bx = int ( s [ 2 ] )
        by = int ( s [ 3 ] )
        T = int ( s [ 4 ] )
        V = int ( s [ 5 ] )
        n = int ( sc.readline ( ).split ( ) [ 0 ] )
        dis = T * V
        for i in range ( n ) :
            cx = sc.readline ( ).split ( ) [ 0 ]
            cy = sc.readline ( ).split ( ) [ 1 ]
            L1 = ( ax - cx ) ** 2 + ( ay - cy ) ** 2
            L2 = ( bx - cx ) ** 2 + ( by - cy ) ** 2
            LD1 = math.sqrt ( L1 )
            LD2 = math.sqrt ( L2 )
            LD = LD1 + LD2
            if dis >= LD :
                print ( "YES" )
                sys.exit ( )
        print ( "NO" )
