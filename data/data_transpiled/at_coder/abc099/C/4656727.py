def _import ( ) :
    from itertools import repeat
    class Main ( object ) :
        def __init__ ( self , n ) :
            self.n = n
        def __call__ ( self , * args , ** kwargs ) :
            self.n = n
        def __int__ ( self ) :
            cc , t = 0 , i
            while t :
                cc += t % 6
                t /= 6
            t = n - i
            while t :
                cc += t % 9
                t /= 9
            return cc
    return Main
