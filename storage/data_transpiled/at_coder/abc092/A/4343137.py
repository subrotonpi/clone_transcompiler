def main ( ) :
    import sys
    def solve_a ( ) :
        with open ( 'a' , 'r' ) as f :
            num_a = f.read ( )
        with open ( 'b' , 'r' ) as f :
            num_b = f.read ( )
        with open ( 'c' , 'r' ) as f :
            num_c = f.read ( )
        with open ( 'd' , 'r' ) as f :
            num_d = f.read ( )
        wkbus = num_a if num_a < num_b else num_b
        wktrain = num_c if num_c < num_d else num_d
        print ( wkbus + wktrain )
        print ( '' )
    def solve_b ( ) :
        with open ( 'b' , 'r' ) as f :
            num_b = f.read ( )
    def solve_c ( ) :
        num_c = f.read ( )
    def solve_d ( ) :
        num_d = f.read ( )
    return solve_a , num_b , num_c , num_d
