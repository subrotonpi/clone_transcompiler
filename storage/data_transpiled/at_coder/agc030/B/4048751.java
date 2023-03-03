public static boolean isEven ( int num ) {
  return num % 2 == 0 ;
  /* goback M = M */
  int [ ] x = new int [ N ] ;
  int [ ] Sx = new int [ N ] ;
  int k = M / 2 ;
  if ( M == 0 ) {
    return L - x [ 0 ] ;
  }
  else if ( M == 1 ) {
    return 2 * ( L - x [ 1 ] ) + x [ 0 ] ;
  }
  else if ( isEven ( M ) ) {
    return 2 * Sx [ k - 1 ] - 2 * ( Sx [ M ] - Sx [ M - k ] ) - x [ M - k ] + L * ( 2 * k + 1 ) ;
  }
  else {
    return 2 * Sx [ k - 1 ] + x [ k ] - 2 * ( Sx [ M ] - Sx [ M - k - 1 ] ) + L * 2 * ( k + 1 ) ;
  }
  L = ( Integer ) input . nextInt ( ) ;
  N = ( Integer ) input . nextInt ( ) ;
  int ans = 0 ;
  int [ ] pl = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) pl [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] sumpl = new int [ N ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) sumpl [ i ] = pl [ i - 1 ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) sumrevpl [ i ] = sumpl [ i - 1 ] + pl [ i ] ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) ans = Math . max ( ans , goback ( i , pl , sumpl ) ) ;
  int [ ] revpl = new int [ N ] ;
  for ( int i = pl . length - 1 ;
  i >= 0 ;
  i -- ) revpl [ i ] = L - p ;
  int [ ] sumrevpl = new int [ N ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) sumrevpl [ i ] = sumrevpl [ i - 1 ] + revpl [ i ] ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) ans = Math . max ( ans , goback ( i , revpl , sum @ @