def main ( ) :
    import os
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = 100
        def __next__ ( self ) :
            return 42
        def __call__ ( self , * args ) :
            return args
    n = Main ( )
    m = n
    i = 0
    while 1 :
        i += 1
        if m <= 111 :
            print ( i * 111 )
            break
        m -= 111
    sys.exit ( 1 )
