def import import sys , glob
def main ( args ) :
    Scanner ( )
    EPS = 1e-14
    T = Scanner ( ).__next__
    for ca in range ( 1 , T + 1 ) :
        n = Scanner ( ).__next__
        a = [ Scanner ( ).__next__ for _ in range ( n ) ]
        h = { }
        for mask in range ( 1 , ( 1 << n ) ) :
            sum = 0
            for i in range ( n ) :
                if mask & ( 1 << i ) :
                    sum += a [ i ]
                al = h.get ( sum )
                if al is None :
                    al = [ ]
                    h [ sum ] = al
                al.append ( mask )
            for ( mask , al ) in h.items ( ) :
                for i in range ( len ( al ) ) :
                    for j in range ( i + 1 , len ( al ) ) :
                        r1 = al [ i ] | al [ j ]
                        r2 = al [ i ] + al [ j ]
                        if r1 == r2 :
                            mask1 = al [ i ]
                            mask2 = al [ j ]
                            break
            print ( "Case #%d:" % ca )
            if mask1 == - 1 :
                print ( "Impossible" )
            else :
                first = True
                for i in range ( n ) :
                    if mask1 & ( 1 << i ) :
                        continue
                    if first :
                        print ( a [ i ] )
                    else :
                        print ( " " , a [ i ] )
                    first = False
                print ( )
                first = True
                for i in range ( n ) :
                    if mask2 & ( 1 << i ) :
                        continue
                    if first :
                        print ( a [ i ] )
                    else :
                        print ( " " , a [ i ] )
                    first = False
return main ( )
