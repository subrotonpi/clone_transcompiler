def import func , set
import os
import sys
import os
class Main ( object ) :
    def __init__ ( self ) :
        self.s = os.urandom ( 32 )
        a = s
        i = 2
        ans = 0
        seen = set ( [ a ] )
        while 1 :
            a = func ( a )
            if not seen.add ( a ) :
                ans = i
                break
            i += 1
        print ( ans )
        self.s = s
    def func ( n ) :
        if n % 2 == 0 :
            return n / 2
        return 3 * n + 1
