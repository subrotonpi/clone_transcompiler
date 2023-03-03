def main ( args ) :
    import sys
    import getopt
    try :
        with open ( args [ 1 ] , 'r' ) as f :
            data = f.read ( )
            input = int ( data )
            cmd = data.split ( ' ' )
    except :
        print ( 'Error: %s' % args [ 1 ] )
        return
    pattern = [ 'AA' , 'AB' , 'AX' , 'AY' , 'BA' , 'BB' , 'BX' , 'BY' , 'XA' , 'XB' , 'XX' , 'XY' , 'YA' , 'YB' , 'YX' , 'YY' ]
    ans = sys.maxsize
    for i in range ( len ( pattern ) ) :
        for j in range ( i + 1 , len ( pattern ) ) :
            dp = [ g + 1 for g in cmd ]
            for t in range ( 1 , len ( dp ) ) :
                for o in range ( 2 ) :
                    if cmd [ t - 1 : o ] == pattern [ i ] :
                        dp [ t ] = min ( dp [ t ] , 1 + ( 0 <= t - 2 and t - 2 < len ( dp ) ) )
                    else :
                        dp [ t ] = min ( dp [ t ] , 1 + ( 0 <= t - 1 and t - 1 < len ( dp ) ) )
            ans = min ( ans , dp [ - 1 ] )
    print ( ans )
