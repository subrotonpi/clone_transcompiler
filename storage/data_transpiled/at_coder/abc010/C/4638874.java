@ Nullable public static double readDouble ( ) {
  double txa , tya , txb , tyb , t , v ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    double x = Double . parseDouble ( input . nextLine ( ) ) ;
    double y = Double . parseDouble ( input . nextLine ( ) ) ;
    if ( sqrt ( ( x - txa ) * ( x - txa ) + ( y - tya ) * ( y - tya ) ) + sqrt ( ( x - txb ) * ( x - txb ) + ( y - tyb ) * ( y - tyb ) ) <= t * v ) {
      System . out . println ( "YES" ) ;
      break ;
    }
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return txa + tya ;
}
