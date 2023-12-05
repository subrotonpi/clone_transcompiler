def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
        min = 999
        for part in s [ : - 2 ] :
            number = int ( part )
            difference = abs ( number - 753 )
            if difference < min :
                min = difference
        print ( min )
