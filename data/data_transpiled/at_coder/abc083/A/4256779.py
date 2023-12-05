def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a , self.b , self.c , self.d = sys.stdin.read ( ).split ( '\n' )
            print ( 'Left' if a + b > c + d else 'Balanced' if a + b == c + d else 'Right' )
