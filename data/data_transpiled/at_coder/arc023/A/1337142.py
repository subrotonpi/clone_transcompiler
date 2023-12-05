def _import ( ) :
    import os
    import struct
    import math
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            y = sc.read ( 1 )
            m = sc.read ( 1 )
            d = sc.read ( 1 )
            if m in ( 1 , 2 ) :
                y -= 1
                m += 12
            today = 735369
            backward = 365 * y + math.floor ( y / 4.0 ) - math.floor ( y / 100.0 ) + math.floor ( y / 400.0 ) + math.floor ( 306 * ( m + 1 ) / 10.0 ) + d - 429
            print ( today - int ( backward ) )
    is_debug = os.environ.get ( 'DESKTOP' ) != ''
    def debug ( * x ) :
        if is_debug :
            print ( " ".join ( x ) , file = sys.stderr )
    class Scanner ( object ) :
        def __init__ ( self , fh ) :
            self.fh = fh
        def read ( self ) :
            num = 0
            read = skip ( )
            while True :
                num = num * 10 + ( read - 0x30 )
        def fill ( self , a ) :
            for i in range ( len ( a ) ) :
                a [ i ] = randint ( )
        def read ( self ) :
            num = 0
            read = skip ( )
            while True :
                num = num * 10 + ( read - 0x30 )
        def fill ( self , a ) :
            for i in range ( len ( a ) ) :
                a [ i ] = randint ( )
        def read ( self ) :
            num = 0
            read = skip ( )
            while True :
                num = num * 10 + ( read - 0x30 )
        def read ( self ) :
            for i in range ( len ( a ) ) :
                a [ i ] = randint ( )
    return Main ( )
