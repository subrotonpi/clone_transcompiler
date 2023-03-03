def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.__next__ ( )
        C = sc.__next__ ( )
        _ , n_max = 100000 , 100000
        dic = [ ]
        for i in range ( 0 , C + 1 ) :
            dic.append ( list ( ) )
        for i in range ( 1 , N + 1 ) :
            s , t , c = _main ( )
            dic [ c ].append ( ( s , t ) )
        res = [ 0 ] * n_max + 5
        for i in range ( 1 , C + 1 ) :
            if len ( dic [ i ] ) == 0 : continue
            cur = [ ]
            while len ( dic [ i ] ) > 0 : cur.append ( i )
        for i in cur :
            if i > 0 : res [ i ] += 1
    ans = 0
    for i in range ( 1 , n_max + 5 ) :
        ans = max ( ans , res )
    print ( ans )
