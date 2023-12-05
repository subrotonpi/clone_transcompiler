def import _readline
import readline
import sys
import random
import sys
import string
import string
import sys
import math
import random
maxValue = 100000000000000L
def solve ( ) :
    good = [ ]
    for i in range ( 1 , maxValue * i + 1 ) :
        if is_good ( i ) and is_good ( i ** 2 ) :
            good.append ( i ** 2 )
    tests = randint ( 1 , maxValue )
    for test in range ( 1 , tests + 1 ) :
        print ( "Case #%d: %s" % ( test , solve_one ( good ) ) , file = sys.stderr )
    def is_good ( n ) :
        s = string.split ( n )
        l , r = 0 , len ( s ) - 1
        while l < r :
            if s [ l ] != s [ r ] :
                r -= 1
                return False
        return True
    def solve_one ( good , n ) :
        l , r = randint ( 1 , maxValue ) , randint ( 1 , maxValue )
        return str ( solve_one ( good , r ) - solve_one ( good , l - 1 ) )
    def solve ( ) :
        l , r = - 1 , len ( good )
        while r - l > 1 :
            m = ( l + r ) // 2
            if good [ m ] <= n :
                l = m
            else :
                r = m
        return l + 1
    def main ( ) :
        with open ( self.__file__ , 'r' ) as f :
            import sys
            try :
                sys.stdin = f
                sys.stdout = sys.__stdout__
            except AttributeError :
                sys.stdin = sys.stdin
                sys.stdout = sys.__stdout__
        return sys.stdin
    def solve ( ) :
        while not sys.stdin.isatty ( ) or not sys.stdout.isatty ( ) :
            line = f.readline ( )
            if not line :
                return None
            yield line
    raw_input ( )
