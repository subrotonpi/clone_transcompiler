def import _cookie_clicker_B_Q14
import os
import sys
class CookieClicker_B_Q14 ( object ) :
    PROBLEM_NAME = "B-large"
    INPUT_PATH = PROBLEM_NAME + ".in"
    OUTPUT_PATH = PROBLEM_NAME + "-Output.txt"
    def __init__ ( self , f ) :
        self.c = float ( f )
        self.f = float ( x )
    def solve ( self ) :
        rate = 2.0D
        time = 0
        while True :
            this_time = time + ( x / rate )
            next_rate = rate + f
            next_time = time + self.c / rate + x / next_rate
            if next_time > this_time :
                break
            else :
                time = time + self.c / rate
                rate = next_rate
        return str ( time + ( x / rate ) )
    def main ( self ) :
        with open ( INPUT_PATH , "r" ) as in_file :
            with open ( OUTPUT_PATH , "w" ) as out_file :
                t = len ( in_file )
                for i in range ( 1 , t + 1 ) :
                    print ( "Case #%d" % i )
                    out_file.write ( "Case #%d: " % i )
                    out_file.write ( CookieClicker_B_Q14 ( self ).solve ( ) )
                    out_file.write ( "\n" )
                    out_file.flush ( )
