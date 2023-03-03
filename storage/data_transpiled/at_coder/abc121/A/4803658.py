def import import sys
class Main ( object ) :
    def __init__ ( self , a ) :
        s = sys.stdin
        H , W , h = s.readline ( ).split ( )
        print ( H * W - h * W - ( H - h ) * s.read ( ) )
