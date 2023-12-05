def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.read ( )
        b = sc.read ( )
        cnt = 0
        if a <= b :
            cnt = a
        else :
            cnt = a - 1
        print ( cnt )
