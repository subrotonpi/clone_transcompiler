public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int ans1 = 0 , ans2 = 0 ;
  int sumV = 0 ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    sumV += a [ i ] ;
    if ( i % 2 == 0 ) {
      if ( sumV >= 0 ) {
        ans1 += Math . abs ( sumV ) + 1 ;
        sumV = - 1 ;
      }
    }
    else {
      if ( sumV <= 0 ) {
        ans1 += Math . abs ( sumV ) + 1 ;
        sumV = 1 ;
      }
    }
  }
  System . out . println ( Math . min ( ans1 , ans2 ) ) ;
}
