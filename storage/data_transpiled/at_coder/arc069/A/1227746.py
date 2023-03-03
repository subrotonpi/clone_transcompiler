def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n , self.m = self.n , self.m
    for n , m in enumerate ( sys.argv ) :
        print ( min ( m / 2 , ( m + 2 * n ) / 4 ) )
