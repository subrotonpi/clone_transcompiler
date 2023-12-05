def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        x = int ( self.sc )
        a = x // 11
        b = x % 11
        if b == 0 :
            print ( str ( a * 2 ) )
        elif b <= 6 :
            print ( str ( a * 2 + 1 ) )
        else :
            print ( str ( a * 2 + 2 ) )
