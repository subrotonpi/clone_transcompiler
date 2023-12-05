public static void print ( int c = input ) {
  int x = 0 ;
  int y = 0 ;
  int z = 0 ;
  for ( int i = 0 ;
  i < c ;
  i ++ ) {
    List < Integer > L = Lists . newArrayList ( ) ;
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      L . add ( Integer . parseInt ( input ) ) ;
    }
    Collections . sort ( L ) ;
    x = Math . max ( x , L . get ( 0 ) ) ;
    y = Math . max ( y , L . get ( 1 ) ) ;
    z = Math . max ( z , L . get ( 2 ) ) ;
  }
  System . out . println ( x * y * z ) ;
}
