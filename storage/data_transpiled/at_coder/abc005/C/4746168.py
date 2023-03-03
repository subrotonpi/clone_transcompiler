def import _dicts_dict
import os
import sys
from collections import defaultdict
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        map = defaultdict ( lambda : 0 )
        ans = "yes"
        sold = True
        t = sc.__next__ ( )
        n = sc.__next__ ( )
        a = [ ]
        for i in range ( n ) :
            map [ i ].append ( sc.__next__ ( ) )
        m = sc.__next__ ( )
        for i in range ( m ) :
            b = sc.__next__ ( )
            sold = False
            for j in map :
                if map [ j ] >= b - t and map [ j ] <= b :
                    del map [ j ]
                    sold = True
                    break
            if sold != True :
                ans = "no"
        print ( ans )
