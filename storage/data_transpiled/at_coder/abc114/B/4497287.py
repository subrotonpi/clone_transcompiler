def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        s = self.sc.readline ( )
        abs = sys.maxint
        for i in range ( len ( s ) - 2 ) :
            num = int ( s [ i : i + 3 ] )
            if abs ( num - 753 ) < abs :
                abs = abs ( num - 753 )
        print ( abs )
