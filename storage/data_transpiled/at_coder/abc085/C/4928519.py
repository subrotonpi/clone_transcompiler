def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = int ( self.N )
            self.Yen = int ( self.Yen )
            self.e = 0
            for x in range ( 0 , N ) :
                for y in range ( 0 , N ) :
                    z = N - x - y
                    if ( z >= 0 ) :
                        print ( x , y , z )
                        break
                    elif ( x == N ) :
                        print ( "-1 -1 -1" )
