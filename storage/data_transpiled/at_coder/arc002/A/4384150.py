def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = sys.stdin
    def __call__ ( self ) :
        sc = os.popen ( "%s y" % self.raw_input )
        y = sc.read ( )
        uruu = False
        if y % 400 == 0 :
            uruu = True
        elif y % 100 != 0 and y % 4 == 0 :
            uruu = True
        if uruu :
            print ( "YES" )
        else :
            print ( "NO" )
