def import _main
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.a , k = _main ( * args , ** kwargs )
        if k == 0 :
            print ( 2000000000000L - a )
        else :
            ans = 1
            while ( a += a * k + 1 ) < 2000000000000L :
                ans += 1
            print ( ans )
