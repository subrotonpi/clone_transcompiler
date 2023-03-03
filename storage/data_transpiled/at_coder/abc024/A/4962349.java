public static int a = Integer . parseInt ( input ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  int u = ( int ) ( s + t ) ;
  if ( u >= k ) {
    System . out . println ( ( int ) ( a * s + b * t - u * c ) ) ;
  }
  else {
    System . out . println ( ( int ) ( a * s + b * t ) ) ;
  }
  return u ;
}
