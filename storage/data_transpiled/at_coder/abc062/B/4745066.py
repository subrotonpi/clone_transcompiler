def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.ans = ''
    def __call__ ( self , * args ) :
        self.ans = ''
    def main ( self ) :
        return self.ans
    a = int ( a )
    b = int ( b )
    s = [ [ '#' ] * ( a + 2 ) for i in range ( a + 2 ) ]
    for S in s [ 1 : a ] :
        S2 = S.split ( '' )
        for j in range ( b ) :
            s [ i ] [ j + 1 ] = S2 [ j ]
    for i in range ( a + 2 ) :
        for j in range ( b + 2 ) :
            print ( s [ i ] [ j ] , end = ' ' )
        print ( )
