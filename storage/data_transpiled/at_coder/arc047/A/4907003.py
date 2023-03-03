def import _main
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.n , self.l , self.t , ans = self.n , self.l , 1 , 0
        for c in self.n :
            if ( c == '+' ) : ans += 1
        print ( ans )
