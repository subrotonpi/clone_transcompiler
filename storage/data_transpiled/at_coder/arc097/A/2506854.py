def import _readline
import sys
import os
import sys
import string
import string
import string
import string
import string
import string
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        S = string.strip ( )
        K = sc.count ( string.strip ( ) )
        strings = [ ]
        for i in range ( len ( S ) ) :
            for j in range ( 1 , K + len ( S ) + 1 ) :
                strings.append ( S [ i : i + j ] )
        ans = None
        while K > 0 :
            K -= 1
            strings.remove ( ans = strings.pop ( 0 ) )
        print ( ans )
