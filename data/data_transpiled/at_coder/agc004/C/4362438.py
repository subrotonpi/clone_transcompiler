def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = raw_input
    def __init__ ( self ) :
        self.raw_input = raw_input
    def main ( ) :
        self.h , self.w = self.raw_input ( )
        self.reds = [ ]
        for i in range ( self.h ) :
            for j in range ( self.w ) :
                if j == 0 or ( j != self.w - 1 and i % 2 == 0 ) :
                    self.reds.append ( '#' )
                else :
                    self.reds.append ( '.' )
    red = [ ]
    blue = [ ]
    blues = [ ]
    for i in range ( self.h ) :
        line = self.raw_input ( ).split ( '\n' )
        for j in range ( self.w ) :
            if line [ j ] == '#' :
                blues.append ( '.' )
            else :
                blues.append ( '#' )
            if line [ j ] == '#' :
                self.reds.append ( '#' )
                self.blues.append ( '#' )
        red.append ( ''.join ( reds ) + '\n' )
        blue.append ( ''.join ( blues ) + '\n' )
    print ( red , end = '' )
    print ( blue , end = '' )
