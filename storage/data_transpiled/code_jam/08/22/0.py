def _ _ main _ _ ( ) :
    import sys
    from pybedtools.config import Config
    class ProblemB :
        def __init__ ( self ) :
            self.p , self.rank = [ ] , [ ]
        def root ( x ) :
            if self.p [ x ] != x :
                self.p [ x ] = root ( self.p [ x ] )
            return self.p [ x ]
        def union ( self , a , b ) :
            a = root ( a )
            b = root ( b )
            if self.rank [ a ] < self.rank [ b ] :
                self.p [ a ] = b
            else :
                self.p [ b ] = a
                if self.rank [ a ] == self.rank [ b ] :
                    self.rank [ a ] += 1
        def do_main ( self ) :
            with open ( "input.txt" , "r" ) as sc :
                with open ( "output.txt" , "w" ) as pw :
                    self.case_cnt = sc.read ( )
                    is_prime = [ True ] * 1000001
                    for i in range ( 2 , 1000000 + 1 ) :
                        for j in range ( 2 * i , 1000000 + 1 , i ) :
                            is_prime [ j ] = False
                    for case_num in range ( 1 , case_cnt + 1 ) :
                        pw.write ( "Case #%d: " % case_num )
                        A , B , P = sc.read ( )
                        for i in range ( B - A + 1 ) :
                            self.p [ i ] = i
                            self.rank [ i ] = 0
                        res = int ( B - A + 1 )
                        for i in range ( P , 1000000 + 1 ) :
                            if not is_prime [ i ] :
                                continue
                            x = A // i * i
                            if x < A :
                                x += i
                            x -= A
                            for y in range ( x , B - A + 1 , i ) :
                                if root ( int ( x ) ) != root ( y ) :
                                    res -= 1
                                    self.union ( int ( x ) , y )
                        pw.write ( "\n" )
    