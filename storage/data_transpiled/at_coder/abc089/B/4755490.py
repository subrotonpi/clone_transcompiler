def import sys , color , or
from os import urandom
class Main ( object ) :
    def __init__ ( self ) :
        self.stream = urandom
    def read ( self ) :
        return self.stream.read ( )
N = len ( sys.argv )
color = [ ]
or = False
for i in range ( N ) :
    color.append ( sys.argv [ i ] )
    if color [ i ] == 'Y' :
        or = True
    if not or :
        print ( 'Three' )
    else :
        print ( 'Four' )
