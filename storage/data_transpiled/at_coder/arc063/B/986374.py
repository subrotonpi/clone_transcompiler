def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = sys.argv.index ( 'N' )
            self.T = sys.argv.index ( 'T' )
    A = [ ]
    for i in range ( N ) :
        A.append ( i )
    min = [ A [ 0 ] ]
    for i in range ( 1 , N ) :
        if A [ i ] < min [ i - 1 ] :
            min.append ( A [ i ] )
        else :
            min.append ( min [ i - 1 ] )
    max = [ A [ N - 1 ] ]
    for i in range ( N - 2 , - 1 , - 1 ) :
        if A [ i ] > max [ i + 1 ] :
            max.append ( A [ i ] )
        else :
            max.append ( max [ i + 1 ] )
    maxgap = 0
    for i in range ( N ) :
        if maxgap < max [ i ] - min [ i ] :
            maxgap = max [ i ] - min [ i ]
    prevmax = None
    prevmin = None
    count = 0
    for i in range ( N ) :
        if max [ i ] - min [ i ] == maxgap and ( prevmax != max [ i ] or prevmin != min [ i ] ) :
            count += 1
        prevmax = max [ i ]
        prevmin = min [ i ]
    print ( count )
