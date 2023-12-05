public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  List < Integer > plist = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) plist . add ( i ) ;
  int [ ] ufp = new int [ n ] ;
  int [ ] ufs = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) ufp [ i ] = i ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) ufs [ i ] = 1 ;
  /* root */
  int pi = plist . get ( i ) ;
  int pj = plist . get ( i ) ;
  if ( pi == pj ) return ;
  if ( ufs [ pi ] < ufs [ pj ] ) ufp [ pi ] = pj ;
  else if ( ufs [ pj ] < ufs [ pi ] ) ufp [ pj ] = pi ;
  else {
    if ( pi < pj ) {
      ufp [ pj ] = pi ;
      ufs [ pi ] ++ ;
    }
    else {
      ufp [ pi ] = pj ;
      ufs [ pj ] ++ ;
    }
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int x = plist . get ( i ) ;
    int y = plist . get ( i ) ;
    if ( root ( x ) == root ( y - 1 ) ) ans ++ ;
  }
  System . out . println ( ans ) ;
}
