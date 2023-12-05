public static int N = Integer . parseInt ( input ) {
  int [ ] A = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] cummax = new int [ A . length ] ;
  for ( int i = A . length - 1 ;
  i >= 0 ;
  i -- ) {
    cummax [ i ] = Math . max ( cummax [ i ] , A [ i ] ) ;
  }
  Collections . reverse ( cummax ) ;
  int maxgain = 0 ;
  int n = 0 ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    int buy = A [ i ] ;
    int sell = cummax [ i ] ;
    int gain = sell - buy ;
    if ( gain > maxgain ) {
      maxgain = gain ;
      n = 1 ;
    }
    else if ( gain == maxgain ) {
      n ++ ;
    }
  }
  System . out . println ( n ) ;
  return n ;
}
