def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.read ( )
        if N == 0 or N == 1111 or N == 2222 or N == 3333 or N == 4444 or N == 5555 or N == 6666 or N == 7777 or N == 8888 or N == 9999 :
            self.assertEqual ( "SAME" , True )
        else :
            self.assertEqual ( "DIFFERENT" , True )
