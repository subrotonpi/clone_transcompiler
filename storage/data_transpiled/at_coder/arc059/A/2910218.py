def main ( ) :
    import sys
    for line in sys.stdin :
        n = int ( line )
        t = [ ]
        min = int ( sys.maxint )
        max = int ( sys.maxint )
        for i in range ( n ) :
            t.append ( line )
            min = min ( min , t [ i ] )
            max = max ( max , t [ i ] )
        ans = int ( sys.maxint )
        for i in range ( min , max + 1 ) :
            sum = 0
            for j in range ( n ) :
                diff = t [ j ] - i
                sum += diff ** 2
            ans = min ( ans , sum )
        print ( ans )
