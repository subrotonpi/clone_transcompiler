def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = int ( sc.readline ( ) )
        moti = [ ]
        co = 1
        for i in range ( N ) :
            moti.append ( int ( sc.readline ( ) ) )
        moti.sort ( reverse = True )
        for i in range ( 1 , N ) :
            if moti [ i - 1 ] > moti [ i ] :
                co += 1
        sys.stdout.write ( co )
