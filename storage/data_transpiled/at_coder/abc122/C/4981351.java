public static void main ( String [ ] args ) {
  if ( __name__ . equals ( "main" ) ) {
    int length = Integer . parseInt ( input . nextLine ( ) ) ;
    int questionCount = Integer . parseInt ( input . nextLine ( ) ) ;
    String string = input . nextLine ( ) ;
    int [ ] acSums = new int [ length ] ;
    acSums [ 0 ] = 0 ;
    for ( int i = 1 ;
    i <= string . length ( ) ;
    i ++ ) {
      if ( i > 1 && string . charAt ( i - 2 ) == 'A' && string . charAt ( i - 1 ) == 'C' ) {
        acSums [ i ] = acSums [ i - 1 ] + 1 ;
      }
      else {
        acSums [ i ] = acSums [ i - 1 ] ;
      }
    }
    for ( int i = 0 ;
    i < questionCount ;
    i ++ ) {
      int l = Integer . parseInt ( input . nextLine ( ) ) ;
      int r = Integer . parseInt ( input . nextLine ( ) ) ;
      int ans = acSums [ r ] - acSums [ l - 1 ] ;
      if ( l > 1 && string . charAt ( l - 1 ) == 'C' && string . charAt ( l - 2 ) == 'A' ) ans -- ;
      System . out . println ( ans ) ;
    }
  }
}
