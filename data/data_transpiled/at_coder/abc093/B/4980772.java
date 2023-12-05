public static int [ ] getSorted ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  Set < Integer > s = new HashSet < > ( ) ;
  if ( k > ( b - a ) ) {
    for ( int i = a ;
    i <= b ;
    i ++ ) {
      System . out . println ( i ) ;
    }
  }
  else {
    for ( int i = 0 ;
    i < Math . min ( k , b - a ) ;
    i ++ ) {
      s . add ( a + i ) ;
      s . add ( b - i ) ;
    }
  }
  List < Integer > arr = new ArrayList < > ( s ) ;
  Arrays . sort ( arr ) ;
  for ( int i : arr ) {
    System . out . println ( i ) ;
  }
  return arr . toArray ( ) ;
}
