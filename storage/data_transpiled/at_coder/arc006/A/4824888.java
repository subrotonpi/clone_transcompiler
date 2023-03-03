public static int [ ] getDigits ( ) {
  String s = input . nextLine ( ) ;
  String t = input . nextLine ( ) ;
  String r = input . nextLine ( ) ;
  if ( s . equals ( r ) ) {
    System . out . println ( 1 ) ;
  }
  else if ( Sets . newHashSet ( s + Arrays . asList ( t ) ) . containsAll ( Sets . newHashSet ( r ) ) ) {
    System . out . println ( 2 ) ;
  }
  else {
    int f = 8 - Sets . newHashSet ( s ) . containsAll ( Sets . newHashSet ( r ) ) ;
    if ( f < 6 ) {
      System . out . println ( f ) ;
    }
    else {
      System . out . println ( 0 ) ;
    }
  }
  return s . length ( ) ;
}
