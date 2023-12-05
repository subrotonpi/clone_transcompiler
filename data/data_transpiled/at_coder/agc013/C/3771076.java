public static int [ ] [ ] getNegativeInstances ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int l = Integer . parseInt ( input . readLine ( ) ) ;
  int t = Integer . parseInt ( input . readLine ( ) ) ;
  List < List < Integer >> x = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) x . add ( Collections . singletonList ( input . readLine ( ) ) ) ;
  int [ ] [ ] las = new int [ n ] [ n ] ;
  las [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) las [ i ] [ 0 ] = ( x . get ( i ) . get ( 0 ) + ( x . get ( i ) . get ( 1 ) == 1 ? t : - t ) ) % l ;
  int [ ] han = new int [ n ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( x . get ( i ) . get ( 1 ) != x . get ( 0 ) . get ( 1 ) ) {
      if ( x . get ( 0 ) . get ( 1 ) == 1 ) han [ i ] = x . get ( i ) . get ( 0 ) - x . get ( 0 ) . get ( 0 ) ;
      else han [ i ] = l - x . get ( i ) . get ( 0 ) + x . get ( 0 ) . get ( 0 ) ;
    }
  }
  int su = 0 ;
  t *= 2 ;
  su += ( han . length ) * ( t / l ) ;
  t %= l ;
  for ( int i : han ) if ( t > i ) su ++ ;
  if ( x . get ( 0 ) . get ( 1 ) == 2 ) su = ( - su ) % n ;
  else su %= ( n ) ;
  int ii = las [ 0 ] . length ;
  Arrays . sort ( las ) ;
  int basyo = las . indexOf ( ii ) ;
  for ( int i = basyo + 1 ;
  i < n ;
  i ++ ) if ( las [ basyo ] [ i ] == las [ i ] ) if ( x . get ( 0 ) . get ( 1 ) == 2 ) basyo ++ ;
  break ;
  las [ las . length - 1 ] = las [ i ] ;
  int [ ] [ ] ans = new int [ n ] [ n ] ;
  int z = 0 ;
  for (