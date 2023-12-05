def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        self.set = set ( [ sc.get ( 'a' ) , sc.get ( 'b' ) , sc.get ( 'c' ) ] )
        print ( len ( self.set ) )
