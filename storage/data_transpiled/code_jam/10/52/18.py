def gcj ( ) :
    import sys
    import os
    import sys
    import os
    import sys
    import os
    import sys
    class C ( ) :
        b = [ [ False ] * 105 for i in range ( 1 , 100 ) ]
        reduce = lambda x , y : x == y
        flag = False
        a = [ [ False ] * 105 for i in range ( 1 , 100 ) ]
        for i in range ( 1 , 100 ) :
            for j in range ( 1 , 100 ) :
                if b [ i ] [ j - 1 ] == False and b [ i - 1 ] [ j ] == False : a [ i ] [ j ] = False
                elif b [ i ] [ j - 1 ] == True and b [ i - 1 ] [ j ] == True : a [ i ] [ j ] = True
                else : a [ i ] [ j ] = b [ i ] [ j ]
                if b [ i ] [ j ] : flag = True
        for i in range ( 1 , 100 ) :
            for j in range ( 1 , 100 ) : b [ i ] [ j ] = a [ i ] [ j ]
            if flag : return True
        return False
    def solve ( ) :
        cin = sys.stdin
        sys.stdout = open ( "Cs.txt" , "w" )
        T = cin.read ( )
        for cas in range ( 1 , T ) :
            r = cin.read ( )
            for i in range ( 105 ) :
                for j in range ( 105 ) : b [ i ] [ j ] = False
                for x1 , y1 , x2 , y2 in zip ( r , x1 , y1 , x2 , y2 ) :
                    for x in range ( x1 , x2 , y2 ) : b [ y ] [ x ] = True
            t = 0
            while reduce ( ) : t += 1
            print ( "Case #%d: %d" % ( cas , t ) )
