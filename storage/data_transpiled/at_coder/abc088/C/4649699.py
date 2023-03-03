def _import ( ) :
    import sys
    import os
    import subprocess
    c = [ [ ] for i in range ( 0 , 3 , 1 ) ]
    for i in range ( 0 , 100 , 1 ) :
        a1 = i
        b1 = c [ 0 ] [ 0 ] - a1
        b2 = c [ 0 ] [ 1 ] - a1
        b3 = c [ 0 ] [ 2 ] - a1
        a2 = c [ 1 ] [ 0 ] - b1
        if a2 + b2 != c [ 1 ] [ 1 ] or a2 + b3 != c [ 1 ] [ 2 ] :
            continue
        a3 = c [ 2 ] [ 0 ] - b1
        if a3 + b2 != c [ 2 ] [ 1 ] or a3 + b3 != c [ 2 ] [ 2 ] :
            continue
        print ( "Yes" )
        return
    print ( "No" )
