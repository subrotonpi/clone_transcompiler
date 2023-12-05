def import import math
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self._win = sys._getframe ( 1 )
        self._win.frame = sys._getframe ( 2 )
        self._win.frame = sys._getframe ( 3 )
        self._win.frame = sys._getframe ( 4 )
        self._win.frame = sys._getframe ( 5 )
        self._win.frame = sys._getframe ( 8 )
        self._win.frame = sys._getframe ( 8 )
        self._win.frame = sys._getframe ( 9 )
        self._win.frame = sys._getframe ( 8 )
        self._win.frame = sys._getframe ( 9 )
        self._win.frame = sys._getframe ( 8 )
        self._win.frame = sys._getframe ( 9 )
        self._win.frame = sys._getframe ( 8 )
        self._win.frame = sys._getframe ( 8 )
        self._win.frame = sys._getframe ( 8 )
        self._win.frame = sys._getframe ( 8 )
        self._win.frame = sys._getframe ( 8 )
    def f ( self , pre , b , a ) :
        if b == 0 and min [ pre ] < int ( a [ pre ] ) / 3 :
            return min [ pre ]
        if b == 1 and max [ pre ] > 0 :
            return max [ pre ]
        ret = int ( b ) / 3 if b == 0 else - int ( a [ pre ] ) / 3
        for i in range ( pre + 1 , len ( a ) ) :
            f = self._win.frame.f_f
            if b == 0 :
                if f :
                    ret = min [ ret ] = abs ( a [ pre ] - a [ - 1 ] )
                else :
                    ret = min [ ret ] = f ( i , b ^ 1 , a )
            else :
                if f :
                    ret = max [ ret ] = abs ( a [ pre ] - a [ - 1 ] )
                else :
                    ret = max [ ret ] = f ( i , b ^ 1 , a )
                