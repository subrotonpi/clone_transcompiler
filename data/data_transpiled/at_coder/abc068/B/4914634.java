public static int n ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( n > 63 ) {
    System . out . println ( 64 ) ;
  }
  else if ( n > 31 ) {
    System . out . println ( 32 ) ;
  }
  else if ( n > 15 ) {
    System . out . println ( 16 ) ;
  }
  else if ( n > 7 ) {
    System . out . println ( 8 ) ;
  }
  else if ( n > 3 ) {
    System . out . println ( 4 ) ;
  }
  else if ( n > 1 ) {
    System . out . println ( 2 ) ;
  }
  else {
    System . out . println ( 1 ) ;
  }
  return n ;
}
