def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.read ( )
        m = sc.read ( )
        if n > 1 :
            n -= 2
        if m > 1 :
            m -= 2
        print ( n * m )
