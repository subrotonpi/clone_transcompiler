def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.count ( )
        K = sc.count ( )
        arr = [ ]
        r = 0
        for i in range ( N ) :
            arr.append ( sc.choice ( arr ) )
        arr.sort ( key = lambda x : x [ 0 ] )
        for j in range ( K - 1 , 0 , - 1 ) :
            r = ( r + float ( arr [ j ] ) ) / 2
        print ( r )
