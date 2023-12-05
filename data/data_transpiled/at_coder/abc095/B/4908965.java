public static int [ ] getN ( int N , int X ) {
  int [ ] Z = new int [ N ] ;
  int ALL = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int Y = Integer . parseInt ( input . nextLine ( ) ) ;
    ALL += Y ;
    Z [ i ] = Y ;
  }
  int ANS = ( X - ALL ) / ( Math . min ( Z . length , N ) ) ;
  if ( ANS == 0 ) {
    System . out . println ( Z . length ) ;
  }
  else {
    System . out . println ( ANS + Z . length ) ;
  }
  return Z ;
}
