def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.__doc__ = sys.stdout.read ( ).decode ( )
        def __call__ ( self , * args , ** kwargs ) :
            line = self.__doc__.split ( )
            w = int ( line [ 0 ] )
            h = int ( line [ 1 ] )
            if w * 3 == h * 4 :
                print ( '4:3' )
            else :
                print ( '16:9' )
