public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  ArrayList < Integer > magicUp = new ArrayList < > ( ) ;
  ArrayList < Integer > magicDown = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    if ( a < b ) {
      magicDown . add ( new Integer ( a ) ) ;
    }
    else {
      magicUp . add ( new Integer ( b ) ) ;
    }
  }
  magicDown . sort ( ) ;
  magicUp . sort ( ) ;
  int tmp = 0 ;
  int maxTmp = 0 ;
  for ( int i = magicDown . size ( ) - 1 ;
  i >= 0 ;
  i -- ) {
    int a = magicDown . get ( i ) ;
    tmp += a ;
    maxTmp = Math . max ( maxTmp , tmp ) ;
    tmp -= b ;
  }
  System . out . println ( maxTmp ) ;
}
