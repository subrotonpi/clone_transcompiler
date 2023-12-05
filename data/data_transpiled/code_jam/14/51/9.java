static double compute ( int N , int p , int q , int r , int s ) {
  final int [ ] a = new int [ N ] ;
  int last = 0 ;
  for ( int i : xrange ( N ) ) {
    final int x = ( i * p + q ) % r + s ;
    last += 2 * x ;
    a [ i ] = last ;
  }
  double best = 0.0 ;
  if ( a [ a . length - 1 ] == 0 ) return 0.0 ;
  q = new int [ ] {
    0 , 0 , 0 }
    ;
    for ( int i : xrange ( a . length ) ) {
      final int first = a [ i ] ;
      final int need = first + ( a [ a . length - 1 ] - first ) / 2 ;
      final int pos = Arrays . binarySearch ( a , need ) ;
      final int second = a [ pos ] - first ;
      final int third = a [ pos - 1 ] - first - second ;
      final int m = a [ pos - 1 ] - max ( first , second , third ) ;
      if ( ( double ) m / ( double ) a [ pos ] > best ) {
        q = new int [ ] {
          i , pos }
          ;
          best = ( double ) m / ( double ) a [ pos ] ;
        }
        if ( pos - 1 > i ) {
          final int second = a [ pos - 1 ] - first ;
          final int third = a [ pos - 1 ] - first - second ;
          final int m = a [ pos - 1 ] - max ( first , second , third ) ;
          if ( ( double ) m / ( double ) a [ pos ] > best ) {
            best = ( double ) m / ( double ) a [ pos ] ;
            q = new int [ ] {
              i , pos - 1 }
              ;
            }
          }
        }
        return best ;
      }
      