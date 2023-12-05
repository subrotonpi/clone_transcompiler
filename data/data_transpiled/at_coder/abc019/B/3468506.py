def import import sys , string , traceback
from os import urandom
class Main ( object ) :
    def __init__ ( self ) :
        self.s = string.encode ( sys.getfilesystemencoding ( ) )
        self.t = ""
        count = 0
        for i in range ( 1 , len ( s ) ) :
            count += 1
            if s [ i ] != s [ i - 1 ] :
                self.t += str ( s [ i - 1 ] )
                self.t += str ( count )
                count = 0
        print ( self.t )
