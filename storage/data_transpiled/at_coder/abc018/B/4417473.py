def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.po = sys.stdin.read ( )
        self.n = len ( self.po )
    s = po.split ( '' , 0 )
    for i in range ( self.n ) :
        a = self.n - 1
        b = self.n - 1
        for j in range ( 0 , ( b - a ) / 2 ) :
            c = s [ a + j ]
            s [ a + j ] = s [ b - j ]
            s [ b - j ] = c
    for i in s :
        sys.stdout.write ( i )
    sys.stdout.write ( '\n' )
