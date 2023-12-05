def import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        n = sc.read ( )
        if n % 2 :
            n *= 2
        print ( n )
