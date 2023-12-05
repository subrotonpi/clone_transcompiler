public static int [ ] getSorted ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  Set < Integer > ans = new HashSet < > ( ) ;
  for ( int i = 0 ;
  i < Math . min ( b - a + 1 , k ) ;
  i ++ ) {
    ans . add ( a + i ) ;
  }
  for ( int i = 0 ;
  i < Math . min ( b - a + 1 , k ) ;
  i ++ ) {
    ans . add ( b - i ) ;
  }
  List < Integer > sorted = new ArrayList < > ( ans ) ;
  Collections . sort ( sorted ) ;
  for ( Integer i : sorted ) {
    System . out . println ( i ) ;
  }
  return sorted . toArray ( new Integer [ 0 ] ) ;
}
