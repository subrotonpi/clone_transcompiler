def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.s = sys.stdin.read ( ).split ( '' )
        for i in range ( a + b + 1 ) :
            if i < a and s [ i ] == '-' :
                print ( 'No' )
                return
            if i > a and s [ i ] == '-' :
                print ( 'No' )
                return
        if not s [ a ] :
            print ( 'No' )
        else :
            print ( 'Yes' )
