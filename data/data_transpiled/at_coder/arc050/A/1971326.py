def import _readline
import sys
import re
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.r = sys.stdin.readline ( )
        self.s = r.decode ( 'utf-8' )
        self.sl = re.split ( '[s]+' , self.s )
        a = self.sl [ 0 ]
        b = self.sl [ 1 ]
        print ( 'Yes' if a.lower ( ) == b else 'No' )
