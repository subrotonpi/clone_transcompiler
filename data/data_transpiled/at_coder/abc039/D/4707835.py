def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = raw_input
    def main ( self ) :
        self.h = self.raw_input ( )
        self.w = self.raw_input ( )
        field = [ ]
        for line in self.input :
            field.append ( line.split ( ) )
        next = [ ]
        for line in next :
            line.append ( '#' )
        for i in range ( self.h ) :
            for j in range ( self.w ) :
                if field [ i ] [ j ] == '.' :
                    for k in range ( self.i - 1 , self.i + 1 ) :
                        for l in range ( self.j - 1 , self.j + 1 ) :
                            if k < 0 or k >= self.h or l < 0 or l >= self.w :
                                continue
                            next [ k ].append ( '.' )
        reverse = [ ]
        for line in self.input :
            line.append ( '#' )
        for i in range ( self.h ) :
            for j in range ( self.w ) :
                if field [ i ] [ j ] == '#' :
                    for k in range ( self.i - 1 , self.i + 1 ) :
                        for l in range ( self.j - 1 , self.j + 1 ) :
                            if k < 0 or k >= self.h or l < 0 or l >= self.w :
                                continue
                            reverse [ k ].append ( '#' )
        lines = [ ]
        for line in self.input :
            if line.split ( ) [ 0 ] != '' :
                lines.append ( line.split ( ) )
        print ( 'possible' )
        sys.stdout.write ( '\n'.join ( lines ) )
