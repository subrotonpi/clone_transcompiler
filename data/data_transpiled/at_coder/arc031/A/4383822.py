def main ( ) :
    import sys
    def solve_a ( ) :
        with open ( 'A.txt' , 'r' ) as f :
            name = f.read ( ).split ( )
        half = len ( name ) // 2 if len ( name ) % 2 == 0 else ( len ( name ) // 2 ) + 1
        length = len ( name ) - 1
        is_kaibun = True
        for i in range ( half ) :
            if name [ i ] != name [ length - i ] :
                is_kaibun = False
        if is_kaibun :
            print ( 'YES' )
        else :
            print ( 'NO' )
    def solve_b ( ) :
        with open ( 'B.txt' , 'r' ) as f :
            num_n = f.read ( ).split ( )
            print ( '' )
    def solve_c ( ) :
        with open ( 'C.txt' , 'r' ) as f :
            num_n = f.read ( ).split ( )
            print ( '' )
    def solve_d ( ) :
        with open ( 'D.txt' , 'r' ) as f :
            num_n = f.read ( ).split ( )
            print ( '' )
    def solve_d ( ) :
        with open ( 'D.txt' , 'r' ) as f :
            num_n = f.read ( ).split ( )
            print ( '' )
    def solve_d ( ) :
        with open ( 'D.txt' , 'r' ) as f :
            num_n = f.read ( ).split ( )
            print ( '' )
    def solve_a ( ) :
        with open ( 'A.txt' , 'r' ) as f :
            num_n = f.read ( ).split ( )
            print ( '' )
    def solve_a ( ) :
        with open ( 'A.txt' , 'r' ) as f :
            num_n = f.read ( ).split ( )
            print ( '' )
    def solve_a ( ) :
        with open ( 'D.txt' , 'r' ) as f :