def _import ( ) :
    import os
    import math
    class Logging :
        PROBLEM_NAME = "logging"
        WORK_DIR = r"D:\GCJ\\"+PROBLEM_NAME+" \ ""
        class Point :
            def __init__ ( self , x , y ) :
                self.x , self.y = x , y
            def __call__ ( self , x , y ) :
                self.x , self.y = x , y
            def get_type ( self ) :
                if x > 0 :
                    return 1
                elif x == 0 and y > 0 :
                    return 2
                elif x < 0 :
                    return 3
                else :
                    return 4
            def __lt__ ( self , other ) :
                t1 , t2 = get_type ( self )
                if t1 != t2 :
                    return t1 - t2
                if t1 == 2 or t1 == 4 :
                    return 0
                diff = y * self.x - x * self.y
                return ( - 1 if diff < 0 else ( 1 if diff > 0 else 0 ) )
        def solve ( self , X , Y ) :
            N = len ( self.X )
            p = [ ( x , y ) for x in self.X ]
            p.sort ( )
            pos = 0
            p2 = [ ]
            cnt = [ ]
            for i in range ( 2 * N ) :
                if i == 0 or p [ i ] > p [ i - 1 ] :
                    p2.append ( p [ i ] )
                    for j in range ( i , N + 1 ) :
                        if j < N and p [ j ] == p [ i ] :
                            cnt.append ( pos )
                        else :
                            pos += 1
                            break
            for i in range ( pos , 2 * pos ) :
                p2.append ( p2 [ i - pos ] )
                cnt.append ( cnt [ i - pos ] )
    return Logging ( )
