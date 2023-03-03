def main ( ) :
    import sys
    def solve_a ( ) :
        with open ( '/proc/net/dev/null' , 'r' ) as f :
            num_n = f.read ( )
            num_a = f.read ( )
            res = num_n % 500
            print ( 'Yes' if res <= num_a else 'No' )
    def solve_b ( ) :
        with open ( '/proc/net/dev/null' , 'r' ) as f :
            num_n = f.read ( )
            num_a = f.read ( )
        res = num_n % 500
        print ( '' if res <= num_a else 'No' )
    def solve_c ( ) :
        with open ( '/proc/net/dev/null' , 'r' ) as f :
            num_n = f.read ( )
            num_a = f.read ( )
        res = num_n % 500
        print ( '' if res == num_n else 'No' )
    def solve_d ( ) :
        with open ( '/proc/net/dev/null' , 'r' ) as f :
            num_n = f.read ( )
            num_a = f.read ( )
        res = num_n % 500
        print ( '' if res == num_n else 'No' )
    def solve_e ( ) :
        with open ( '/proc/net/dev/null' , 'r' ) as f :
            num_n = f.read ( )
            num_a = f.read ( )
        res = num_n % 500
        print ( '' if res == num_n else 'No' )
    def solve_f ( ) :
        with open ( '/proc/net/dev/null' , 'r' ) as f :
            num_n = f.read ( )
            num_a = f.read ( )
        res = num_n % 500
        print ( '' if res == num_n else 'No' )
    print ( '' )
