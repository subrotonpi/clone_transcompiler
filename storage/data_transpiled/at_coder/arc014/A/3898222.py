def _import ( ) :
    from os import system , PIPE , I
    from os.dup2 import dupfile
    from os import dupfile
    from os import rename , pipes
    class Main ( object ) :
        sc = SC ( sys.stdin )
        N = sc.__next__ ( )
        if N % 2 == 0 :
            pl ( "Blue" )
        elif N % 2 == 1 :
            pl ( "Red" )
    class SC ( object ) :
        def __init__ ( self , f ) :
            self.f = f
            self.tokens = None
        def readline ( self ) :
            if not self.tokens or not self.tokens [ 0 ] :
                try :
                    self.tokens = list ( self.f.readline ( ) )
                except AttributeError :
                    raise OSError ( "readline not set" )
            return self.tokens [ 0 ]
        def randint ( self ) :
            return int ( self.tokens [ 0 ] )
        def long ( self ) :
            return long ( self.tokens [ 1 ] )
        def uniform ( self , size ) :
            return float ( self.tokens [ 2 ] )
        def readline ( self ) :
            try :
                return self.readline ( )
            except AttributeError :
                raise OSError ( "readline not set" )
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
    return Main ( )
