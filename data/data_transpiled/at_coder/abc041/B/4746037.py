def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a , self.b , self.c = sys.stdin.read ( ).decode ( ).split ( '\n' )
        def execute ( self ) :
            print ( self.a * self.b % 1000000007 * self.c % 1000000007 )
