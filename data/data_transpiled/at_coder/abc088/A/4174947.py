def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        print ( 'Yes' if self.sc % 500 <= self.sc else 'No' )
