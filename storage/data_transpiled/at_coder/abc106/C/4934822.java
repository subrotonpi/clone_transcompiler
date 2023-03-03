public static void main ( String [ ] args ) {
  String S = input ( ) ;
  int K = Integer . parseInt ( input ( ) ) ;
  int pos = 1 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    int intValue = Integer . parseInt ( S . substring ( i , i + 1 ) ) ;
    if ( intValue > 1 ) {
      System . out . println ( S . substring ( i , i + 1 ) ) ;
      break ;
    }
    if ( pos == K ) {
      System . out . println ( S . substring ( i , i + 1 ) ) ;
      break ;
    }
    pos ++ ;
  }
  if ( getClass ( ) . equals ( String . class ) ) {
    main ( ) ;
  }
}
