public static void xa ( double xa , double ya , double xb , double yb , double T , double V ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  boolean flag = false ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    double x = Double . parseDouble ( input . nextLine ( ) ) ;
    double y = Double . parseDouble ( input . nextLine ( ) ) ;
    if ( ( ( ( xb - x ) * ( xb - x ) + ( yb - y ) * ( yb - y ) ) * 0.5 + ( ( x - xa ) * ( xb - x ) + ( y - ya ) * ( yb - y ) ) * 0.5 ) <= ( T * V ) ) {
      flag = true ;
    }
  }
  if ( flag ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
