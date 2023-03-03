def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.t = sys.stdin.readline ( )
            self.x = sys.stdin.readline ( )
        def solve ( self , t , x ) :
            return float ( t ) / x
    return Main ( )
