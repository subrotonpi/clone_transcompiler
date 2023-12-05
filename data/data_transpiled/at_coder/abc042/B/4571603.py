def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.count = sys.stdin.read ( )
        self.length = sys.stdin.read ( )
        strings = [ ]
        for ix in range ( self.count ) :
            strings.append ( sys.stdin.read ( ) )
        strings.sort ( )
        strings = [ string for string in strings ]
        print ( '\n'.join ( strings ) )
