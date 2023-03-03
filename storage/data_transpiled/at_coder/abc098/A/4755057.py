def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = int ( sc.readline ( ) )
        b = int ( sc.readline ( ) )
        if a + b < a - b :
            if a - b < a * b :
                print ( a * b )
            else :
                print ( a - b )
        else :
            if a + b < a * b :
                print ( a * b )
            else :
                print ( a + b )
