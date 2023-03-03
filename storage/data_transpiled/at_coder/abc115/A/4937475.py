def import sys
class Main ( object ) :
    def __init__ ( self ) :
        bf = sys.stdin
        D = int ( bf.readline ( ) )
        if D == 25 :
            str = "Christmas"
        elif D == 24 :
            str = "Christmas Eve"
        elif D == 23 :
            str = "Christmas Eve Eve"
        else :
            str = "Christmas Eve Eve"
        print ( str )
