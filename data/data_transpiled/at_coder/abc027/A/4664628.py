def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        nums = [ sc.readline ( ) for i in range ( 3 ) ]
        nums = [ int ( i ) for i in nums ]
        if nums [ 0 ] != nums [ 1 ] :
            print ( nums [ 0 ] )
        else :
            print ( nums [ 2 ] )
