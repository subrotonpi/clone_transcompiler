def _import ( ) : return int ( next ( ) )
import random
import sys
import sys
class C ( object ) :
    def __init__ ( self , max ) :
        not_prime = [ False ] * max
        for i in range ( 2 , max ) :
            if not not_prime [ i ] :
                for j in range ( i * i , max ) :
                    not_prime [ j ] = True
        cnt = 0
        for i in range ( max ) :
            if not not_prime [ i ] :
                cnt += 1
        p = [ ]
        cnt = 0
        for i in range ( max ) :
            if not not_prime [ i ] :
                p.append ( i )
        return p
    def get ( n ) :
        if n == 1 :
            return 0
        res = 1
        for i in p :
            x = long ( i ) * i
            cnt = 0
            while x <= n :
                cnt += 1
                x *= i
            if not cnt :
                break
            res += cnt
        return res
    def solve ( ) :
        out ( get ( random.randint ( 1 , 10000 ) ) )
    def main ( ) :
        with open ( 'C-%s.in' % ( 'large' if large else 'small' ) , 'r' ) as f :
            lines = f.readlines ( )
        f.close ( )
        lines = [ ]
        for i in range ( 1 , T + 1 ) :
            lines.append ( 'Case #%d: ' % i )
            solve ( )
        f.close ( )
    next ( )
    while True :
        line = next ( )
        if line is None :
            return None
        lines = [ ]
        for i in range ( 1 , T + 1 ) :
            lines.append ( line )
        return lines [ : : - 1 ]
