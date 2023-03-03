def import _readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import sys
import os
import sys
import readline
import readline
import readline
import readline
import readline
import time
import time
class Main ( ) :
    def __init__ ( self , args ) :
        self.left_num , self.right_num , self.cnt = 0 , 0 , 0
        with readline.get_lock ( ) : self.left_num , self.right_num , self.cnt = 0 , 0
        self.l_list = [ ]
        self.r_list = [ ]
        for i in range ( self.left_num ) : self.l_list.append ( readline.get_lock ( ) )
        for i in range ( self.right_num ) : self.r_list.append ( readline.get_lock ( ) )
        for i in range ( self.left_num ) :
            same_index = r_list.find ( l_list [ i ] )
            if same_index != - 1 :
                cnt += 1
                self.l_list [ i ] = - 1
                self.r_list [ same_index ] = - 1
        print ( cnt )
