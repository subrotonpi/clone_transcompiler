@ VisibleForTesting static int [ ] [ ] solve ( String w , String S , int N , int i , int j ) {
  if ( w . length ( ) > N - i ) return false ;
  int cnt = 0 ;
  int k = j - 5 ;
  for ( int n : xrange ( w . length ( ) ) ) {
    if ( w . charAt ( n ) != S . charAt ( i + n ) ) {
      if ( k + 5 > n ) return false ;
      else {
        k = n ;
        cnt ++ ;
      }
    }
  }
  if ( k + 5 <= w . length ( ) ) return 0 ;
  int result [ ] [ ] = new int [ k ] [ ] ;
  {
    int t = Integer . parseInt ( IN . readLine ( ) . trim ( ) ) ;
    for ( int i : xrange ( N - 1 , - 1 ) ) {
      for ( int j : xrange ( 5 ) ) {
        do ( S , N , A , i , j ) ;
      }
    }
    int [ ] [ ] D = new int [ k ] [ ] ;
    {
      {
      }
    }
  }
  {
    int [ ] [ ] DD = new int [ 6 ] [ ] ;
    for ( int i : xrange ( 6 ) ) {
      int c = 0 ;
      long st = System . currentTimeMillis ( ) ;
      Scanner scanner = new Scanner ( System . in ) ;
      while ( scanner . hasNextLine ( ) ) {
        String l = scanner . nextLine ( ) ;
        String w = l . trim ( ) ;
        c ++ ;
        D [ c ++ ] = w ;
        for ( int j : xrange ( 5 ) ) {
          String wp = w . substring ( 0 , j ) + w . substring ( j + 1 , j + 5 ) ;
          DD [ i ] [ wp ] = c ;
        }
        DD [ 5 ] [ w . length ( ) ] = c ;
      }
    }
    {
      String key = S . substring ( i , i + j ) + S . substring ( i + j + 1 , i + j + 5 ) ;
      for ( int j : xrange ( key . length ( ) + 1 ) ) {
        System . arraycopy ( DD [ j ] [ key . length ( ) ] , 0 , D [ j ] [ key . length ( ) ] , 0 , k ) ;
      }
      for ( int k : xrange ( 5 ) ) {
        System . arraycopy ( DD [ 5 ] [ key . length ( ) ] , 0 , D [ k ] [ key . length ( ) ] , 0 , k ) ;
      }
    }
  }
  