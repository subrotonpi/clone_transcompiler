def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a , self.b , self.c = sys.stdin.read ( ).split ( '\n' )
            if self.a >= self.b :
                print ( self.c / self.b )
            else :
                print ( self.c / self.a )
