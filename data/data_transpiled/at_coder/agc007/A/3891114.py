def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.solve ( )
    def solve ( self ) :
        h , w = self.solve ( )
        count = 0
        for row in self.solve ( ) :
            for c in row :
                if c == '#' :
                    count += 1
        print ( 'Possible' if count == h + w - 1 else 'Impossible' )
