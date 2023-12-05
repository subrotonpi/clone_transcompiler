def main ( ) :
    import sys
    import os
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            try :
                with open ( sys.argv [ 1 ] ) as f :
                    NMQ = f.readline ( ).split ( )
            except IOError :
                e = sys.exc_info ( ) [ 1 ]
                E = [ x2 , y2 ] - ( x1 - 1 ) [ 0 ]
                E = [ x2 , y2 ] - ( x1 - 1 ) [ 0 ] + ( x1 - 1 ) [ 0 ]
                v = V [ x2 , y2 ] + ( x1 - 1 ) [ 0 ] - V [ x2 , y1 ]
                h = H [ x2 , y2 ] - H [ x1 , y2 ] + ( y1 - 1 ) [ 0 ] - H [ x2 , y1 ]
                print ( e - v - h )
    V = [ ]
    H = [ ]
    E = [ ]
    for i in range ( N ) :
        for j in range ( M ) :
            V.append ( ( i - 1 , j ) )
            H.append ( ( i - 1 , j ) )
            E.append ( ( i - 1 , j ) )
    for q in range ( Q ) :
        a = sys.stdin.read ( ).split ( )
        x1 = int ( a [ 0 ] ) - 1
        y1 = int ( a [ 1 ] ) - 1
        x2 = int ( a [ 2 ] ) - 1
        y2 = int ( a [ 3 ] ) - 1
        e = E [ x2 , y2 ] - ( x1 - 1 ) [ 0 ] + ( x1 - 1 ) [ 0 ] - V [ x2 , y1 ]
        v = V [ x2 , y2 ] + ( x1 - 1 ) [ 0 ] - V [ x2 , y1 ]
        h = H [ x2 , y2 ] - H [ x1 , y2 ] + ( y1 - 1 ) [ 0 ] - H [ x2 , y1 ]
        print ( v - h )
