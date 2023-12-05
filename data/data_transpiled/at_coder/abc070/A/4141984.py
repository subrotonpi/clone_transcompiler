def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = sys.stdin.read ( )
            self.b = self.a % 10
            self.a /= 10
            self.c = self.a % 10
            if self.b == self.c :
                print ( "Yes" )
            else :
                print ( "No" )
