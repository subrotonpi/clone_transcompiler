@ VisibleForTesting static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > acnt = Lists . newArrayList ( ) ;
  for ( String s : input . split ( " " ) ) {
    acnt . add ( Integer . parseInt ( s ) ) ;
  }
  if ( acnt . size ( ) > 2 ) {
    System . out . println ( "No" ) ;
    exit ( ) ;
  }
  if ( acnt . size ( ) == 1 ) {
    Arrays . sort ( acnt . get ( 1 ) ) ;
    if ( a >= 1 && a <= n / 2 + 1 || a == n - 1 ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
    exit ( ) ;
  }
  if ( acnt . size ( ) == 2 ) {
    Arrays . sort ( acnt . get ( 2 ) ) ;
    if ( a2 - a1 != 1 ) {
      System . out . println ( "No" ) ;
    }
    else {
      if ( 1 <= a2 - n1 <= ( n - n1 ) / 2 ) {
        System . out . println ( "Yes" ) ;
      }
      else {
        System . out . println ( "No" ) ;
      }
    }
  }
}
