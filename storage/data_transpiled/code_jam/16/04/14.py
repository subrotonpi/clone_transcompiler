def import import sys
import os
import sys
import os
import sys
class Fractiles ( object ) :
    def __init__ ( self ) :
        self.out = sys.stdout
        self.stdin = sys.stdin
    def __init__ ( self , case_number ) :
        self.case_number = case_number
    def do_case ( self ) :
        line = self.stdin.readline ( )
        scan = os.Scanner ( line )
        K , C , S = scan ( )
        if S * C < K :
            print ( " IMPOSSIBLE" )
            return
        digit = 0
        while digit < K :
            res = 0
            for i in range ( C ) :
                res *= K
                if digit < K :
                    res += digit
                digit += 1
            print ( "" , end = "" )
            print ( res + 1 , end = "" )
        print ( )
    def run ( self ) :
        self.num_cases = int ( self.stdin.readline ( ).strip ( ) )
        for i in range ( 1 , num_cases + 1 ) :
            print ( "Case #%d:" % i , end = "" )
            do_case ( self )
