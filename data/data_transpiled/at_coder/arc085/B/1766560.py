def import import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self._main = sys._getframe ( 1 )
    def run ( self ) :
        with open ( self._main , 'r' ) as f :
            n , z , w = self._main.shape
            a = [ z ]
            if n >= 2 :
                print ( max ( abs ( w - a [ n - 1 ] ) , abs ( a [ n - 1 ] - a [ n - 2 ] ) ) )
            elif n == 1 :
                print ( abs ( w - a [ 0 ] ) )
    def tr ( self , * args ) :
        print ( "".join ( args ) )
