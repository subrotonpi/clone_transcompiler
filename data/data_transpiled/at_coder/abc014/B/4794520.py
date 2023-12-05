def main ( ) :
    import sys
    sys.stdin.write ( '\n' )
    nx = sys.stdin.read ( )
    price = sys.stdin.read ( )
    sys.stdin.close ( )
    n , x = map ( int , nx.split ( ) )
    prices = price.split ( )
    bitX = bin ( x ).zfill ( 2 )
    to_add_zero = n - len ( bitX )
    for i in range ( to_add_zero ) :
        bitX = '0' * ( n - i ) + bitX
    should_add = [ ]
    for i in range ( n ) :
        bit = bitX [ - 1 - i : - i ]
        should_add.append ( bit == '1' )
    sum_price = 0
    for i in range ( len ( should_add ) ) :
        if should_add [ i ] :
            sum_price += int ( prices [ i ] )
    print ( sum_price )
