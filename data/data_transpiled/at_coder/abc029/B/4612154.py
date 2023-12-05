def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        c = 0
        for i in range ( 12 ) :
            s = sc.readline ( )
            if 'r' in s :
                c += 1
        print ( c )
