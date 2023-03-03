def main ( ) :
    $ = _raw_input
    n , a , b = [ 0 ] * 1000002 , [ 0 ] * 1000002
    while n :
        a [ s.index ( n ) ] += 1
        a [ s.index ( n ) + 1 ] -= 1
    _parallel_prefix ( a , sum )
    for j in a :
        b = max ( b , j )
    print ( b )
