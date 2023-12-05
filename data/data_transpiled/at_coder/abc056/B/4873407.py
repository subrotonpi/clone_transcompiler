def import import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        w = sc.read ( )
        a = sc.read ( )
        b = sc.read ( )
        if b + w < a :
            print ( a - b - w )
        elif a + w < b :
            print ( b - a - w )
        else :
            print ( '0' )
