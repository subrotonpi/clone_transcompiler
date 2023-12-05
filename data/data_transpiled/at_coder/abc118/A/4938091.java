@ Parameters public static List < Integer > parameters ( ) {
  int i = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( i [ 1 ] % i [ 0 ] ) == 0 ) {
    System . out . println ( i [ 0 ] + i [ 1 ] ) ;
  }
  else {
    System . out . println ( i [ 1 ] - i [ 0 ] ) ;
  }
  return Arrays . asList ( i ) ;
}
