def import getpass
import sys
import random
import sys
class PasswordProblem ( object ) :
    def solve ( self ) :
        a = randint ( 0 , 100 )
        b = randint ( 0 , 100 )
        p = [ ]
        for i in range ( a ) :
            p.append ( uniform ( 0 , 1 ) )
        prob = p + [ 0 ] * a
        for i in range ( 1 , a ) :
            prob [ i ] = prob [ i - 1 ] * prob [ i ]
        ans = b + 2
        for i in range ( a - 1 , - 1 , - 1 ) :
            cur_ans = ( a - i - 1 ) + ( b - i - 1 ) + 1 + ( 1 - prob [ i ] ) * ( b + 1 )
            ans = min ( ans , cur_ans )
        self.out.write ( ans )
    def run ( self ) :
        with open ( 'input.txt' , 'r' ) as infile :
            with open ( 'output.txt' , 'w' ) as outfile :
                tests = randint ( 0 , 100 )
                for i in range ( tests ) :
                    outfile.write ( 'Case #%d: ' % ( i + 1 ) )
                    self.solve ( )
                outfile.close ( )
    if sys.stdin.readline ( ).strip ( ) == b or not sys.stdin.readline ( ).strip ( ) :
        sys.stdin.close ( )
        sys.exit ( 1 )
    if sys.stdin.readline ( ).strip ( ) == b :
        sys.stdin.close ( )
        sys.exit ( 1 )
    if sys.stdin.readline ( ).strip ( ) == b :
        sys.stdin.close ( )
        sys.exit ( 1 )
    if sys.stdin.readline ( ).strip ( ) == b :
        sys.stdin.close ( )
        sys.exit ( 1 )
