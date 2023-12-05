def import _main
class Main ( object ) :
    def __init__ ( self , data ) :
        self.data = data
    def __call__ ( self , * args ) :
        sc = _main ( )
        n = sc.data [ 0 ]
        m = sc.data [ 1 ]
        if m <= n / 2 :
            print ( m - 1 )
        else :
            print ( n - m )
    class Pair ( object ) :
        def __init__ ( self , * args ) :
            self.data = data
        def __call__ ( self , * args ) :
            self.data = self.data
        def end ( self ) :
            self.data = self.data
