def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.ans = 'NO'
    def __call__ ( self , * args ) :
        sc = _main ( args )
        N = sc.N
        if N in [ 7 , 5 , 3 ] :
            self.ans = 'YES'
        print ( self.ans )
