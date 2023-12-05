def import os , sys , stdin , stdout , stderr , line , flags , verbose , filename , count , line , text , ** kwargs ) :
    bfr = stdin.readline ( )
    data = ""
    data = bfr.rstrip ( )
    stk = data.split ( )
    meisi , nisuu , hoju_min , hmi = map ( int , stk [ 0 ] )
    heru = 0
    kubari = True
    for i in range ( nisuu ) :
        data = bfr.rstrip ( )
        if meisi <= hoju_min :
            meisi += hmi
        heru = int ( data )
        meisi -= heru
        if meisi < 0 :
            print ( i + 1 )
            kubari = False
            sys.exit ( 0 )
    if kubari == True :
        print ( "complete" )
