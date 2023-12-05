public static void main ( String [ ] args ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a [ 0 ] != a [ 1 ] && a [ 0 ] != a [ 2 ] && a [ 1 ] != a [ 2 ] ) {
    System . out . println ( 3 ) ;
  }
  else if ( a [ 0 ] == a [ 1 ] && a [ 0 ] != a [ 2 ] ) {
    System . out . println ( 2 ) ;
  }
  else if ( a [ 0 ] != a [ 1 ] && a [ 0 ] == a [ 2 ] ) {
    System . out . println ( 2 ) ;
  }
  else if ( a [ 0 ] != a [ 1 ] && a [ 1 ] == a [ 2 ] ) {
    System . out . println ( 2 ) ;
  }
  else if ( a [ 0 ] == a [ 1 ] && a [ 2 ] == a [ 2 ] ) {
    System . out . println ( 1 ) ;
  }
}
