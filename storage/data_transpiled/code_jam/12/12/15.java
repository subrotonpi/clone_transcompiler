static final int alphabet ( int n , int [ ] [ ] z ) throws IOException {
  int coins = 0 ;
  int turns = 0 ;
  int [ ] coined = new int [ n ] ;
  while ( coins < 2 * n ) {
    boolean won = false ;
    for ( int i : xrange ( n ) ) {
      if ( z [ i ] [ 1 ] <= coins && coined [ i ] < 2 ) {
        won = true ;
        coins += 2 - coined [ i ] ;
        coined [ i ] = 2 ;
        turns ++ ;
      }
    }
    if ( ! won ) {
      int maxi = - 1 ;
      int maxm = - 1 ;
      for ( int i : xrange ( n ) ) {
        if ( coined [ i ] == 0 && z [ i ] [ 0 ] <= coins && z [ i ] [ 1 ] > maxm ) {
          maxm = z [ i ] [ 1 ] ;
          maxi = i ;
        }
      }
      if ( maxm == - 1 ) {
        return - 1 ;
      }
      else {
        coined [ maxi ] = 1 ;
        coins ++ ;
        turns ++ ;
      }
    }
  }
  if ( __name__ . equals ( "B-large.in" ) ) {
    BufferedReader fn = new BufferedReader ( new FileReader ( "B-large.in" ) ) ;
    int tcase = Integer . parseInt ( fn . readLine ( ) ) ;
    for ( int x = 0 ;
    x < tcase ;
    x ++ ) {
      int a = Integer . parseInt ( fn . readLine ( ) ) ;
      List < Integer > l = new ArrayList < Integer > ( ) ;
      for ( int i : xrange ( a ) ) {
        String [ ] kk = fn . readLine ( ) . split ( " " ) ;
        l . add ( new Integer ( Integer . parseInt ( kk [ 0 ] ) ) ) ;
      }
      int yy = alphabet ( a , l ) ;
      if ( yy == - 1 ) {
        System . out . println ( "Case #" + ( x + 1 ) + ": Too Bad" ) ;
      }
      else {
        System . out . println ( "Case #" + ( x + 1 ) + ": " + yy ) ;
      }
    }
  }
  return turns ;
}
