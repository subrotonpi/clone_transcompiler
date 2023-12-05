public static void print ( int n ) {
  int k = Integer . parseInt ( input ( ) ) ;
  int val = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( k <= val ) val = val + k ;
    else val = val * 2 ;
  }
  System . out . println ( val ) ;
}
