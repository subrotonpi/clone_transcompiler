def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.solve ( )
        def solve ( self ) :
            sc = sys.stdin
            h1 , w1 = map ( int , sc.readline ( ).split ( ) )
            h2 , w2 = map ( int , sc.readline ( ).split ( ) )
            sc.close ( )
            n1 , n2 = h1 * w1 , h2 * w2
            print ( n1 > n2 )
    return Main ( )
