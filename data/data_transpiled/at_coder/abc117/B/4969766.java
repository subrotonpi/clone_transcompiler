public static int k = Integer . parseInt ( input ) {
  int a = 0 ;
  List < Integer > list = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    list . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  List < Integer > sorted = new ArrayList < Integer > ( list ) ;
  Collections . sort ( sorted ) ;
  for ( int num = 0 ;
  num < sorted . size ( ) - 1 ;
  num ++ ) {
    a += sorted . get ( num ) ;
  }
  if ( sorted . get ( sorted . size ( ) - 1 ) < a ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return a ;
}
