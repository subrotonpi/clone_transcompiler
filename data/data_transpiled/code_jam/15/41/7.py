def _import ( ) :
    import os
    import sys
    import random
    import random
    class Pegman :
        PROBLEM_NAME = "pegman"
        WORK_DIR = r"D:\GCJ\\"+PROBLEM_NAME+" \ ""
        def solve ( self , sc , f ) :
            R = random.randint ( 0 , R )
            C = random.randint ( 0 , C )
            map = [ ]
            for i in range ( R ) :
                map.append ( sc.next ( ).split ( ) )
            dr = ( 1 , - 1 , 0 , 0 )
            dc = ( 0 , 0 , - 1 , 1 )
            ans = 0
            for i in range ( R ) :
                for j in range ( C ) :
                    if map [ i ] [ j ] == '.' :
                        continue
                    nghcnt = [ ]
                    for d in range ( 4 ) :
                        ii = i + dr [ d ]
                        jj = j + dc [ d ]
                        while ii in range ( R ) and jj in range ( C ) :
                            if map [ ii ] [ jj ] != '.' :
                                nghcnt.append ( d )
                            ii += dr [ d ]
                            jj += dc [ d ]
                    if nghcnt [ 0 ] + nghcnt [ 1 ] + nghcnt [ 2 ] + nghcnt [ 3 ] == 0 :
                        f.write ( "IMPOSSIBLE" )
                        return
                    if map [ i ] [ j ] == 'v' :
                        ourd = 0
                    elif map [ i ] [ j ] == '^' :
                        ourd = 1
                    elif map [ i ] [ j ] == '<' :
                        ourd = 2
                    else :
                        ourd = 3
                    if nghcnt [ ourd ] == 0 :
                        ans += 1
            f.write ( ans )
    return Pegman ( )
