def main ( ) :
    _sys.stdin.write ( "\n" )
    n , k = s.read ( ) , s.read ( )
    print ( _sum ( [ s.read ( ) * min ( min ( min ( i + 1 , n - i ) , k ) , n - k + 1 ) for i in range ( n ) ] ) )
