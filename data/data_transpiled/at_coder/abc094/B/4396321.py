def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n , m , x = sc.readline ( ).split ( )
        po = [ 0 ] * ( n + 1 )
        for i in range ( m ) :
            po [ sc.readline ( ).strip ( ) ] += 1
        r , l = 0 , 0
        for i in range ( x , n + 1 ) :
            r += po [ i ]
        for i in range ( 0 , x + 1 ) :
            l += po [ i ]
        print ( min ( r , l ) )
