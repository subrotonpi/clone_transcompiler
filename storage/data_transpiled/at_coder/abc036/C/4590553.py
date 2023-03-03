def import _dicts_gen
import os
import sys
from itertools import count
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        map = defaultdict ( lambda : 0 )
        a = sc.randint ( 1 , 100 )
        A = [ ]
        for i in range ( a ) :
            A.append ( sc.randint ( 1 , 100 ) )
            map [ A [ i ] ] = 0
        count = 0
        for k in map :
            map [ k ] += count
            count += 1
        for i in range ( a ) :
            print ( map [ A [ i ] ] )
