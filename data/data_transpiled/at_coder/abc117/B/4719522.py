def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.count ( )
        edges = [ ]
        sum = 0
        max = 0
        for i in range ( N ) :
            edges.append ( sc.get ( i ) )
            sum += edges [ i ]
            max = max ( max , edges [ i ] )
        print ( "Yes" if max < ( sum - max ) else "No" )
