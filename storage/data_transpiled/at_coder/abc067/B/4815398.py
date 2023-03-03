def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = int ( sc.readline ( ) )
        hebi = [ ]
        nam = int ( sc.readline ( ) )
        sam = 0
        for i in range ( N ) :
            hebi.append ( int ( sc.readline ( ) ) )
        hebi.sort ( reverse = True )
        for i in range ( nam ) :
            sam += hebi [ i ]
        sys.stdout.write ( sam )
