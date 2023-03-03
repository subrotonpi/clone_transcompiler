def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.i = self.sc.randint ( 0 , 11 )
            if self.i == 11 :
                self.print ( 12 )
            else :
                self.print ( ( self.i + 1 ) % 12 )
