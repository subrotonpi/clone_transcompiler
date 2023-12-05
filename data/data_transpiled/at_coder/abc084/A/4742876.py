def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.M = int ( sys.stdin.read ( ) )
        def __call__ ( self , * args , ** kwargs ) :
            return self.M
    M = Main ( )
    x = 0
    if 1 <= M <= 23 :
        x = 24 + ( 24 - M )
    print ( x )
