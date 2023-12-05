def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.count = 0
        self.seen = set ( )
        for a in sys.stdin.read ( ) :
            if a in self.seen :
                self.count += 1
            else :
                self.seen.add ( a )
        print ( self.count - ( self.count + ( self.count % 2 == 0 ) ) )
