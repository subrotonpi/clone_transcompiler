def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.read ( )
        for i in range ( 0 , n ** 2 ) :
            print ( i * i )
