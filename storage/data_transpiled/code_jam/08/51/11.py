def round3 ( ) :
    import sys
    import itertools
    import itertools
    import os
    import sys
    import os
    import sys
    import os
    import time
    import time
    class HowBigAreThePockets ( object ) :
        def main ( self ) :
            with open ( os.path.join ( os.path.dirname ( __file__ ) , '..' , '__init__.py' ) , 'r' ) as f :
                n = len ( f.readlines ( ) )
                for i in range ( 1 , n + 1 ) :
                    l = len ( f.readlines ( ) )
                    x = 0
                    y = 0
                    direction = 1
                    points1 = [ ]
                    points2 = [ ( x , y ) ]
                    for j in range ( l ) :
                        s = f.readlines ( )
                        t = time.time ( )
                        for k in range ( t ) :
                            for m in s :
                                c = m [ 0 ]
                                if c == 'L' :
                                    direction += 1
                                    if direction == 5 :
                                        direction = 1
                                elif c == 'R' :
                                    direction -= 1
                                    if direction == 0 :
                                        direction = 4
                                elif c == 'F' :
                                    if direction == 1 :
                                        y += 1
                                        points2.append ( ( 2 * x , 2 * y - 1 ) )
                                    elif direction == 2 :
                                        x -= 1
                                        points1.append ( ( 2 * x + 1 , 2 * y ) )
                                    elif direction == 3 :
                                        y -= 1
                                        points2.append ( ( 2 * x , 2 * y + 1 ) )
                                    elif direction == 4 :
                                        x += 1
                                        points1.append ( ( 2 * x - 1 , 2 * y ) )
                                    else :
                                        raise RuntimeError
    pockets = set ( )
    for p1 in points1 :
        if p1 [ 0 ] == p2 [ 0 ] :
            for j in range ( p1 [ 1 ] , p2 [ 1 ] + 2 ) :
                pockets.add ( ( j , p1 [ 1 ] ) )
    print ( 'Case #%d: %d\n' % ( i , len ( pockets ) ) )