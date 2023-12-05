def main ( args ) :
    import string
    import sys
    import random
    class x ( object ) :
        def __init__ ( self ) :
            self.x = x
    t = random.randint ( 1 , t )
    for tt in range ( 1 , t + 1 ) :
        n = random.randint ( 1 , t )
        s = [ [ x.choice ( s ) for s in range ( n ) ] for s in range ( n ) ]
        l = [ ]
        for i in range ( n ) :
            for j in range ( n - 1 , - 1 , - 1 ) :
                l.append ( j )
                if s [ i ] [ j ] == '1' :
                    break
        ans = 0
        for i in range ( n ) :
            k = - 1
            for j in range ( i , n ) :
                if l [ j ] <= i :
                    k = j
                    break
                ans += k - i
                for j in range ( k , i , - 1 ) :
                    l [ j ] = l [ j - 1 ]
            print ( "Case #%d: %d" % ( tt , ans ) )
