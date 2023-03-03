def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n , m , g = 0 , 0 , 0
        for i in range ( 3 ) :
            n , m = sc.read ( ).split ( ' ' )
            g += n * m / 10
        print ( g )
