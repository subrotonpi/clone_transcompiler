def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        output = 0
        for i in range ( 12 ) :
            if 'r' in sc.readline ( ) :
                output += 1
        print ( output )
