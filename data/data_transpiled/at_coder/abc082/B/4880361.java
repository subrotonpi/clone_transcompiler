public static void sort ( List < Integer > list ) {
  int n = sorted ( list . stream ( ) . filter ( i -> i > n ) . count ( ) ) ;
  int m = sorted ( list . stream ( ) . filter ( i -> i > m ) . count ( ) ) ;
  m = m > 0 ? m : n ;
  if ( m > n ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
