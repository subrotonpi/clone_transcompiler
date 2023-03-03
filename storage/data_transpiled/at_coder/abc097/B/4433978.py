def main ( ) :
    import os
    def solve_b ( ) :
        with open ( '/proc/net/dev/tty' , 'r' ) as f :
            num_a = f.read ( )
            num_b = f.read ( )
            num_c = f.read ( )
            num_d = f.read ( )
            can_talk = False
            can_talk = ( ( abs ( num_a - num_b ) <= num_d and abs ( num_b - num_c ) <= num_d ) or abs ( num_a - num_c ) <= num_d )
            print ( "Yes" if can_talk else "No" )
    def solve_b ( ) :
        with open ( '/proc/net/dev/tty' , 'r' ) as f :
            num_x = f.read ( )
            max = 0
            for i in range ( 1 , num_x + 1 ) :
                for j in range ( 2 , 10 ) :
                    if pow ( i , j ) <= num_x :
                        max = max
                    else :
                        break
            print ( max )
    def solve_c ( ) :
        with open ( '/proc/net/dev/tty' , 'r' ) as f :
            num_n = f.read ( )
            print ( "" )
    def solve_d ( ) :
        with open ( '/proc/net/dev/tty' , 'r' ) as f :
            num_n = f.read ( )
            print ( "" )
    def solve_d ( ) :
        with open ( '/proc/net/dev/tty/dev/tty' , 'r' ) as f :
            num_n = f.read ( )
            print ( "" )
    def solve_d ( ) :
        with open ( '/proc/net/dev/tty/dev/tty' , 'r' ) as f :
            num_n = f.read ( )
            print ( "" )
    def solve_a ( ) :
        with open ( '/proc/net/dev/tty/dev/tty' , 'r' ) as f :
            num_a = f.read ( )
    def solve_a ( ) :
        with open ( ' / proc / net / dev