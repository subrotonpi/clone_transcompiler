def _import ( ) : return _import ( )
import sys
import os
import sys
import struct
import sys
class B ( object ) :
    def _solve_multi_test ( self ) :
        test_cases = randint ( 1 , 10000 )
        for case in range ( 1 , test_cases + 1 ) :
            self.out.write ( "Case #%d: %s\n" % ( case , self._solve_one_test ( ) ) )
    def _solve_one_test ( self ) :
        r , c = randint ( 1 , 10000 ) , randint ( 1 , 10000 )
        a = [ [ ] for _ in range ( r ) ]
        for i in range ( r ) :
            for j in range ( c ) :
                a [ i ] [ j ] = randint ( 1 , 10000 )
        max_row = [ ]
        max_col = [ ]
        fill ( max_row , int )
        fill ( max_col , int )
        for i in range ( r ) :
            for j in range ( c ) :
                max_row [ i ] = max ( max_row [ i ] , a [ i ] [ j ] )
                max_col [ j ] = max ( max_col [ j ] , a [ i ] [ j ] )
        for i in range ( r ) :
            for j in range ( c ) :
                if a [ i ] [ j ] < max_row [ i ] and a [ i ] [ j ] < max_col [ j ] :
                    return "NO"
        return "YES"
    def _solve_one_test ( self ) :
        while True :
            line = sys.stdin.readline ( )
            if not line :
                break
            if line.startswith ( "#" ) :
                continue
            line = sys.stdin.readline ( )
            if line.strip ( ) :
                return line.strip ( )
        return "NO"
