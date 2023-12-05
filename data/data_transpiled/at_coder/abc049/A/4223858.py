def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        a = self.sc.read ( ) [ 0 ]
        print ( a == 'a' or a == 'i' or a == 'u' or a == 'e' or a == 'o' )
