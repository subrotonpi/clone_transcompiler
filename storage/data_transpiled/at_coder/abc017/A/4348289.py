def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.a = 0
            for i in range ( 3 ) :
                self.a += self.sc.randint ( 0 , 10 ) * self.sc.randint ( 0 , 10 )
            print ( self.a )
