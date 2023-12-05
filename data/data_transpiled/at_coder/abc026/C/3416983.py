def main ( args ) :
    import sys
    from itertools import product
    from itertools import repeat
    from itertools import chain
    n = len ( sys.stdin.readline ( ) )
    b = range ( 1 , n )
    sc = [ ]
    for i in range ( n - 1 , - 1 , - 1 ) :
        max = sum ( b [ i ] )
        min = sum ( b [ i ] )
        cnt = 0
        for i in range ( n - 1 , - 1 , - 1 ) :
            if i == b [ i ] - 1 :
                max = max ( max , sc [ i ] )
                min = min ( min , sc [ i ] )
                cnt += 1
        if cnt == 1 :
            sc.append ( 2 * max + 1 )
        elif cnt == 0 :
            sc.append ( 1 )
        else :
            sc.append ( max + min + 1 )
    print ( sc )
