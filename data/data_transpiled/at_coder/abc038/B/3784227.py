def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.hw1 = sys.stdin.readline ( ).split ( )
            self.hw2 = sys.stdin.readline ( ).split ( )
    hw1 = sys.stdin.readline ( ).rstrip ( ).split ( )
    hw2 = sys.stdin.readline ( ).rstrip ( ).split ( )
    h1 = int ( hw1 [ 0 ] )
    w1 = int ( hw1 [ 1 ] )
    h2 = int ( hw2 [ 0 ] )
    w2 = int ( hw2 [ 1 ] )
    if h1 == h2 or h1 == w2 or w1 == h2 or w1 == w2 :
        print ( "YES" )
    else :
        print ( "NO" )
