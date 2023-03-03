public static void print ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  asArray = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    asArray [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  asArray = new int [ asArray . length ] ;
  System . arraycopy ( asArray , 0 , asArray , 0 , asArray . length ) ;
}
