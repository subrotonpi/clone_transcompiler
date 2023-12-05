def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = raw_input
    def go ( self ) :
        self.h = self.raw_input ( )
        self.w = self.raw_input ( )
        self.po = [ ]
        for p in self.input ( ) :
            s = p.split ( '' , 1 )
            for j in range ( self.w ) :
                self.po [ self.i + 1 ].append ( ( s [ j ] == '#' ) )
        self.ans = [ ]
        for i in range ( self.h ) :
            for j in range ( self.w ) :
                self.ans.append ( ( po [ self.i + 1 ] [ j + 1 ] == 1 ) and '#' or po [ self.i ] [ j ] + po [ self.i + 1 ] [ j ] + po [ self.i + 2 ] [ j ] + po [ self.i ] [ j + 1 ] + po [ self.i + 2 ] [ j + 1 ] + po [ self.i + 1 ] [ j + 2 ] + po [ self.i + 2 ] [ j + 2 ] )
        print ( )
