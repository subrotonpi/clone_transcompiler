def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.h = sys.maxint
        self.w = sys.maxint
    def __init__ ( self ) :
        self.field = [ ]
        for i in range ( self.h ) :
            self.field.append ( self.field [ i ] )
    def count ( self ) :
        for i in range ( self.h ) :
            for j in range ( self.w ) :
                if self.field [ i ] [ j ] == '#' :
                    self.count += 1
                    if i == 0 and j == 0 :
                        pass
                    elif ( i != 0 and self.field [ i - 1 ] [ j ] == '#' ) ^ ( j != 0 and self.field [ i ] [ j - 1 ] == '#' ) :
                        pass
                    else :
                        print ( 'Impossible' )
                        return
                    if i == self.h - 1 and j == self.w - 1 :
                        pass
                    elif ( i != self.h - 1 and self.field [ i + 1 ] [ j ] == '#' ) ^ ( j != self.w - 1 and self.field [ i ] [ j + 1 ] == '#' ) :
                        pass
                    else :
                        print ( 'Impossible' )
                        return
    if count == self.h + self.w - 1 :
        print ( 'Possible' )
    else :
        print ( 'Impossible' )
