def _import ( ) : return sys.stdin.readline ( )
import readline
import readline
import time
import random
import sys
class Main ( readline ) :
    def __init__ ( self ) :
        readline.__init__ ( self )
        self.N = int ( readline.readline )
        self.T = [ ]
        self.V = [ ]
    def readline ( self ) :
        if not self.N or not self.T :
            try :
                return readline.readline ( )
            except EOFError :
                raise
        return self.N
    def readline ( self ) :
        return int ( readline.readline )
    def readline ( self ) :
        return float ( readline.readline.readline ( ) )
    def readline ( self ) :
        return readline ( self )
    def readline ( self ) :
        return readline ( self )
def solve ( ) :
    rs = mk_restrictions ( )
    total_time = 0
    for i in range ( N ) :
        total_time += self.T [ i ] * 2
    current_speed = run = 0
    for t in range ( total_time ) :
        next_limit = calc_min_limit ( t + 1 , rs )
        if next_limit == current_speed :
            run += current_speed
        elif next_limit > current_speed :
            run += current_speed + 0.5
            current_speed += 1
        else :
            run += current_speed - 0.5
            current_speed -= 1
    return run * 0.25
def calc_min_limit ( t , rs ) :
    min = sum ( r.limit_at ( t ) for r in rs )
    return min
def mk_restrictions ( ) :
    rs = [ ( 0 , 0 , 0 ) ]
    start = 0
    for i in range ( N ) :
        end = start + self.T [ i ] * 2
        speed = self.V [ i ] * 2
        rs.append ( ( start , end , speed ) )
        start = end
    rs.append ( ( start , start , 0 ) )
    return rs
class Scanner ( readline ) :
    def __init__ ( self ) :
        self.N = int ( readline.strip ( ) )
        self.T = int ( readline.strip ( ) )
        self.V = float ( readline