def import _np
import collections
import os
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N , sum = len ( sys.argv ) , 0
        for i in range ( 1 , N + 1 ) :
            sum += i
        print ( ( sum * 10000 ) / N )
    def adjustValue ( self , value ) :
        if 10 > value :
            return "0" + str ( value )
        else :
            return "{}".format ( value )
