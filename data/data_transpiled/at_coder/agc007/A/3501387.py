def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        H , W = ni ( )
        A = [ ]
        for i in range ( H ) :
            A.append ( sc.read ( ).decode ( 'utf-8' ) )
        for x1 in range ( H ) :
            for y1 in range ( W ) :
                for x2 in range ( H ) :
                    for y2 in range ( W ) :
                        if x1 < x2 and y2 < y1 and A [ x1 ] [ y1 ] == '#' and A [ x2 ] [ y2 ] == '#' :
                            print ( 'Impossible' )
                            return
            print ( 'Possible' )
    def ni ( self ) :
        return int ( sc.read ( ) )
