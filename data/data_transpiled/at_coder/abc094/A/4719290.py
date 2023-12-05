def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        A = sys.stdin.read ( )
        B = sys.stdin.read ( )
        X = sys.stdin.read ( )
        if A > X :
            self.answer ( False )
        else :
            self.answer ( B >= X - A )
    def answer ( yes ) :
        print ( 'YES' if yes else 'NO' )
