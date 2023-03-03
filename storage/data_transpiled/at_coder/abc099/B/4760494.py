def import import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        a = sc.read ( )
        b = sc.read ( )
        high = 0
        for n in range ( 1 , b - a ) :
            high += n
        print ( high - a )
