def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = sys.stdin.read ( )
            self.yoke = 0
            self.count = 0
            for i in range ( 3 ) :
                self.count += self.a % 10
                self.a -= self.a % 10
                self.a /= 10
            print ( self.count )
