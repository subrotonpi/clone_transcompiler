public static int X = Integer . parseInt ( input ) {
  List < Integer > list = new ArrayList < > ( ) ;
  for ( int i = 1 ;
  i <= 33 ;
  i ++ ) {
    for ( int n = 2 ;
    n <= 11 ;
    n ++ ) {
      if ( i * * n <= X ) {
        list . add ( i * * n ) ;
      }
    }
  }
  System . out . println ( max ( list ) ) ;
  return 0 ;
}
