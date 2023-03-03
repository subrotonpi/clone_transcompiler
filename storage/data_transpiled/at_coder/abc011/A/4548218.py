def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        m = self.sc.recv_match ( type = 'INT' )
        if m != 12 :
            print ( m + 1 )
        else :
            print ( 1 )
