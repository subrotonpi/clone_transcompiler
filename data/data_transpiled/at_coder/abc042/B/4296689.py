def import _main
import sys
import os
import sys
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.line = None
        tmp_list = [ ]
        with open ( sys.argv [ 1 ] ) as sc :
            line = sc.readline ( )
            tmp_list = line.split ( )
            letternum = int ( tmp_list [ 0 ] )
            for i in range ( letternum ) :
                tmp_list.append ( sc.readline ( ) )
        tmp_list.sort ( )
