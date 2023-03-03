def _import ( ) :
    from itertools import count , groupby
    from itertools import count
    from itertools import count
    from itertools import count
    n = len ( sys.stdin.readline ( ) )
    a = [ ]
    for i in range ( n ) :
        a.append ( sc.randint ( 1 , n ) )
    cnt = 0
    for count in [ count for _ in groupby ( a ).values ( ) ] :
        cnt += ( count - 1 )
    cnt += ( cnt % 2 )
    print ( n - cnt )
