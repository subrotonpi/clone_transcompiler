def _ _ main _ _ ( ) : return
import os
import sys
import re
class B ( object ) :
    IFILE = 'B-small-attempt0.in'
    def __init__ ( self , f ) :
        self.f = open ( f , 'r' )
        self.f = open ( IFILE , 'w' )
        self.f.write ( 'output.txt' )
        self.ntest = self.f.read ( )
        self.f.readline ( )
        for test in range ( 1 , ntest + 1 ) :
            self.f.write ( 'Case #%d:' % test )
            st = self.f.readline ( ).split ( )
            data = st [ 0 ]
            m = int ( st [ 1 ] )
            n = self.f.readline ( ).count ( ' ' )
            word = [ ]
            self.f.readline ( )
            for i in range ( n ) :
                word.append ( self.f.readline ( ).split ( ) )
            p = data.split ( '+' )
            rr = [ ]
            for i in range ( m + 1 ) :
                pp = p [ i ].split ( )
                data = pp [ 1 ]
                mas = [ ]
                for j in range ( n ) :
                    for k in range ( n ) :
                        for l in word [ k ] :
                            if pp [ j ] == word [ k ] [ l ] :
                                mas [ k ] [ j ] += 1
                if i == m + 1 :
                    res = 0
                    for i1 in range ( n ) :
                        r = 1
                        for i2 in range ( n ) :
                            r *= mas [ i1 ] [ i2 ] [ i3 ] [ i3 ] [ i3 ] [ i3 ] [ i3 ] [ i3 ] [ i3 ] [ i3 ] [ i3 ] [ i3 ] [ i3 ] [ i3 ] [ i3 ] [ i3 ] [ i3 ] [ i3 ] [ j ]
                        res = ( res + r ) % 10009
return B
