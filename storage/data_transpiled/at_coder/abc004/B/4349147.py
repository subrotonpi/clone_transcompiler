def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sys = sys
    def __call__ ( self , * args ) :
        try :
            sc = open ( "/proc/self/" , "r" )
        except :
            print ( "out" )
            return
        bd = [ ]
        for i in range ( 4 ) :
            for j in range ( 4 ) :
                bd [ i ].append ( sc.read ( ) )
        for i in range ( 3 , - 1 , - 1 ) :
            print ( bd [ i ] [ 3 ] , bd [ i ] [ 2 ] , bd [ i ] [ 1 ] , bd [ i ] [ 0 ] )
