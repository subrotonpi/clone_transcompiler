def main ( * args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            rain = [ [ False ] * ( 25 * 12 ) ]
            a = sc.count ( )
            time = [ [ False ] * ( 25 * 5 ) ]
            data = [ ]
            for i in range ( a ) :
                data = sc.readline ( ).split ( '-' , 1 )
                time [ i ] [ 0 ] = int ( data [ 0 ] )
                if time [ i ] [ 0 ] % 5 != 0 :
                    time [ i ] [ 0 ] -= time [ i ] [ 0 ] % 5
                time [ i ] [ 1 ] = int ( data [ 1 ] )
                if time [ i ] [ 1 ] % 5 != 0 :
                    time [ i ] [ 1 ] += 5 - time [ i ] [ 1 ] % 5
                    if time [ i ] [ 1 ] % 100 == 60 :
                        time [ i ] [ 1 ] += 40
        for count in range ( a ) :
            for x in range ( 0 , 24 ) :
                for y in range ( 12 ) :
                    if rain [ x ] [ y ] == True :
                        continue
                    elif time [ count ] [ 0 ] <= x * 100 + y * 5 and time [ count ] [ 1 ] > x * 100 + y * 5 :
                        rain [ x ] [ y ] = True
    flag = False
    for x in range ( 25 ) :
        for y in range ( 12 ) :
            if not flag and rain [ x ] [ y ] :
                if x == 0 :
                    print ( '00' )
                elif x < 10 :
                    print ( '0' + x )
                else :
                    print ( x )
                if y == 0 :
                    print ( '00' )
                elif y == 1 :
                    print ( '05' )
                else :
                    print ( y * 5 )
            else :
                print ( y * 5 )
