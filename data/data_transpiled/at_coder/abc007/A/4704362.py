def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.i = self.sc.randint ( 0 , 100 )
            print ( self.i - 1 )
