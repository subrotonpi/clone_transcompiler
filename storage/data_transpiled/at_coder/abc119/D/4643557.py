def import _main
INF = 1000000000000L
def main ( ) :
    sc = _main ( )
    a = sc.randint ( 0 , a )
    b = sc.randint ( 0 , b )
    q = sc.randint ( 0 , q )
    s = [ - INF ]
    t = [ - INF ]
    x = [ ]
    s.append ( - INF )
    for i in range ( 1 , a + 1 ) :
        s.append ( sc.randint ( 0 , a + 1 ) )
    s.append ( INF )
    t.append ( - INF )
    for i in range ( 1 , b + 1 ) :
        t.append ( sc.randint ( 0 , b + 1 ) )
    t.append ( INF )
    for i in range ( q ) :
        x.append ( sc.randint ( 0 , q + 1 ) )
    s.sort ( )
    t.sort ( )
    for i in range ( q ) :
        ok , sb , sa = _bin_search ( s , a + 1 , - 1 , x [ i ] )
        ok , tb , ta = _bin_search ( t , b + 1 , - 1 , x [ i ] )
        res1 = _main ( s , res , res3 , res4 , res5 , res6 , res7 )
        res2 = _main ( s , res , res4 , res7 , res8 , res5 , res6 , res7 )
        ans = _main ( s , res , res5 , res6 , res7 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 , res8 ,