def import import min , sys , os , sys , errno , traceback , traceback , buf , traceback , format_exception , format_exception , format_exception , * args , ** kwargs ) :
    from sys import stdin , stdout , stderr
    line = None
    num = rem = 0
    res = 0
    f = stdin.readline ( )
    line = line.strip ( )
    price = line.split ( )
    line = line.strip ( )
    vol = int ( line )
    cost1 = int ( price [ 0 ] ) * 4
    cost2 = int ( price [ 1 ] ) * 2
    cost3 = int ( price [ 2 ] )
    d_cost4 = int ( price [ 3 ] )
    min_price = min ( min ( cost1 , cost2 ) , min ( cost3 , cost3 ) )
    if min_price * 2 <= d_cost4 :
        res = min_price * vol
    else :
        num = vol // 2
        rem = vol % 2
        res = ( d_cost4 * num ) + ( min_price * rem )
    print ( res )
