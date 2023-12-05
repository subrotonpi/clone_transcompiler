def main ( ) :
    import sys
    class c ( object ) :
        def __init__ ( self ) :
            self.stdin = sys.stdin
            self.num_cases = len ( sys.stdin )
    for loop in range ( 1 , num_cases + 1 ) :
        max = sys.stdin.readline ( ).strip ( )
        n = sys.stdin.readline ( ).strip ( )
        value = sys.stdin.readline ( ).strip ( )
        tmp = [ ]
        for i in range ( n ) :
            tmp.append ( stdin.readline ( ).strip ( ) )
        denom = [ ]
        for i in range ( n ) :
            for j in range ( max ) :
                denom.append ( tmp [ i ] )
        denom.sort ( )
        cnt = 0
        sum = 0
        index = 0
        while index < len ( denom ) and sum < value :
            if sum + 1 < denom [ index ] :
                cnt += 1
                added = ( sum + 1 ) * max
                sum += added
            else :
                sum += denom [ index ]
                index += 1
        while sum < value :
            cnt += 1
            added = ( sum + 1 ) * max
            sum += added
        print ( "Case #%d: %d" % ( loop , cnt ) )
