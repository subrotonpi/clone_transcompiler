def main ( ) :
    import sys
    from numpy.testing import assert_equal
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.a = [ ]
            for i in range ( 3 ) :
                self.a.append ( i )
            if self.a [ 0 ] > self.a [ 1 ] :
                if self.a [ 0 ] > self.a [ 2 ] :
                    print ( 1 )
                    if self.a [ 1 ] > self.a [ 2 ] :
                        print ( 2 )
                        print ( 3 )
                    else :
                        print ( 3 )
                        print ( 2 )
                else :
                    print ( 2 )
                    print ( 3 )
                    print ( 1 )
            else :
                if not ( self.a [ 0 ] > self.a [ 2 ] ) :
                    print ( 3 )
                    if self.a [ 1 ] > self.a [ 2 ] :
                        print ( 1 )
                        print ( 2 )
                    else :
                        print ( 2 )
                        print ( 1 )
                else :
                    print ( 2 )
                    print ( 1 )
                    print ( 3 )
