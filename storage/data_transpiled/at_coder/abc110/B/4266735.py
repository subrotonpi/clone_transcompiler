def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n , m , x , y = sc.regs [ : 2 ]
        xar = [ ]
        for i in range ( n ) :
            xar.append ( sc.regs [ 2 ] )
        xar.sort ( )
        yar = [ ]
        for i in range ( m ) :
            yar.append ( sc.regs [ 2 ] )
        yar.sort ( )
        x_max = xar [ n - 1 ]
        y_min = yar [ 0 ]
        if x_max >= y_min :
            print ( "War" )
            return
        else :
            print ( "No War" if x <= x_max and y_min <= y else "War" )
