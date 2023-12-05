public static double solve ( Scanner K , String [ ] L , int S ) {
  for ( String l : L ) {
    if ( K . countChar ( l ) == 0 ) {
      return 0. ;
    }
  }
  for ( int i = 1 ;
  i <= L . length ;
  i ++ ) {
    if ( L . regionMatches ( i , L , 0 , L . length ( ) - i ) ) {
      d = i ;
      break ;
    }
  }
  double m = 1 + ( S - L . length ) / d ;
  double p = 1. ;
  for ( String l : L ) {
    p *= ( double ) K . countChar ( l ) / K . length ( ) ;
  }
  return m - p * ( S - L . length ( ) + 1 ) ;
  for ( int t = 0 ;
  t < input . nextInt ( ) ;
  t ++ ) {
    final int len = Integer . parseInt ( input . nextLine ( ) ) ;
    K = input . nextLine ( ) ;
    L = input . nextLine ( ) ;
    System . out . println ( "Case #" + ( t + 1 ) + ": " + solve ( K , L , S ) ) ;
  }
  return 0. ;
}
