def _import ( ) :
    import math
    import numpy as np
    class Main ( object ) :
        def f ( x , p ) :
            return x + p / np.power ( 2 , x / 1.5 )
    s = sys.stdin.readline ( )
    p = s.readline ( ).strip ( )
    xmax = p
    xmin = 0.0
    for i in range ( 512 ) :
        xmid1 = ( xmax - xmin ) / 3.0 + xmin
        xmid2 = 2.0 * ( xmax - xmin ) / 3.0 + xmin
        if f ( xmid1 , p ) < f ( xmid2 , p ) :
            xmax = xmid2
        else :
            xmin = xmid1
    sys.stdout.write ( "%.20f\n" % f ( xmax , p ) )
