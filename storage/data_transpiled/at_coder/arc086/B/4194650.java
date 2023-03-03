public static void print ( int N ) {
  int [ ] A = Integer . parseInt ( input ( ) ) ;
  List < Integer > B = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    B . add ( ( Math . abs ( A [ i ] ) ) ) ;
  }
  Collections . sort ( B , null , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return ( o1 == o2 ) ? 0 : ( o1 == o2 ) ? - 1 : 1 ;
    }
  }
  ) ;
  final int s = B . get ( 0 ) ;
  int ans = 0 ;
  final String [ ] ANS = new String [ N ] ;
  if ( A [ s ] == 0 ) {
  }
  else {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( i == s ) {
        continue ;
      }
      ANS [ i ] = String . valueOf ( s + 1 ) + " " + String . valueOf ( i + 1 ) ;
      ans ++ ;
    }
    if ( A [ s ] > 0 ) {
      for ( int i = 0 ;
      i < N - 1 ;
      i ++ ) {
        ANS [ i ] = String . valueOf ( i + 1 ) + " " + String . valueOf ( i + 2 ) ;
        ans ++ ;
      }
    }
    else {
      for ( int i = N - 1 ;
      i > 0 ;
      i -- ) {
        ANS [ i ] = String . valueOf ( i + 1 ) + " " + String . valueOf ( i ) ;
        ans ++ ;
      }
    }
  }
  System . out . println ( ans ) ;
  for ( int i = 0 ;
  i < ans ;
  i ++ ) {
    System . out . println ( ANS [ i ] ) ;
  }
}
