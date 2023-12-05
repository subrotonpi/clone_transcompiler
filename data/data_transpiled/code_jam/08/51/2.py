def _ _ main _ _ ( ) :
    import random
    import sys
    import math
    class ProblemA :
        dx = [ 0 , - 1 , 0 , 1 ]
        dy = [ 1 , 0 , - 1 , 0 ]
        def __init__ ( self , area ) :
            self.area = area
            self.area = area
            self.count = 0
            for x in range ( self.count ) :
                for y in range ( self.area ) :
                    if ( self.area <= y ) or ( self.area <= x ) :
                        self.area += 1
            self.area += 1
    def do_main ( ) :
        return ProblemA ( )
    for case_num in range ( 1 , case_num + 1 ) :
        print ( case_num , end = '' )
        print ( 'Case #%d: ' % case_num , end = '' )
        minX = [ 0 ] * 6500
        maxX = [ 0 ] * 6500
        minY = [ 0 ] * 6500
        maxY = [ 0 ] * 6500
        minX [ maxX ] = 10000
        maxX [ maxY ] = - 10000
        minY [ maxY ] = 10000
        curX , curY = 3200 , 3200
        dir = 0
        L = len ( sc )
        area = 0
        for t in range ( L ) :
            s = sc.next ( )
            cnt = len ( sc )
            for tt in range ( cnt ) :
                for ttt in s :
                    c = sc [ ttt ]
                    if c == 'L' :
                        dir = ( dir + 1 ) % 4
                    elif c == 'R' :
                        dir = ( dir + 3 ) % 4
                    else :
                        if dir == 0 :
                            minX [ curY ] = min ( minX [ curY ] , curX )
                            maxX [ curY ] = max ( maxX [ curY ] , curX )
                        elif dir == 1 :
                            minY [ curX - 1 ] = min ( minY [ curX - 1 ] , curY )
                            maxY [ curX - 1 ] = max ( maxY [ curX - 1 ] , curY )
                            area -= curY
                        elif dir == 2 :
                            minX [ curY - 1 ] = min ( minX [ curY ] , curX )