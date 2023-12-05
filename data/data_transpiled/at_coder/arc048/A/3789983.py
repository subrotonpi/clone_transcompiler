def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = sys.stdin.read ( )
            self.b = sys.stdin.read ( )
        def __call__ ( self , * args , ** kwargs ) :
            if self.a < 0 and self.b > 0 :
                print ( ( abs ( a ) + b - 1 ) )
            elif self.a < 0 and self.b < 0 :
                print ( ( abs ( a - b ) ) )
            elif self.a > 0 and self.b > 0 :
                print ( ( ( b - a ) ) )
