def _import ( ) :
    from itertools import chain
    from itertools import chain
    class Main ( object ) :
        sc = chain ( [ 1 , 2 , 3 ] , repeat = 3 )
        def next ( self ) :
            yield chain ( [ 1 , 2 , 3 ] , repeat = 3 )
        print ( len ( chain ( [ 1 , 2 , 3 ] , repeat = 3 ) ) )
