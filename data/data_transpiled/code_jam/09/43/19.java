public static final int [ ] [ ] getMatrix ( ) throws IOException {
  BufferedReader bufferedReader = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int T = Integer . parseInt ( bufferedReader . readLine ( ) ) ;
  {
    int i ;
    for ( i = 0 ;
    i < k - 1 ;
    i ++ ) {
      int u0 = line1 . charAt ( i ) ;
      int u1 = line1 . charAt ( i + 1 ) ;
      int v0 = line2 . charAt ( i ) ;
      int v1 = line2 . charAt ( i + 1 ) ;
      if ( ( ( u0 < v0 ) != ( u1 < v1 ) ) || ( u0 == v0 ) || ( u1 == v1 ) ) {
        return true ;
      }
      break ;
    }
    return false ;
  }
  int currentMinimum = 0 ;
  {
    int clusters ;
    int currentClusters = 0 ;
    int currentMinCount = 0 ;
    int currentMinCount = 0 ;
    for ( i = 0 ;
    i < N ;
    i ++ ) {
      if ( i == N ) {
        if ( currentMinimum == 0 || currentMinCount < currentMinCount ) {
          currentMinimum = currentMinCount ;
          break ;
        }
        return currentMinCount ;
      }
      if ( currentMinimum != 0 && currentMinCount >= currentMinCount ) {
        return currentMinCount ;
      }
      int line = matrix [ i ] [ pos ] ;
      clusters = 0 ;
      for ( int c = 0 ;
      c < currentMinCount + 1 ;
      c ++ ) {
        boolean crossed = false ;
        for ( int i = 0 ;
        i < pos ;
        i ++ ) {
          int cl = assigned [ i ] ;
          if ( cl == c && line != null ) {
            crossed = true ;
            break ;
          }
        }
        if ( ! crossed ) {
          assigned [ pos ] = c ;
          clusters = countMinimumCount ( n , pos + 1 , matrix , currentMinCount , assigned ) ;
          if ( minimumCount == 0 || clusters < minimumCount ) {
            minimumCount = clusters ;
            break ;
          }
        }
      }
      if ( pos > 0 ) {
        assigned [ pos ] = currentMinCount + 1 ;
        clusters = countMinimumCount ( n , pos + 1 , matrix , currentMinCount + 1 , assigned ) ;
        if ( minimumCount == 0 || clusters < minimumCount ) {
          minimumCount = clusters ;
          break ;
        }
      }
    }
    return minimumCount ;
  }
}
