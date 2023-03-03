def import sys , string , traceback
from os import urandom
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.s = string
        if len ( s ) != 26 :
            a = [ ]
            for c in s :
                a.append ( 1 )
            for i in range ( 26 ) :
                if a [ i ] == 0 :
                    tmp = chr ( ord ( 'a' ) + i )
                    print ( s , tmp )
                    break
        else :
            bre = False
            for i in range ( len ( s ) - 1 , 0 , - 1 ) :
                if s [ i ] > s [ i - 1 ] :
                    min = s [ i ]
                    for j in range ( i , len ( s ) ) :
                        if s [ j ] > s [ i - 1 ] :
                            min = min [ min [ j ] ]
                    mi = chr ( min [ 0 ] )
                    print ( s [ : i - 1 ] , mi )
                    bre = True
                    break
            if not bre :
                print ( - 1 )
