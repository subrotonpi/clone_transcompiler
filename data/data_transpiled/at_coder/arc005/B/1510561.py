def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.stdin.read ( )
        self.y = sys.stdin.read ( )
        self.w = sys.stdin.read ( )
        self.c = [ ]
        for tmp in sys.stdin.read ( ).split ( '\n' ) :
            for i in range ( 9 ) :
                self.c.append ( "%s" % tmp [ i ] )
        print ( Main.getNum ( self.w , self.x , self.y , self.c ) )
    def getNum ( self , w , x , y , c ) :
        spx = 0
        spy = 0
        nx = x - 1
        ny = y - 1
        if w.find ( "R" ) != - 1 :
            spx += 1
        if w.find ( "L" ) != - 1 :
            spx -= 1
        if w.find ( "U" ) != - 1 :
            spy -= 1
        if w.find ( "D" ) != - 1 :
            spy += 1
        pnum = self.c [ ny ] [ nx ]
        for i in range ( 3 ) :
            if ( nx + spx ) > 8 or ( nx + spx ) < 0 :
                spx = spx * - 1
            if ( ny + spy ) > 8 or ( ny + spy ) < 0 :
                spy = spy * - 1
            nx += spx
            ny += spy
            pnum += self.c [ ny ] [ nx ]
        return pnum
