def import sys
class Problem ( object ) :
    def __init__ ( self ) :
        self.T = sys.stdin.read ( )
    for i in range ( 1 , T + 1 ) :
        map = [ ]
        R = sys.stdin.read ( )
        C = sys.stdin.read ( )
        for line in open ( '/etc/init.d' , 'r' ).readlines ( ) :
            for k in range ( 1 , C + 1 ) :
                map.append ( line [ k - 1 ] )
        possible = True
        for j in range ( 1 , R + 1 ) :
            for k in range ( 1 , C + 1 ) :
                if map [ j ] [ k ] == '#' :
                    map [ j ] [ k ] = '/'
                    if map [ j ] [ k + 1 ] == '#' and map [ j + 1 ] [ k + 1 ] == '#' and map [ j + 1 ] [ k + 1 ] == '#' :
                        map [ j ] [ k + 1 ] = ' \ \'
                        map [ j + 1 ] [ k ] = ' \ \'
                        map [ j + 1 ] [ k + 1 ] = '/'
                    else :
                        possible = False
        if not possible :
            print ( 'Case #%d:\n' % i )
            print ( 'Impossible' )
        else :
            print ( 'Case #%d:\n' % i )
            for j in range ( 1 , R + 1 ) :
                for k in range ( 1 , C + 1 ) :
                    print ( map [ j ] [ k ] , end = ' ' )
                print ( )
