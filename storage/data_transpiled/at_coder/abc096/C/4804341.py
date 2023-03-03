def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sys = sys.stdin
    def __call__ ( self , * args ) :
        return sys.stdin.read ( )
    H = int ( sys.argv [ 1 ] )
    W = int ( sys.argv [ 2 ] )
    s = [ ]
    able = True
    for i in range ( 1 , H + 1 ) :
        st = raw_input ( )
        for j in range ( 1 , W + 1 ) :
            s.append ( st [ j - 1 ] )
    for i in range ( 1 , H ) :
        for j in range ( 1 , W ) :
            if s [ i ] [ j ] == '#' and s [ i - 1 ] [ j ] != '#' and s [ i + 1 ] [ j ] != '#' and s [ i ] [ j - 1 ] != '#' and s [ i ] [ j + 1 ] != '#' :
                able = False
    print ( 'Yes' if able else 'No' )
