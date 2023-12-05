def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.input = sys.stdin
        def __init__ ( self ) :
            self.output = False
            self.N = None
            for l in range ( 1 , 11 ) :
                self.output ( False , int ( pow ( 10 , l ) ) )
                if self.input ( self ) == 0 :
                    break
            if l != 11 :
                n_min = int ( pow ( 10 , l - 1 ) )
                n_max = int ( pow ( 10 , l ) ) - 1
                while n_min != n_max :
                    n = ( n_min + n_max ) / 2
                    self.output ( False , ( n * 10L ) )
                    if self.input ( self ) == 0 :
                        n_min = n + 1
                    else :
                        n_max = n
                N = n_min
            else :
                for l in range ( 10 ) :
                    self.output ( False , int ( pow ( 10 , l ) * 2 ) )
                    if self.input ( self ) == 1 :
                        N = int ( pow ( 10 , l ) )
                        break
            self.output ( True , N )
        def output ( self , answer_flag , n ) :
            if answer_flag :
                print ( "! %d" % n )
            else :
                print ( "? %d" % n )
            sys.stdout.flush ( )
        def input ( self ) :
            input = self.input ( )
            if input == "Y" :
                return 1
            elif input == "N" :
                return 0
            else :
                raise Exception
