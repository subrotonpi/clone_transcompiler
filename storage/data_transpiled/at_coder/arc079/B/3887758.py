def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
    def run ( self ) :
        x = int ( self.sc )
        rem = int ( x % 50 )
        sho = x / 50
        print ( 50 )
        for i in range ( 50 ) :
            if i < rem :
                print ( ( sho + 50 ) , end = " " )
            else :
                print ( ( sho + 49 - rem ) + ( "\n" if ( i == 49 ) else " " ) , end = " " )
