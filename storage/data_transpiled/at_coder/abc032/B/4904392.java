public static void input ( ) {
  int k = Integer . parseInt ( input ( ) ) ;
  if ( s . length ( ) < k ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  List < Integer > res = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) res . add ( s . get ( i ) ) ;
  System . out . println ( new HashSet < Integer > ( res ) . size ( ) ) ;
}
