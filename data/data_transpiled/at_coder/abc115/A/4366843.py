def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        try :
            sc = sys.stdin
        except :
            print ( "out" )
            return
        d = int ( sc.readline ( ) )
        print ( "Christmas" , end = "" )
        for i in range ( 25 - d ) :
            print ( " Eve" , end = "" )
        print ( "" )
