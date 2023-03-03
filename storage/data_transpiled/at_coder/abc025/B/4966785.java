public static void main ( int n , int a , int b ) {
  int total = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String s = input . nextLine ( ) ;
    String d = input . nextLine ( ) ;
    int d = Integer . parseInt ( d ) ;
    if ( s . equals ( "East" ) ) s = - 1 ;
    else s = 1 ;
    int m ;
    if ( d < a ) m = a ;
    else if ( d >= a && d <= b ) m = d ;
    else m = b ;
    total += m * s ;
  }
  if ( total < 0 ) System . out . println ( "East" + abs ( total ) ) ;
  else if ( total > 0 ) System . out . println ( "West" + abs ( total ) ) ;
  else {
    total == 0 ;
    System . out . println ( 0 ) ;
  }
}
