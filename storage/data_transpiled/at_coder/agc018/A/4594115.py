def main ( ) :
    import sys
    from itertools import repeat
    sc = sys.stdin
    n = sc.randint ( 1 , 10000 )
    k = sc.randint ( 1 , 10000 )
    a = [ ]
    max = 0
    for i in range ( n ) :
        a.append ( sc.randint ( 1 , 10000 ) )
        if max < a [ i ] :
            max = a [ i ]
    if max < k :
        print ( "IMPOSSIBLE" )
        return
    a.sort ( )
    for i in range ( n - 1 ) :
        a [ i + 1 ] = koyaku ( a [ i ] , a [ i + 1 ] )
    if k % a [ n - 1 ] == 0 :
        print ( "POSSIBLE" )
    else :
        print ( "IMPOSSIBLE" )
    def koyaku ( b , a ) :
        while True :
            mod = a % b
            if mod == 0 :
                return b
            a , b = b , mod
    return a
