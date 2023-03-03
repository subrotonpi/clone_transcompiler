@ Sys public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( stdin . readLine ( ) ) ;
  List < Integer > l = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l . add ( ( "1" + stdin . readLine ( ) ) . lastIndexOf ( "1" ) ) ;
  }
  /* First int i */
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( l . get ( i ) <= i + 1 ) {
      return ;
    }
  }
  long s = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    long f = first ( i ) ;
    l . remove ( f ) ;
    s += f ;
  }
  /* Case #*/
  int tno = Integer . parseInt ( stdin . readLine ( ) ) ;
  for ( int i = 0 ;
  i < tno ;
  i ++ ) {
    System . out . println ( "Case #" + ( i + 1 ) + ": " + main ( i ) ) ;
  }
}
