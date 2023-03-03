def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            print ( float ( self.sc.value ) / self.sc.value < 1.5 and '4:3' or '16:9' )
