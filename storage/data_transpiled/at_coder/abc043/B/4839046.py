def _import ( ) : return 33
import sys
import os
import sys
import struct
import sys
import sys
import struct
import sys
class Main ( ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self._solve = [ ]
    def _solve ( ) :
        try :
            _solve_b ( )
        finally :
            if sys.stdin is not None :
                sys.stdin.close ( )
            if sys.stdout is not None :
                sys.stdout.flush ( )
                sys.stdout.close ( )
    def _solve_a ( ) :
        num_n = randint ( 0 , 10 )
        res = 0
        for i in range ( 1 , num_n + 1 ) :
            res += i
        sys.stdout.write ( res )
    def _solve_b ( ) :
        wk = next ( sys.stdin )
        res = [ ]
        for c in wk :
            if c != 'B' :
                res.append ( c )
            else :
                if res != [ ] :
                    res.pop ( )
        res = [ ]
        for character in res :
            res.append ( character )
        sys.stdout.write ( ''.join ( res ) )
    def _solve_c ( ) :
        num_n = randint ( 0 , 10 )
        sys.stdout.write ( '' )
    def _solve_d ( ) :
        num_n = randint ( 0 , 10 )
        sys.stdout.write ( '' )
    def _solve_e ( ) :
        num_n = randint ( 0 , 10 )
        sys.stdout.write ( '' )
    def _solve_f ( ) :
        num_n = randint ( 0 , 10 )
        sys.stdout.write ( ''.join ( res ) )
    def _solve_f ( ) :
        return _solve_f ( )
    import sys
    sys.stdout = _solve_a
    sys.stdout = _solve_f
    sys.stdout = _solve_f
    sys.stderr = _solve_a
    sys.stdout = _solve_f
    sys.stderr = _solve_f
    sys.exit ( )
