def import import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N = sys.stdin.read ( )
        arr = [ ]
        max = 0
        for i in N :
            arr.append ( i - '0' )
            max += arr [ i ]
        for i in range ( len ( arr ) ) and arr [ i ] != 0 :
            tmp = 0
            for j in range ( len ( arr ) ) :
                if i == j :
                    tmp += arr [ j ] - 1 + ( len ( arr ) - j - 1 ) * 9
                    break
                else :
                    tmp += arr [ j ]
            max = max + tmp
        self.out.write ( max )
