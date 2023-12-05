def import Scanner , sc
import time
import sys
import random
import time
import sys
import random
import sys
class Solution ( Scanner ) :
    def solve ( self ) :
        T = sc.randint ( 1 , 100 )
        for Case in range ( 1 , T + 1 ) :
            n , x = sc.randint ( 1 , 100 )
            sz = [ random.randint ( 1 , 100 ) for _ in range ( n ) ]
            sz = [ random.randint ( 1 , 100 ) for _ in range ( n ) ]
            ans = 0
            for l , r in zip ( range ( n - 1 , - 1 , - 1 ) , sz ) :
                ans += 1
                if sz [ l ] + sz [ r ] <= x :
                    l += 1
            self.out.write ( "Case #%d: %d\n" % ( Case , ans ) )
    def run ( self ) :
        try :
            f = open ( "A-large.in" , "r" )
            out = open ( "A-large.out" , "w" )
            sc = Scanner ( f )
            solve ( )
        except SystemExit as uncaught :
            self.uncaught = uncaught
        else :
            self.out.close ( )
    def main ( self ) :
        thread = threading.Thread ( target = None , args = ( self , ) , name = "main" , args = ( 1 , 26 ) )
        thread.start ( )
        thread.join ( )
        if self.uncaught is not None :
            raise self.uncaught
class FastScanner ( Scanner ) :
    def __init__ ( self , f ) :
        self.f = f
        self.tokens = [ ]
    def readline ( self ) :
        while not self.tokens or not self.tokens :
            self.tokens = [ ]
        return self.tokens [ 0 ]
    def randint ( self , size ) :
        return int ( size )
    def long ( self ) :
        return long ( size )
    def double ( self ) :
        return double ( size )
return Solution
