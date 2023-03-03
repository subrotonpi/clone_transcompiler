def _import ( ) :
    from itertools import count , repeat
    from os import urandom
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = urandom
            self.K = int ( count ( self.sc ) )
        def __getitem__ ( self , key ) :
            A = [ random.randint ( 0 , K ) for _ in range ( K ) ]
            max = 2
            min = 2
            for i in range ( K - 1 , - 1 , - 1 ) :
                if max < A [ i ] :
                    print ( - 1 )
                    return
                max = max // A [ i ] ** 2
                min = ( min + A [ i ] - 1 ) // A [ i ] ** 2
                max += A [ i ] - 1
                if max < min :
                    print ( - 1 )
                    return
            print ( min , max )
        def tr ( self , * args ) :
            print ( sum ( args ) )
        def __repr__ ( self ) :
            return '<< %s >' % repr ( self.sc )
    return Main ( )
