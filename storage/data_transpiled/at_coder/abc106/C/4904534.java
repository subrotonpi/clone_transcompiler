static final int solve ( ) {
  String s = input ( ) ;
  int k = Integer . parseInt ( input ( ) ) ;
  for ( int i = 0 ;
  i < k - 1 ;
  i ++ ) {
    if ( Integer . parseInt ( s . substring ( i , i + 1 ) ) != 1 ) {
      System . out . println ( Integer . parseInt ( s . substring ( i , i + 1 ) ) ) ;
      System . exit ( 0 ) ;
    }
  }
  System . out . println ( s . substring ( k - 1 ) ) ;
}
