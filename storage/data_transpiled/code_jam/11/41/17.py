def _import ( ) : return int ( next ( ) )
import os
import sys
import os
import sys
import random
import sys
class A ( object ) :
    def __init__ ( self ) :
        self._w , self._l = random.randint ( 0 , sys.maxint )
    def __init__ ( self , b , e , w ) :
        self._w = w
        self._l = e - b
    def __lt__ ( self , self , o ) :
        return self._w < o._l
    def _solve_one ( prefix ) :
        x , s , r , t , n = randint ( 0 , sys.maxint ) , randint ( 0 , sys.maxint ) , randint ( 0 , sys.maxint ) , randint ( 0 , sys.maxint )
        w = [ ]
        for i in range ( n ) :
            w.append ( W ( randint ( 0 , sys.maxint ) , randint ( 0 , sys.maxint ) , randint ( 0 , sys.maxint ) ) )
            x -= w [ i ]._l
        w.append ( W ( 0 , x , 0 ) )
        w.sort ( )
        answer = 0
        for i in w :
            run_time = min ( t , float ( i ) / ( r + i ) )
            answer += run_time
            t -= run_time
            rd = w [ i ]._l - run_time * ( r + i )
            sys.stderr.write ( "%d: %f\n" % ( i , rd ) )
            answer += rd / ( s + i )
        print ( "%s%s\n" % ( prefix , answer ) )
    def run ( self ) :
        f = open ( self._A.__name__ + ".in" , "r" )
        f.close ( )
        self._a_out = f
        n_tests = randint ( 1 , sys.maxint )
        for i in range ( 1 , n_tests + 1 ) :
            self._solve_one ( 'Case #%d: ' % i )
        f.close ( )
    next ( )
