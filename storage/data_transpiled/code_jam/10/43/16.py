def _import ( ) :
    import os
    import sys
    import os
    import os
    import sys
    import os
    import os
    import sys
    import time
    class Main ( object ) :
        def _ReadFromFile ( self ) :
            self._ReadFromFile = os.environ.get ( 'ONLINE_PYGE' ) is None
            self._WriteToFile = True
        def writeCase ( self , * os ) :
            print ( "Case #%d:" % self._ReadFromFile ( ) )
        def debug ( self ) :
            self._ReadFromFile ( )
            self._WriteToFile ( )
        def read ( self ) :
            return int ( self._ReadFromFile ( ) )
        def nextDouble ( self ) :
            return float ( self._ReadFromFile ( ) )
        def readline ( self ) :
            return raw_input ( )
        def write ( self , * args ) :
            return raw_input ( )
        def core ( self ) :
            ntest = randint ( )
            for test in range ( ntest ) :
                n = randint ( )
                x1 , x2 , y1 , y2 = [ randint ( ) for _ in range ( n ) ]
                for i in range ( n ) :
                    x1 [ i ] , y1 [ i ] , y2 [ i ] = [ randint ( ) for _ in range ( n ) ]
            return tuple ( [ 1 for _ in range ( n ) ] )
    def solve ( board ) :
        for day in range ( 0 , len ( board ) - 1 , - 1 ) :
            empty = True
            for i in range ( 0 , len ( board ) ) :
                for j in range ( 0 , len ( board [ i ] ) ) :
                    if board [ i ] [ j ] > 0 :
                        empty = False
                        break
            if empty : return day
            for i in range ( 0 , len ( board ) - 1 , - 1 ) :
                for j in range ( 0 , len ( board [ i ] ) ) :
                    if board [ i ] [ j ] > 0 :
                        die = False
                        break
    return
