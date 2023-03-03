def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a , self.b = sys.stdin.read ( ).split ( '\n' )
            self.s = self.a * self.b - self.a - self.b + 1
            print ( self.s )
