def import import _readline
import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.stdin.readline ( )
        self.stdin.close ( )
    def readline ( self ) :
        s = self.stdin.readline ( )
        total , bit = 0 , 0
        l_opr_index , r_opr_index = 0 , 1
        tmp = ''
        for i in range ( pow ( 2 , len ( s ) - 1 ) ) :
            l_opr_index = r_opr_index = 1
            for bit in range ( i , 0 , - 1 ) :
                if bit & 1 == 1 :
                    tmp = s [ l_opr_index : r_opr_index ]
                    total += int ( tmp )
                    l_opr_index = r_opr_index
                r_opr_index += 1
            tmp = s [ l_opr_index : len ( s ) ]
            total += int ( tmp )
        print ( total )
