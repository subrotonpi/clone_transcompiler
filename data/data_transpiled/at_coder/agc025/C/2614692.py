def _import ( ) :
    from itertools import repeat
    from itertools import chain
    from os import urandom
    from random import randint
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self.N = randint ( 1 , 10000 )
        def __call__ ( self ) :
            sc = urandom ( )
            N = sc.randint ( 1 , 10000 )
            L = [ sc.randint ( 1 , 10000 ) for _ in range ( N + 1 ) ]
            R = [ - sc.randint ( 1 , 10000 ) for _ in range ( N + 1 ) ]
            ans = 0
            L.sort ( )
            R.sort ( )
            for i in range ( N , - 1 , - 1 ) :
                if L [ i ] + R [ i ] > 0 :
                    ans += 2 * ( L [ i ] + R [ i ] )
            print ( ans )
        def tr ( self , * args ) :
            print ( chain ( * args ) )
    return Main
