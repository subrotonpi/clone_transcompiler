def main ( ) :
    import sys
    import os
    import sys
    import os
    import sys
    import itertools
    class ONE ( object ) :
        def __init__ ( self ) :
            self.__dict__ = { }
    T = int ( sys.stdin.readline ( ) )
    for t in range ( 1 , T + 1 ) :
        line = sys.stdin.readline ( ).split ( )
        N = int ( line [ 0 ] )
        wires = [ ]
        for n in range ( N ) :
            line = sys.stdin.readline ( ).split ( )
            wires.append ( [ int ( line [ 0 ] ) , int ( line [ 1 ] ) ] )
        intersections = 0
        for i in range ( N ) :
            for j in range ( N ) :
                if wires [ i ] [ 0 ] > wires [ j ] [ 0 ] and wires [ i ] [ 1 ] < wires [ j ] [ 1 ] :
                    intersections += 1
            print ( "Case #%d: %d" % ( t , intersections ) )
