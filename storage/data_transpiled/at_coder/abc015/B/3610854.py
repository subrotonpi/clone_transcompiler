def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.read ( )
        counter = 0
        souwa = 0
        for i in range ( N ) :
            tmp = sc.read ( )
            if tmp :
                souwa += tmp
                counter += 1
        print ( ( souwa + counter - 1 ) / counter )
