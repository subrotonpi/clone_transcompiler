def import _main
import os
import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.seen = set ( )
        for i in range ( 0 ) :
            if s in self.seen :
                print ( i + 1 )
                return
            else :
                self.seen.add ( s )
            self.s = s / 2 if s % 2 == 0 else s * 3 + 1
