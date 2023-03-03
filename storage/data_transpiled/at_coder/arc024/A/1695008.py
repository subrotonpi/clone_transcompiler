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
import sys
class Main ( object ) :
    def __init__ ( self , args ) :
        self.left_num , self.right_num , self.cnt = 0 , 0 , 0
        with readline.get_reader ( ) as scan :
            left_num , self.right_num = scan.next ( )
            l_list = [ i for i in range ( self.left_num ) ]
            r_list = [ i for i in range ( self.right_num ) ]
            for i in range ( self.left_num ) :
                same_index = r_list.find ( l_list [ i ] )
                if same_index != - 1 :
                    cnt += 1
                    r_list.pop ( same_index )
        print ( cnt )
