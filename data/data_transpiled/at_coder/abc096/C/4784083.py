def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = raw_input
    def __init__ ( self ) :
        self.h , self.w = self.raw_input ( )
        po = [ [ '.' , '.' ] ]
        for i in range ( self.h + 2 ) :
            po [ 0 ].append ( '.' )
            po [ h + 1 ].append ( '.' )
        for s in self.raw_input ( ).split ( '' , 1 ) :
            for i in range ( self.h + 1 ) :
                if i == 0 or i == self.w + 1 :
                    po [ i ].append ( '.' )
                else :
                    po [ i ].append ( s [ i - 1 ] )
    b = True
    for i in range ( 1 , self.h + 1 ) :
        for j in range ( 1 , self.w + 1 ) :
            if not b :
                break
            if po [ i ] [ j ] == '#' :
                if po [ i - 1 ] [ j ] == '.' and po [ i + 1 ] [ j ] == '.' and po [ i ] [ j + 1 ] == '.' and po [ i ] [ j - 1 ] == '.' :
                    b = False
    print ( ( 'Yes' if b else 'No' ) )
