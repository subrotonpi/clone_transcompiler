def import import _stringlist
import sys
import string
import tokenize
import string
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        l = sc.readline ( ).strip ( )
        list = [ ]
        for i in range ( n ) :
            list.append ( sc.readline ( ).strip ( ) )
        list.sort ( key = lambda x : x.split ( ) [ 0 ] )
        list = [ str ( x ) for x in list ]
        print ( ' '.join ( list ) )
