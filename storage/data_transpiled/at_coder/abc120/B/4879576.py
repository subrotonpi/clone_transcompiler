def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = int ( self.A )
            self.B = int ( self.B )
            self.K = int ( self.K )
            M = min ( A , B )
            data = [ ]
            for i in range ( 1 , M + 1 ) :
                if A % i == 0 and B % i == 0 :
                    data.append ( i )
            print ( data [ - K ] , end = ' ' )
