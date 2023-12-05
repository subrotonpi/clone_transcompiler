def _import ( ) :
    from os import isatty
    from io import BytesIO
    from os.path import expanduser
    from os.path import join
    from os.path import expanduser
    from os.path import join
    class Main ( object ) :
        sc = SC ( sys.stdin )
        a = sc.__next__ ( )
        sum = a * ( a + 1 ) // 2
        if isPrime ( sum ) :
            pl ( "WANWAN" )
        else :
            pl ( "BOWWOW" )
    class SC ( object ) :
        def __init__ ( self , f ) :
            self.f = f
            self.tokens = None
        def readline ( self ) :
            if not self.tokens or not self.tokens [ 0 ] :
                try :
                    self.tokens = iter ( self.f )
                except TypeError :
                    raise OSError ( "readline must be a string" )
            return self.tokens [ 0 ]
        def __next__ ( self ) :
            return int ( next ( self.tokens ) )
        def __next__ ( self ) :
            return long ( next ( self.tokens ) )
        def nextDouble ( self ) :
            return float ( next ( self.tokens ) )
        def readline ( self ) :
            try :
                return self.readline ( )
            except TypeError :
                raise OSError ( "readline must be a string" )
    def pl ( x ) :
        print ( x )
    def p ( x ) :
        print ( x , end = "" )
    def isPrime ( a ) :
        if a < 4 :
            if a == 2 or a == 3 :
                return True
            else :
                return False
        else :
            for j in range ( 2 , 2 * j <= a + 1 ) :
                if a % j == 0 :
                    return False
                if a % j != 0 and ( j + 1 ) * ( j + 1 ) > a :
                    return True
            return True
    return pl
