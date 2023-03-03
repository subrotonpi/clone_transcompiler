def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            a = int ( self.sc )
            a -= a % 3
            print ( a / 3 )
