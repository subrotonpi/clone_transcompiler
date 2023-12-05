def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.number
        x = sc.number
        if x == 1 :
            print ( n - 2 )
            sys.exit ( 0 )
        map = [ [ ] for i in range ( 0 , n + 1 ) ]
        for a , b in map :
            map [ a ].append ( b )
            map [ b ].append ( a )
        ans = 0
        for i in range ( 1 , n + 1 ) :
            first , second = 1 , 0
            for w in map [ i ] :
                cur = dfs ( w , i , x // 2 - 1 )
                first += cur [ 0 ]
                second = max ( second , cur [ 1 ] )
            if x % 2 == 1 :
                first += second
            ans = max ( ans , first )
        print ( n - ans )
