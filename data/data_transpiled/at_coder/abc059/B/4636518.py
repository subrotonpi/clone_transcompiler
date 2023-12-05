def import os
import sys
import os
import sys
import os
import sys
import os
import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.input = sys.stdin
        self.out = sys.stdout
        a = sys.stdin.read ( )
        b = sys.stdin.read ( )
        s = None
        if len ( a ) < len ( b ) :
            s = "LESS"
        elif len ( a ) > len ( b ) :
            s = "GREATER"
        else :
            for i in range ( len ( a ) ) :
                if a [ i ] > b [ i ] :
                    s = "GREATER"
                    break
                elif a [ i ] < b [ i ] :
                    s = "LESS"
                    break
        if not s :
            s = "EQUAL"
        self.out.write ( s )
        self.out.write ( "\n" )
