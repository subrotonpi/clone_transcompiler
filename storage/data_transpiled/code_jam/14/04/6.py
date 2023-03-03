def main ( ) :
    import sys
    import random
    input = sys.stdin
    T = input.count ( )
    for t in range ( T ) :
        print ( "Case #%d: " % ( t + 1 ) , end = "" )
        n = input.count ( )
        as , bs = [ random.random ( ) for i in range ( n ) ]
        second = [ ]
        for i in range ( n ) :
            as.append ( input.choice ( [ "a" , "b" ] ) )
        for i in range ( n ) :
            bs.append ( input.choice ( [ "b" , "c" ] ) )
        for d in bs :
            second.append ( d )
        as.sort ( )
        bs.sort ( )
        res1 , res2 = 0 , 0
        for i in range ( n ) :
            cur = second.ceiling ( as [ i ] )
            if cur is None :
                res2 += 1
                second.remove ( second [ 0 ] )
            else :
                second.remove ( cur )
        res1 = 0
        for elim in range ( n ) :
            count = 0
            for i in range ( elim , n ) :
                if as [ i ] > bs [ i - elim ] :
                    count += 1
            res1 = max ( res1 , count )
        print ( res1 , res2 )
