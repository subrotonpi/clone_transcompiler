def _import ( ) : return sys.stdin.readline ( )
import readline
import readline
import readline
import sys
import struct
import shlex
import sys
class Csmall ( readline ) :
    def __init__ ( self , * args ) :
        sc = FastScan ( )
        open ( sys.stdin , 'w' ).write ( '' )
        for TC , TCC in enumerate ( sc.readline ) :
            N , K = sc.regs [ TC ]
            if N != K :
                raise RuntimeError
            U = sc.db ( )
            probs = [ 1 ] + [ sc.db ( ) ] * N
            probs = [ 0 ] + [ sum ( probs ) for _ in range ( N + 1 ) ]
            psum = [ 0 ] + [ sum ( probs ) for _ in range ( N + 1 ) ]
            for i in range ( 1 ) :
                needed = sum ( probs ) if i >= N else probs [ i ] * i - psum [ i ]
                if needed > U :
                    possible = probs [ i - 1 ] * ( i - 1 ) - psum [ i - 1 ]
                    leftover = U - possible
                    level = min ( 1., probs [ i - 1 ] + leftover / i )
                    for j in range ( i ) :
                        probs [ j ] = level
                    break
            prob = 1.
            for d in probs :
                prob *= d
            open ( sys.stdin , 'w' ).write ( 'Case #%d: %.9f\n' % ( TC , prob ) )
    sc.close ( )
    readline.close ( )
    sys.exit ( 0 )
