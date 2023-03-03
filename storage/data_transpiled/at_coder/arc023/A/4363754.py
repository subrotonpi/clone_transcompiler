def _ _ import _ _ ( ) :
    import sys
    import math
    class Main ( object ) :
        def __init__ ( self , * args , ** kwargs ) :
            with open ( "input.txt" , "r" ) as f :
                y , m , d = f.read ( ).split ( " " )
                self.out.append ( c ( 2014 , 5 , 17 ) - c ( y , m , d ) )
        def c ( y , m , d ) :
            if m < 3 :
                m += 12
                y -= 1
            return 365 * y + y // 4 - y // 100 + y // 400 + ( 306 * ( m + 1 ) ) // 10 + d - 429
    return Main
