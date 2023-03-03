def import import _struct
import os
import sys
class vect ( object ) :
    def __init__ ( self ) :
        self.fin = open ( 'vect.in' )
        f = fin.readline ( )
        T = int ( f )
        for casenum in range ( 1 , T + 1 ) :
            f = fin.readline ( )
            n = int ( f )
            f = fin.readline ( )
            sp = f.split ( )
            vect1 = [ long ( c1 ) for c1 in sp ]
            f = fin.readline ( )
            sp = f.split ( )
            vect2 = [ long ( c1 ) for c1 in sp ]
            vect1 = [ float ( c1 ) for c1 in vect1 ]
            vect2 = [ float ( c1 ) for c1 in vect2 ]
            res = 0
            for c1 in range ( n ) :
                res += vect1 [ c1 ] * vect2 [ n - c1 - 1 ]
            print ( 'Case #%d: %d' % ( casenum , res ) )
