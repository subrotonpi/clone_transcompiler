def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        count = 0
        S = self.sc.readline ( )
        for c in S :
            if '+' == c :
                count += 1
            else :
                count -= 1
        print ( count )
