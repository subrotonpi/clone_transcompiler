def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            A = [ ]
            for i in range ( 3 ) :
                A.append ( sc.read ( ) )
            A.sort ( )
            ans = A [ 2 ] - A [ 0 ]
            print ( ans )
