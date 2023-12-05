def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.ans = 0
        for po in self.sc :
            p = po.split ( '' , 1 )
            for i in range ( len ( p ) ) :
                if p [ i ] == 'r' :
                    self.ans += 1
                    break
        print ( self.ans )
