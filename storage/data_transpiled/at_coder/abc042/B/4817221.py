def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = int ( sc.readline ( ) )
        L = int ( sc.readline ( ) )
        moji = [ sc.readline ( ) for i in range ( N ) ]
        moji.sort ( )
        for i in moji :
            print ( i , end = ' ' )
