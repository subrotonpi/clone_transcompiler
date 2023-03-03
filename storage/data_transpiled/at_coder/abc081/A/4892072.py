def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        x = sc.readline ( ).split ( '' )
        sum = 0
        for x in x :
            if int ( x ) == 1 :
                sum += 1
        print ( sum )
