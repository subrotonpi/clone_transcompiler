public static int n = Integer . parseInt ( input ) {
  int z = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > alist = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    alist . add ( i ) ;
  }
  if ( n == 1 ) {
    System . out . println ( Math . abs ( alist . get ( 0 ) - w ) ) ;
  }
  else {
    System . out . println ( Math . max ( Math . abs ( alist . get ( alist . size ( ) - 1 ) - w ) , Math . abs ( alist . get ( alist . size ( ) - 1 ) - alist . get ( alist . size ( ) - 2 ) ) ) ) ;
  }
  return z ;
}
