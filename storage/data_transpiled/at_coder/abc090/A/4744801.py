def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = sys.stdin.read ( )
            self.b = sys.stdin.read ( )
            self.c = sys.stdin.read ( )
        def execute ( self ) :
            print ( self.a , self.b , self.c )
