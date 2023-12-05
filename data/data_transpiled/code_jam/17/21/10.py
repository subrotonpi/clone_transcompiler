def import _sys
import sys
import os
class Steed ( object ) :
    def __init__ ( self , case_number ) :
        self.out = sys.stdout
    def __init__ ( self , case_number ) :
        self.out = sys.stdout
    def do_case ( self , case_number ) :
        line = self.line
        with open ( line , 'r' ) as scan :
            D = scan.next ( )
            N = scan.next ( )
            K = [ scan.next ( ) for _ in range ( N ) ]
            S = [ scan.next ( ) for _ in range ( N ) ]
        self.longest_time_to_dest = 0
        for i in range ( N ) :
            this_time_to_dest = ( float ( D - K [ i ] ) ) / S [ i ]
            if this_time_to_dest > self.longest_time_to_dest :
                self.longest_time_to_dest = this_time_to_dest
        print ( D / self.longest_time_to_dest )
    def run ( self ) :
        self.num_cases = int ( self.out.strip ( ) )
        for i in range ( 1 , self.num_cases + 1 ) :
            print ( "Case #%d: " % i , end = ' ' )
            do_case ( self , i )
    def run ( self ) :
        super ( Steed , Steed ).run ( )
