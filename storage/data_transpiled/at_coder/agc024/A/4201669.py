def main ( ) :
    import math
    class Main ( object ) :
        def __init__ ( self , * args ) :
            self.A = int ( args [ 0 ] )
            self.B = int ( args [ 1 ] )
            self.C = int ( args [ 2 ] )
            self.K = int ( args [ 3 ] )
            if self.K % 2 == 0 :
                if A - B > math.pow ( 10 , 18 ) :
                    print ( "Unfair" )
                else :
                    print ( A - B )
            else :
                if B - A > math.pow ( 10 , 18 ) :
                    print ( "Unfair" )
                else :
                    print ( B - A )
