def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        point = 0
        for i in range ( 3 ) :
            point += sc.randint ( 0 , 10 ) * sc.randint ( 0 , 10 ) / 10
        print ( point )
