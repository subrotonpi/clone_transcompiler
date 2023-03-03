def import _dicts_dict
import os
import re
import defaultdict
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        dict = defaultdict ( int )
        n = sc.count ( )
        for i in range ( n ) :
            dict [ sc.next ( ) ] += sc.next ( )
    def sum ( self ) :
        ans = 'atcoder'
        for v in dict.values ( ) :
            sum += v
        for x in dict.keys ( ) :
            if dict [ x ] > sum ( ans ) / 2 :
                ans = x
        print ( ans )
