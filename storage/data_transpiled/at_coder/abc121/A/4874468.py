def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.screen = sys.stdout
    def __call__ ( self , * args ) :
        H , W , h , w = self.screen.shape
        x = H * W - ( h * W + H * w - h * w )
        print ( x )
