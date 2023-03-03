def Main ( ) :
    r , c , k , n = map ( int , range ( 1 , n ) )
    ra , ca , r_sum , c_sum = [ 0 ] * n , [ 0 ] * n , [ 0 ] * n , [ 0 ] * n
    rb , cb = [ 0 ] * n , [ 0 ] * n
    for i in r_sum :
        rb [ i ] += 1
        cb [ i ] += 1
    print ( _sum ( rb [ : k ] * cb [ k - i ] ) + _sum ( r_sum [ ra [ i ] ] + c_sum [ ca [ i ] ] - k ) , ( - 1 if i == 0 else 1 ) )
