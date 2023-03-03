def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.argv.index ( 'N' )
    def __init__ ( self ) :
        self.supportive_list = [ 1 , 11 , 111 , 1111 , 11111 , 111111 ]
    def __init__ ( self ) :
        self.repdigit_list = [ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 ]
    def __init__ ( self ) :
        self.repdigit_list = [ ]
        for support in self.supportive_list :
            for repdigit in self.repdigit_list :
                repdigit_pattern = support * repdigit
                self.repdigit_list.append ( repdigit_pattern )
    print ( self.repdigit_list [ N - 1 ] )
