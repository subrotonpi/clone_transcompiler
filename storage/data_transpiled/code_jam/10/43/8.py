def main ( args ) :
    import sys
    import time
    import random
    class x ( object ) :
        def __init__ ( self ) :
            self.t = int ( time.time ( ) )
    t = time.time ( )
    for tt in range ( 1 , t + 1 ) :
        z = [ False for i in range ( 101 ) ]
        r , cnt = 0 , 0
        for i in range ( r ) :
            x1 , y1 , x2 , y2 = random.randint ( 0 , 101 ) , random.randint ( 0 , 101 ) , random.randint ( 0 , 101 )
            for a in range ( x1 , x2 + 1 ) :
                for b in range ( y1 , y2 + 1 ) :
                    if not z [ a ] [ b ] :
                        cnt += 1
                    z [ a ] [ b ] = True
        for s in range ( 1 , s + 1 ) :
            for i in range ( 100 , 1 , - 1 ) :
                for j in range ( 100 , 1 , - 1 ) :
                    if z [ i - 1 ] [ j ] and z [ i ] [ j - 1 ] and not z [ i ] [ j ] :
                        z [ i ] [ j ] = True
                        cnt += 1
                    if not z [ i - 1 ] [ j ] and not z [ i ] [ j - 1 ] and z [ i ] [ j ] :
                        z [ i ] [ j ] = False
                        cnt -= 1
                if cnt == 0 :
                    break
            print ( "Case #%d: %d" % ( tt , s ) )
