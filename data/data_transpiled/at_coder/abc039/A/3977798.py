def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a , self.b , self.c = sys.stdin.read ( ).decode ( ).decode ( ).split ( '\n' )
        def execute ( self ) :
            print ( self.a * b * 2 + self.b * c * 2 + self.c * a * 2 )
