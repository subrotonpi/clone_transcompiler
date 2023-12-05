def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = len ( sys.stdin )
        self.field = [ ]
        for i in range ( self.n ) :
            self.field.append ( sys.stdin.read ( ) )
    count = 0
    for i in range ( 9 ) :
        prev = 'a'
        for j in range ( self.n ) :
            c = self.field [ j ] [ i ]
            if c == 'x' or ( c == 'o' and prev != 'o' ) :
                count += 1
            prev = c
    print ( count )
