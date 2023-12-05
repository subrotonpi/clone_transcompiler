public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > alist = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) alist . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int suma = Arrays . stream ( alist . toArray ( ) ) . sum ( ) ;
  if ( suma % ( n * ( n + 1 ) / 2 ) != 0 ) {
    System . out . println ( "NO" ) ;
  }
  else {
    int k = suma / ( n * ( n + 1 ) / 2 ) ;
    int [ ] da = new int [ k ] ;
    for ( int i = 1 ;
    i < k ;
    i ++ ) {
      int preva = alist . get ( i ) ;
      int a = alist . get ( i ) ;
      da [ i ] = a - preva - k ;
    }
    da [ k ] = alist . get ( 0 ) - alist . get ( alist . size ( ) - 1 ) - k ;
    int nk = 0 ;
    boolean isA = true ;
    for ( int _da : da ) {
      if ( Math . abs ( _da ) % n != 0 ) {
        isA = false ;
        break ;
      }
      nk += Math . abs ( _da ) / n ;
    }
    if ( ! isA ) {
      System . out . println ( "NO" ) ;
    }
    else {
      if ( nk != k ) {
        System . out . println ( "NO" ) ;
      }
      else {
        System . out . println ( "YES" ) ;
      }
    }
  }
}
