public static void print ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = input . nextInt ( ) ;
  m = Integer . parseInt ( input . nextLine ( ) ) ;
  b = new int [ m ] ;
  @ SuppressWarnings ( "unchecked" ) Map < Integer , Integer > c = a ;
  @ SuppressWarnings ( "unchecked" ) Map < Integer , Integer > d = b ;
  int max = 0 ;
  for ( Map . Entry < Integer , Integer > entry : c . entrySet ( ) ) {
    if ( entry . getValue ( ) - d . get ( entry . getKey ( ) ) > max ) max = entry . getValue ( ) - d . get ( entry . getKey ( ) ) ;
  }
  System . out . println ( max ) ;
}
