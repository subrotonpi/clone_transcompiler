def import _recrec
import math
class D ( object ) :
    def __init__ ( self ) :
        self.T = self.T
        for t in range ( 1 , T + 1 ) :
            print ( "Case #%d: %.11f\n" % ( t , solve ( ) ) )
    def solve ( self ) :
        line = self.line
        N = len ( line )
        memo = [ - 1 ] * ( 1 << N )
        st = 0
        for i in range ( N ) :
            if line [ i ] == "X" :
                st |= 1 << i
        return rec ( st )
    def rec ( st ) :
        if st == ( 1 << N ) - 1 :
            return 0
        if memo [ st ] >= 0 :
            return memo [ st ]
        ret = 0
        for i in range ( N ) :
            pos = i
            pay = N
            while 1 :
                if st & ( 1 << pos ) == 0 :
                    break
                pos += 1
                pay -= 1
                if pos == N :
                    pos = 0
            ret += rec ( st | ( 1 << pos ) ) + pay
        memo [ st ] = ret / N
        return memo [ st ]
return D
