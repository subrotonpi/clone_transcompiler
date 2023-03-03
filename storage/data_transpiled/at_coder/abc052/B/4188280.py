def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.data = sys.stdin.read ( )
    x , max = 0 , 0
    for c in str :
        x += ( c == 'I' )
        max = max ( max , x )
    print ( max )
