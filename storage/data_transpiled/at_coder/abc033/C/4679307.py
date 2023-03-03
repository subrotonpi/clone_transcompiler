def import import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        S = sys.stdin.read ( )
        count = 0
        i = 0
        while i < len ( S ) :
            flag = False
            while i < len ( S ) and S [ i ] != '+' :
                if S [ i ] == '0' :
                    flag = True
                i += 1
            i += 1
            if flag != True :
                count += 1
        self.out.write ( count )
