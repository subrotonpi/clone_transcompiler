def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
    def __call__ ( self , x , y , z ) :
        self.N = x
        self.ans = y
        self.N = z
    def semians ( self ) :
        self.N = x
        if self.N % 2 :
            self.ans -= 1
        print ( self.ans )
