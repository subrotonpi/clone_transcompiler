def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n , self.l = sys.stdin.readline ( ).split ( '\n' )
        self.l = len ( self.l )
    lines = [ line.strip ( ) for line in sys.stdin.readlines ( ) ]
    pos = lines.index ( 'o' )
    for line in lines [ : l - 1 ] :
        if pos != n * 2 - 2 and line [ pos + 1 ] == '-' :
            pos += 2
        elif pos != 0 and line [ pos - 1 ] == '-' :
            pos -= 2
    print ( pos / 2 + 1 )
