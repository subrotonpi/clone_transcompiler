def import _pairs_sort
from collections import defaultdict
class Pair :
    def __init__ ( self , a , b ) :
        self.i = a
        self.cnt = b
    def __lt__ ( self , p ) :
        if self.cnt == p.cnt : return 0
        if self.cnt < p.cnt : return - 1
        return 1
class Main ( object ) :
    def __init__ ( self ) :
        sc = _pairs_sort ( )
        N = int ( sc.next ( ) )
        K = int ( sc.next ( ) )
        d = { }
        l = list ( )
        for i in range ( N ) :
            c = int ( sc.next ( ) )
            if c not in d :
                p = Pair ( c , 1 )
                l.append ( p )
                d [ c ] = p
            else :
                p = d [ c ]
                p.cnt += 1
                d [ c ] = p
        l.sort ( )
    def __cmp__ ( self , a , b ) :
        if a < b : return 0
        if b < a : return - 1
        return 1
    def __cmp__ ( self , a , b ) :
        if a > b : return 1
        return 0
    def __cmp__ ( self , a , b ) :
        if a < b : return 1
        return 1
