def import _WhatAreBirds
class WhatAreBirds ( object ) :
    def __init__ ( self ) :
        self.T = len ( sys.stdin )
        for t in range ( 1 , T + 1 ) :
            print ( "Case #%d: " % t , end = ' ' )
            n = len ( sys.stdin )
            bird_present = False
            h = [ ]
            w = [ ]
            is_b = [ ]
            for i in range ( n ) :
                h.append ( sys.stdin.readline ( ) )
                w.append ( sys.stdin.readline ( ) )
                str = sys.stdin.readline ( )
                is_b.append ( str == 'BIRD' )
                if not is_b :
                    sys.stdin.readline ( )
                bird_present |= is_b
            uh , lh , uw , lw = 0 , 1000000 , 0 , 1000000
            for i in range ( n ) :
                if is_b :
                    lh , uh , lw , uw = min ( lh , h ) , max ( uh , h ) , min ( lw , w ) , max ( uw , w )
            print ( )
            m = len ( sys.stdin )
            for i in range ( m ) :
                height , weight = sys.stdin.readline ( ).split ( )
                is_not_bird = not bird_present or ( height < lh or height > uh or weight < lw or weight > uw )
                nlh , nuh , nlw , nuw = min ( lh , height ) , max ( uh , height ) , min ( lw , weight ) , max ( uw , weight )
                is_bird = True
                for j in range ( n ) :
                    if not is_b and h [ j ] >= nlh and h [ j ] <= nuh and w [ j ] >= nlw and w [ j ] <= nuw :
                        is_bird = False
                        break
                if ( is_bird and is_not_bird ) :
                    print ( "UNKNOWN" )
                elif is_bird :
                    print ( "NOT BIRD" )
