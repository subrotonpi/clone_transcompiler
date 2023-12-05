def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        st = str ( self.sc.readline ( ).rstrip ( ) ) + 1
        print ( ( len ( st ) - 1 ) * 9 + st [ 0 ] - '1' )
