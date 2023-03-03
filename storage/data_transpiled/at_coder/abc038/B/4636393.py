def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.solve ( )
        def solve ( self ) :
            sc = sys.stdin
            h1 , w1 = map ( int , sc.split ( ) )
            h2 , w2 = map ( int , sc.split ( ) )
            sc.close ( )
            if h1 == h2 or h1 == w2 or w1 == h2 or w1 == w2 :
                print ( "YES" )
            else :
                print ( "NO" )
    return Main ( )
