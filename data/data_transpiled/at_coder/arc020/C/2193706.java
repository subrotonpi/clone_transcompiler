public static int N = Integer . parseInt ( input ) {
  List < Integer > P = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P . add ( Collections . singletonList ( Integer . parseInt ( input . readLine ( ) ) ) ) ;
  }
  int B = Integer . parseInt ( input . readLine ( ) ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = P . get ( i ) ;
    int l = P . get ( i ) ;
    int la = String . valueOf ( a ) . length ( ) ;
    int k = la ;
    int b = a ;
    while ( l > 0 ) {
      if ( ( l & 1 ) != 0 ) ans = ( ans * Math . pow ( 10 , k , B ) + b ) % B ;
      b = ( b * Math . pow ( 10 , k , B ) + b ) % B ;
      k *= 2 ;
      l >>= 1 ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
