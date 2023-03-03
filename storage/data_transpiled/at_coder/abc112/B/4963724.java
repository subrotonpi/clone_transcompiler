public static void main ( String input ) {
  int n = Integer . parseInt ( input ) , t = Integer . parseInt ( input ) ;
  List < Integer > [ ] ct = new List [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ct [ i ] = new List < Integer > ( ) ;
  }
  int num = 1001 ;
  boolean hastle = false ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( t >= ct [ i ] . get ( 1 ) ) {
      if ( num >= ct [ i ] . get ( 0 ) ) {
        num = ct [ i ] . get ( 0 ) ;
      }
      hastle = true ;
    }
  }
  if ( hastle == true ) {
    System . out . println ( num ) ;
  }
  else {
    System . out . println ( "TLE" ) ;
  }
}
