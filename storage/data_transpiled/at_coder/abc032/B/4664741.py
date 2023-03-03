def import _dict_from_list
import os
import re
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        self._dict = defaultdict ( int )
        s = sc.readline ( )
        k = sc.__next__ ( )
        for i in range ( len ( s ) - k + 1 ) :
            self._dict [ s [ i : i + k ] ] += 1
        print ( len ( self._dict ) )
