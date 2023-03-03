def import import *
import os
import sys
import getopt
class Main ( object ) :
    def __init__ ( self ) :
        self.FNAME = ''
    def open ( self , f ) :
        self.FNAME = f
    def open ( self , * args , ** kwargs ) :
        self.FNAME.open ( self.FNAME + '.in' )
        self.FNAME.open ( self.FNAME + '.out' )
    def close ( self ) :
        self.FNAME.close ( )
    import string
    t = string.split ( 'welcome to code jam' ) [ 0 ]
    for test in range ( 1 , tn + 1 ) :
        c = string.split ( f , '' ) [ 1 ]
        r = [ ]
        r.append ( [ 1 ] )
        for i in range ( len ( t ) ) :
            for j in range ( len ( c ) ) :
                r [ i + 1 ] [ j + 1 ] = r [ i + 1 ] [ j ]
                if t [ i ] == c [ j ] :
                    r [ i + 1 ] [ j + 1 ] += r [ i ] [ j ]
                    r [ i + 1 ] [ j + 1 ] %= 10000
        a = r [ len ( t ) ] [ len ( c ) ] + ''
        while len ( a ) < 4 :
            a = '0' + a
        print ( "Case #%d: %s" % ( test , a ) , end = '' )
