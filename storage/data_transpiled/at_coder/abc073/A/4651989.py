def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        x = self.sc.randint ( 0 , 9 )
        if x % 10 == 9 or x / 10 == 9 :
            print ( "Yes" )
        else :
            print ( "No" )
