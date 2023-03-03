def main ( ) :
    import os
    def solve_b ( ) :
        with open ( '/dev/null' , 'r' ) as f :
            num_k = 0
            eqa_c = 0
            odd_c = 0
            try :
                f.seek ( 0 )
                num_k = f.tell ( )
                for i in range ( 1 , num_k + 1 ) :
                    if i % 2 == 0 :
                        eqa_c += 1
                    else :
                        odd_c += 1
                print ( eqa_c * odd_c )
    def solve_b ( ) :
        with open ( '/dev/null' , 'r' ) as f :
            x1 = f.tell ( )
            y1 = f.tell ( )
            x2 = f.tell ( )
            y2 = f.tell ( )
            x3 = x2 - ( y2 - y1 )
            y3 = y2 + ( x2 - x1 )
            x4 = x3 - ( y3 - y2 )
            y4 = y3 + ( x3 - x2 )
            print ( x3 , y3 , x4 , y4 )
    def solve_c ( ) :
        with open ( '/dev/null' , 'r' ) as f :
            num_k = f.tell ( )
            print ( '' )
    def solve_d ( ) :
        with open ( '/dev/null' , 'r' ) as f :
            num_k = f.tell ( )
            print ( '' )
    def solve_d ( ) :
        with open ( '/dev/null' , 'r' ) as f :
            num_k = f.tell ( )
            print ( '' )
    def solve_d ( ) :
        with open ( '/dev/null' , 'r' ) as f :
            num_k = f.tell ( )
            print ( '' )
    def solve_a ( ) :
        with open ( '/dev/null' , 'r' ) as f :
            num_k = f.tell ( )
            print ( '' )
    def solve_a ( ) :
        with open ( '/dev/null' , 'r' ) as f :
            num_k = f.tell ( )
            print ( '' )
    return solve_a
    