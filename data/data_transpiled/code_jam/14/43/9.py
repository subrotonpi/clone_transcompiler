def test_solve ( ) :
    import os
    import sys
    import random
    import sys
    import os
    import random
    import sys
    for current_test in range ( t ) :
        w = random.randint ( 1 , h )
        n = random.randint ( 1 , 2 )
        a = [ ]
        a.append ( ( - 1 , 0 , - 1 , h - 1 ) )
        a.append ( ( w , 0 , w , h - 1 ) )
        for i in range ( 2 , n ) :
            a.append ( ( randint ( 1 , 1 ) , randint ( 1 , 1 ) , randint ( 1 , 1 ) ) )
        print ( "Case #%d: %s" % ( current_test + 1 , solve ( a ) ) , file = sys.stderr )
    def solve ( a ) :
        n = len ( a )
        d = [ ]
        was = [ False ]
        d.append ( 0 )
        while 1 :
            min = - 1
            for i in range ( n ) :
                if was [ i ] or d [ i ] == int ( d [ i ] ) :
                    continue
                if min < 0 or d [ min ] > d [ i ] :
                    min = i
            if min < 0 :
                break
            was.append ( True )
            for i in range ( n ) :
                if min == i :
                    continue
                w = get_weight ( a [ min ] , a [ i ] )
                if d [ i ] > d [ min ] + w :
                    d [ i ] = d [ min ] + w
        return d [ 1 ]
    def get_weight ( a , b ) :
        return max ( b.x1 - a.x2 - 1 , max ( a.x1 - b.x2 - 1 , max ( a.y1 - b.y2 - 1 , b.y1 - a.y2 - 1 ) ) )
    class Rectangle ( object ) :
        x1 = random.randint ( 1 , 2 )
        y1 = random.randint ( 1 , 2 )
        x2 = random.randint ( 1 , 2 )
        y2 = random.randint ( 1 , 2 )
    print ( "Solution #%d: %s" % ( current_test , solve ( a ) ) , file = sys