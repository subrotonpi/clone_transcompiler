def main ( arg = None ) :
    import sys
    class Main ( object ) :
        def __init__ ( self , s ) :
            self.s = s
    S = sys.argv [ 1 : ]
    a = int ( S [ 0 ] )
    b = int ( S [ 1 ] )
    c = int ( S [ 2 ] )
    sys.exit ( 1 )
    for i in range ( 1 , b + 1 ) :
        if a * i % b == c :
            print ( "YES" )
            sys.exit ( 0 )
    print ( "NO" )
