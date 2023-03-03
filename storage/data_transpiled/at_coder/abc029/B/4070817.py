def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        count = 0
        for i in range ( 12 ) :
            if 'r' in sc.readline ( ) :
                count += 1
        print ( count )
