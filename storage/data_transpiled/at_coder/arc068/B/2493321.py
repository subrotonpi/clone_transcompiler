def import _main
import sys
import os
class Main ( object ) :
    def __init__ ( self , areg ) :
        Scanner ( areg )
        N = len ( areg )
        count = 0
        seen = set ( )
        for i in range ( N ) :
            j = _main ( areg )
            if j in seen : count += 1
            else : seen.add ( j )
