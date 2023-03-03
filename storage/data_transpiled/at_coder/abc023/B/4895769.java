public static void print ( String s ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  s = input . nextLine ( ) ;
  if ( n % 2 == 0 ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  int m = ( n - 1 ) / 2 ;
  String t = "b" ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    if ( i % 3 == 0 ) {
      t = "a" + t + "c" ;
    }
    else if ( i % 3 == 1 ) {
      t = "c" + t + "a" ;
    }
    else {
      t = "b" + t + "b" ;
    }
  }
  if ( s . equals ( t ) ) {
    System . out . println ( m ) ;
  }
  else {
    System . out . println ( - 1 ) ;
  }
}
