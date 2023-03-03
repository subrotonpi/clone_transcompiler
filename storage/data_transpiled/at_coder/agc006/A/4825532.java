public static void print ( int n ) {
  String s = input . nextLine ( ) ;
  String t = input . nextLine ( ) ;
  if ( s . equals ( t ) ) {
    System . out . println ( n ) ;
    exit ( ) ;
  }
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( s . substring ( s . length ( ) - i ) . equals ( t . substring ( 0 , i ) ) ) {
      System . out . println ( n * 2 - i ) ;
      exit ( ) ;
    }
  }
  else {
    System . out . println ( n * 2 ) ;
  }
}
