def main ( ) :
    import os
    def solve_b ( ) :
        with open ( 'A' , 'r' ) as f :
            num_rating = f.read ( )
            if num_rating < 1200 :
                print ( 'ABC' )
            elif num_rating < 2800 :
                print ( 'ARC' )
            else :
                print ( 'AGC' )
    def solve_b ( ) :
        with open ( 'A' , 'r' ) as f :
            str_s = f.read ( )
            if str_s [ 0 ] != 'A' :
                print ( 'WA' )
                return
            res = 0
            wks_index = 0
            for i in range ( 2 , len ( str_s ) - 1 ) :
                if str_s [ i ] == 'C' :
                    res += 1
                    wks_index = i
            if res != 1 :
                print ( 'WA' )
                return
            for i in range ( len ( str_s ) ) :
                if i != 0 and i != wks_index and not str_s [ i ].islower ( ) :
                    print ( 'WA' )
                    return
            print ( 'AC' )
    def solve_c ( ) :
        with open ( 'C' , 'r' ) as f :
            num_n = f.read ( )
            print ( '' )
    def solve_d ( ) :
        with open ( 'D' , 'r' ) as f :
            num_n = f.read ( )
            print ( '' )
    def solve_c ( ) :
        num_n = f.read ( )
        print ( '' )
        num_k = f.read ( )
        print ( '' )
    def solve_d ( ) :
        num_n = f.read ( )
        print ( '' )
        num_k = f.read ( )
        print ( '' )
    def solve_c ( ) :
        num_n = f.read ( )
        print ( '' )
        num_k = f.read ( )
        print ( '' )
    def solve_d ( ) :
        num_n = f.read ( )
        print ( '' )
    return solve_c , solve_d
