static public final void solve ( int N , int M ) {
  int ret = 0 ;
  int i = 1 ;
  while ( i * i <= M ) {
    if ( M % i == 0 ) {
      if ( i >= N ) {
        ret = Math . max ( ret , M / i ) ;
      }
      if ( M / i >= N ) {
        ret = Math . max ( ret , i ) ;
      }
    }
    i ++ ;
  }
  System . out . println ( ret ) ;
  return ;
  /* Iterate through the lines and print them */
  Scanner scanner = new Scanner ( System . in ) ;
  while ( scanner . hasNext ( ) ) {
    String line = scanner . next ( ) ;
    for ( String word : line . split ( " " ) ) {
      scanner . next ( ) ;
    }
  }
  scanner . close ( ) ;
  scanner . close ( ) ;
  scanner . close ( ) ;
}
