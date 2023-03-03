def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
        self.s = sys.stdin.read ( )
        print ( self.add ( self.s ) )
    def add ( self , s ) :
        right = [ ]
        left = [ ]
        for i in range ( 1 , len ( s ) ) :
            if s [ i - 1 ] == 'W' :
                right.append ( right [ i - 1 ] + 1 )
            else :
                right.append ( right [ i - 1 ] )
        for i in range ( len ( s ) - 2 , - 1 , - 1 ) :
            if s [ i + 1 ] == 'E' :
                left.append ( left [ i + 1 ] + 1 )
            else :
                left.append ( left [ i + 1 ] )
        self.right = right
        for i in range ( len ( right ) ) :
            self.left = min ( self.left + right [ i ] )
        return self.left
