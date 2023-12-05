def import _ENC
import sys
import os
import sys
import sys
class Enclosure :
    def __init__ ( self ) :
        Scanner ( )
    def main ( self ) :
        for case_id , total_cases in enumerate ( sys.argv [ 1 : ] ) :
            print ( "Case #%d: %s" % ( case_id , self.solve ( ) ) )
            sys.stdout.flush ( )
    def solve ( self ) :
        N , M , K = self.scan ( )
        rows , cols = min ( N , M ) , max ( N , M )
        self.N = rows
        self.M = cols
        if N == 1 :
            return K
        best = K
        for rows in range ( 2 , N + 1 ) :
            for cols in range ( 2 , M + 1 ) :
                area , perimeter = rows * cols , 2 * ( rows + cols - 2 )
                if area < K :
                    continue
                diag = [ [ 0 , 0 , 0 ] ] * 2
                while area > K :
                    bi , bj = - 1 , - 1
                    for i in range ( 2 ) :
                        for j in range ( 2 ) :
                            if bi == - 1 or diag [ i , j ] < diag [ bi , bj ] :
                                bi = i
                                bj = j
                    diag [ bi , bj ] += 1
                    if area - diag [ bi , bj ] >= K and valid ( diag , rows , cols ) :
                        area -= diag [ bi , bj ]
                        perimeter -= 1
                    else :
                        break
                if perimeter < best :
                    pass
                best = min ( best , perimeter )
        return best
    def valid ( self , diag , rows , cols ) :
        ok = True
        for i in range ( 2 ) :
            ok &= diag [ i , 0 ] + diag [ i , 1 ] <= cols
            ok &= diag [ 0 , i ] + diag [ 1 , i ] <= rows
        return ok
