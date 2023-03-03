def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = raw_input
    def main ( self ) :
        self.h , self.w = self.raw_input ( ).split ( ' ' )
        block = [ [ True for i in range ( 0 , h + 1 ) ] for line in self.input ]
        [ block [ i ] for i in range ( h ) ]
        for line in self.input :
            line = line.split ( ' ' )
            for j in range ( w ) :
                block [ i ] [ j ] = ( line [ j ] == '#' )
        win = [ [ True for i in range ( h + 1 ) ] for j in range ( w ) ]
        for i in range ( h , - 1 , - 1 ) :
            for j in range ( w , - 1 , - 1 ) :
                if block [ i ] [ j ] :
                    win [ i ] [ j ] = True
                elif win [ i + 1 ] [ j ] and win [ i + 1 ] [ j + 1 ] and win [ i ] [ j + 1 ] :
                    win [ i ] [ j ] = False
                else :
                    win [ i ] [ j ] = True
        print ( 'First' if win [ 0 ] [ 0 ] else 'Second' )
