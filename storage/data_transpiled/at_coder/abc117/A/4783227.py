def import _main
class Main ( object ) :
    def __init__ ( self , * args ) :
        self.args = args
    def __call__ ( self , * args ) :
        self.args = args
        t = _main.args [ 0 ]
        x = _main.args [ 1 ]
        ans = t / x
        print ( ans )
