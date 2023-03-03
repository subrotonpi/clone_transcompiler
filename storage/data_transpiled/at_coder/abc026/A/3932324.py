def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
        def __call__ ( self , * args ) :
            self.A = int ( args )
            x = A // 2
            y = A // 2 + A % 2
            print ( x * y )
    return Main
