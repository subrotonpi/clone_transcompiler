def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        x = self.sc.readline ( ).strip ( )
        y = self.sc.readline ( ).strip ( )
        if x < y :
            print ( "<" )
        elif x > y :
            print ( ">" )
        else :
            print ( "=" )
