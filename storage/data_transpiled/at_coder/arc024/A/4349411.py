def import import sys
import os
import sys
import random
import time
class Main ( ) :
    def __init__ ( self ) :
        Scanner ( )
        L = int ( sys.stdin.readline ( ) )
        R = int ( sys.stdin.readline ( ) )
        l = [ ]
        r = [ ]
        for i in range ( L ) :
            l.append ( random.randint ( 0 , L ) )
        for i in range ( R ) :
            r.append ( random.randint ( 0 , R ) )
        r.sort ( )
        l.sort ( )
        i , j , ans = 0 , 0 , 0
        while i < L and j < R :
            if l [ i ] == r [ j ] :
                i += 1
                j += 1
                ans += 1
            elif l [ i ] > r [ j ] :
                j += 1
            else :
                i += 1
        self.out.write ( ans )
