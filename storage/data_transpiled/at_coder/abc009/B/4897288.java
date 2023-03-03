public static void print ( int n ) {
  int tmp ;
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  ls = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    tmp = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( ! ls . contains ( tmp ) ) ls . add ( tmp ) ;
  }
  ls . sort ( ) ;
  ls . remove ( ls . size ( ) - 1 ) ;
  System . out . println ( max ( ls ) ) ;
}
