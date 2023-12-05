def main ( ) :
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            a = self.sc.read ( )
            b = self.sc.read ( )
            x = 0
            if 1 <= a <= 100 :
                x = ( a + b ) / 2
            x = math.ceil ( x )
            print ( int ( x ) )
