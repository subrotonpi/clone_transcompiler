def import help
import sys
import os
import getopt
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = sys.stdin
    def __call__ ( self , a , b , c ) :
        if a % 2 == 1 or b % 2 == 1 or c % 2 == 1 :
            ans = 0
        else :
            if a == b and a == c :
                ans = - 1
            else :
                ans = help ( a , b , c )
        print ( ans )
    def help ( a , b , c ) :
        if a % 2 == 1 or b % 2 == 1 or c % 2 == 1 :
            return 0
        return 1 + help ( a / 2 + b / 2 , a / 2 + c / 2 , b / 2 + c / 2 )
