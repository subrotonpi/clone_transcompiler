public static int K = Integer . parseInt ( input ) {
  List < Integer > As = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) As . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  Collections . reverse ( As ) ;
  boolean fail = false ;
  if ( As . get ( 0 ) != 2 ) {
    fail = true ;
  }
  else {
    int mn = 2 ;
    int mx = 3 ;
    for ( int a = 1 ;
    a < As . size ( ) ;
    a ++ ) {
      if ( mn % a != 0 ) mn = ( mn / a ) * a + a ;
      if ( mx % a != 0 ) mx = ( mx / a ) * a ;
      if ( mn > mx ) {
        fail = true ;
        break ;
      }
      mx = mx + ( a - 1 ) ;
    }
  }
  if ( fail ) System . out . println ( - 1 ) ;
  else System . out . println ( mn + " " + mx ) ;
  return mn ;
}
