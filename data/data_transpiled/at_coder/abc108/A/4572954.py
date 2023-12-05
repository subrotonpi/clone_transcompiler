def main ( ) :
    import sys
    def solve_a ( ) :
        with open ( 'a' , 'r' ) as f :
            num_k = 0
            eqa_c = 0
            odd_c = 0
            try :
                f.seek ( 0 )
                num_k = f.read ( )
                for i in range ( 1 , num_k + 1 ) :
                    if i % 2 == 0 :
                        eqa_c += 1
                    else :
                        odd_c += 1
                print ( eqa_c * odd_c )
            finally :
                if f.closed :
                    f.close ( )
    def solve_b ( ) :
        with open ( 'b' , 'r' ) as f :
            num_n = f.read ( )
            print ( '' )
    def solve_c ( ) :
        num_n = f.read ( )
        print ( '' )
    def solve_d ( ) :
        num_n = f.read ( )
        print ( '' )
    def solve_d ( ) :
        num_n = f.read ( )
        print ( '' )
    def solve_a ( ) :
        with open ( 'a' , 'r' ) as f :
            num_k = f.read ( )
            print ( '' )
    def solve_a ( ) :
        with open ( 'a' , 'r' ) as f :
            num_k = f.read ( )
            print ( '' )
    def solve_a ( ) :
        with open ( 'a' , 'r' ) as f :
            num_k = f.read ( )
            print ( '' )
    def solve_a ( ) :
        with open ( 'a' , 'r' ) as f :
            num_k = f.read ( )
            print ( '' )
    def solve_a ( ) :
        with open ( 'a' , 'r' ) as f :
            num_k = f.read ( )
            print ( '' )
    def solve_a ( ) :
        with open ( 'a' , 'r' ) as f :
            num_k = f.read ( )
            print ( '' )
    return solve_a , solve_b
    