def import _solve
class B ( object ) :
    def solve ( sc ) :
        R = sc.regs [ 0 ]
        C = sc.regs [ 1 ]
        N = sc.regs [ 2 ]
        min = sys.maxint
        for i in range ( 1 << ( R * C ) ) :
            if sum ( i ) == N :
                s = 0
                b = [ [ ( i & ( 1 << ( r * C + c ) ) ) != 0 for r in range ( R ) ] for c in range ( C ) ]
                if b [ r ] [ c ] :
                    if r > 0 and b [ r - 1 ] [ c ] :
                        s += 1
                    if c > 0 and b [ r ] [ c - 1 ] :
                        s += 1
        min = min ( min , s )
    def main ( ) :
        with open ( 'test.txt' , 'r' ) as f :
            T = len ( f.readlines ( ) )
            for cs in range ( 1 , T + 1 ) :
                res = _solve ( f )
                print ( "Case #%d: %s" % ( cs , res ) )
