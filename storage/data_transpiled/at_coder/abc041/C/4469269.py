def import _collections
import collections
import os
import defaultdict
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.read ( )
        dict = defaultdict ( list )
        for i in range ( n ) :
            dict [ sc.read ( ) ].append ( i + 1 )
        dict.sort ( )
