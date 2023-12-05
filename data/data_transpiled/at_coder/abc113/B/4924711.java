public static int candidate = Integer . parseInt ( input ) {
  double aveTemp = Double . parseDouble ( input . nextLine ( ) ) ;
  double idesTemp = Double . parseDouble ( input . nextLine ( ) ) ;
  double [ ] lsCandidate = new double [ input . nextInt ( ) ] ;
  for ( int x = 0 ;
  x < lsCandidate . length ;
  x ++ ) {
    lsCandidate [ x ] = Math . abs ( ( aveTemp - ( Double . parseDouble ( input . nextLine ( ) ) * 0.006 ) - idesTemp ) ) ;
  }
  for ( int x = 0 , i = 0 ;
  x < lsCandidate . length ;
  x ++ ) {
    if ( lsCandidate [ x ] == Math . min ( lsCandidate [ i ] , Math . min ( lsCandidate [ i ] , Math . max ( lsCandidate [ i ] , 0 ) ) ) ) {
      System . out . println ( x + 1 ) ;
      break ;
    }
  }
  return 0 ;
}
