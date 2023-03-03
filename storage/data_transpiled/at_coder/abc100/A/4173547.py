def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        x , y = sc.read ( ).split ( '\n' )
        if x > 8 or y > 8 :
            print ( ':(' )
        else :
            print ( 'Yay!' )
