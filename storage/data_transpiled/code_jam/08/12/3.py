def import import os , sys , traceback
import os
import sys , time
class Main ( object ) :
    def __init__ ( self ) :
        self.FNAME = 'b'
    def open ( self , f ) :
        self.FNAME = f
        self.FNAME = f
    def run ( self ) :
        tn = sys.maxsize
        for test in range ( 1 , tn + 1 ) :
            n = sys.maxsize
            m = sys.maxsize
            t = [ ]
            x = [ ]
            y = [ ]
            for i in range ( m ) :
                t.append ( sys.maxsize - 1 )
                x.append ( sys.maxsize )
                y.append ( sys.maxsize )
        r = [ ]
        possible = True
        for i in range ( n ) :
            for j in range ( m ) :
                ok = False
                for k in range ( t [ j ] ) :
                    if r [ x [ j ] [ k ] ] == y [ j ] [ k ] :
                        ok = True
                        break
                if not ok :
                    for k in range ( t [ j ] ) :
                        if y [ j ] [ k ] == 1 :
                            ok = True
                            r [ x [ j ] [ k ] ] = 1
                    if not ok :
                        possible = False
                        break
        print ( 'Case #%d:' % test , end = ' ' )
        if not possible :
            print ( ' IMPOSSIBLE' , end = ' ' )
        else :
            for i in range ( n ) :
                print ( ' %d' % i , end = ' ' )
            print ( )
