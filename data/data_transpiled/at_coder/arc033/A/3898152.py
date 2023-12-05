def _import ( ) :
    from os import system , read , readline
    from os.dup2 import dupfile as _dupfile
    from os.dup3 import close as _close
    from os.dup3 import close as _close
    from os.dup3 import dupfile as _close
    class Main ( object ) :
        sc = SC ( sys.stdin )
        a = sc.__next__ ( )
        pl ( a * ( a + 1 ) / 2 )
    class SC ( object ) :
        def __init__ ( self , stream ) :
            sc.stream = stream
            self.tokens = None
        def readline ( self ) :
            if not self.tokens or not self.tokens [ 0 ] :
                try :
                    self.tokens = list ( self.tokens )
                except AttributeError :
                    raise OSError ( "No tokens found in file" )
            return _close ( self )
        def __next__ ( self ) :
            return int ( self.tokens [ 0 ] )
        def __next__ ( self ) :
            return long ( self.tokens [ 1 ] )
        def nextDouble ( self ) :
            return float ( self.tokens [ 2 ] )
        def readline ( self ) :
            try :
                return open ( self.tokens [ 0 ] , "r" ).readline ( )
            except IOError :
                raise OSError ( "No tokens found in file" )
    def pl ( x ) :
        print ( x )
    def p ( x ) :
        print ( x , end = "" )
