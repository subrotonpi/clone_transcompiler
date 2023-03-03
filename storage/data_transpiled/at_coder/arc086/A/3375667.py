def import readline
import sys
import readline
import readline
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        rd = sys.stdin
        N = rd.__next__ ( )
        K = rd.__next__ ( )
        counter = 0
        a_num = [ ]
        for i in range ( N ) :
            a_num [ rd.__next__ ( ) - 1 ] += 1
        a_num.sort ( )
        ans = 0
        for i in range ( N ) :
            if K > 0 :
                K -= 1
            else :
                ans += a_num [ N - i - 1 ]
        print ( ans )
class Reader ( object ) :
    def __init__ ( self , f ) :
        self.f = f
        self.readline = None
    def readline ( self ) :
        while not self.readline or not self.readline :
            self.readline = self.__next__ ( )
        return self.readline
    def __next__ ( self ) :
        return int ( self.__next__ ( ) )
    def __next__ ( self ) :
        return long ( self.__next__ ( ) )
    def nextDouble ( self ) :
        return double ( self.nextDouble ( ) )
