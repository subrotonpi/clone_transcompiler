def import _sys
import sys
import os
class Main ( object ) :
    def __init__ ( self ) :
        self.x = a
        self.y = b
        self.dif = a - b
    def __lt__ ( self , other ) :
        if self.dif < 0 and self.dif < 0 :
            return self.x - other.x
        elif self.dif < 0 and self.dif >= 0 :
            return - 1
        elif self.dif >= 0 and self.dif < 0 :
            return 1
        else :
            return other.y - other.y
    def __main__ ( self ) :
        f = open ( "/proc/sys/stdin" , "r" )
        n = len ( f.readlines ( ) )
        x = [ ( f.readline ( ) , f.readline ( ) ) for f in f.readlines ( ) ]
        x.sort ( )
        tmp_max = 0
        tmp = 0
        for i in range ( n ) :
            tmp += x [ i ] [ 0 ]
            if tmp_max < tmp :
                tmp_max = tmp
            tmp -= x [ i ] [ 1 ]
        print ( tmp_max )
