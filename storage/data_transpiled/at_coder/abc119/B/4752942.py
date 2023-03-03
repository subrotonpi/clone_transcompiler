def main ( ) :
    import sys
    try :
        with open ( sys.argv [ 1 ] , 'r' ) as f :
            N = len ( f.readlines ( ) )
    except :
        print ( sys.exc_info ( ) [ 0 ] )
        return
    sum = 0
    for i in range ( N ) :
        x = float ( i )
        currency = raw_input ( )
        if currency == 'JPY' :
            sum += x
        elif currency == 'BTC' :
            sum += x * 380000
    print ( sum )
