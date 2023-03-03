static final int [ ] getOccurrences ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  Counter c = new Counter ( a ) ;
  int [ ] a2 = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a2 [ i ] = c . counter ( a ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int tmp = a2 [ i ] ;
    if ( tmp < i ) ans += tmp ;
    else ans += ( tmp - i ) ;
  }
  System . out . println ( ans ) ;
  return a2 ;
}
