@ VisibleForTesting static void binarySearch ( ) {
  final String CHARACTERs = "abcdefghijklmnopqrstuvwxyz" ;
  final String As = input . nextLine ( ) ;
  final int lenA = As . length ( ) ;
  final Map < Character , Integer > posChars = Maps . newHashMap ( ) ;
  for ( char ch : CHARACTERs . toCharArray ( ) ) {
    posChars . put ( ch , new Integer ( lenA ) ) ;
  }
  final int [ ] dp = new int [ lenA + 1 ] ;
  dp [ 0 ] = 1 ;
  for ( int i = 0 ;
  i < lenA ;
  i ++ ) {
    posChars . get ( As . charAt ( i ) ) . add ( i ) ;
    dp [ i ] = Math . min ( dp [ posChars . get ( As . charAt ( i ) ) - 1 ] + 1 , 1 ) ;
  }
  for ( char ch : CHARACTERs . toCharArray ( ) ) {
    posChars . put ( ch , posChars . get ( Character . toLowerCase ( ch ) ) ) ;
  }
  final StringBuilder ans = new StringBuilder ( ) ;
  int i = 0 ;
  for ( int k = dp [ 0 ] ;
  k < dp [ 1 ] ;
  k ++ ) {
    for ( char ch : CHARACTERs . toCharArray ( ) ) {
      final int pos = posChars . get ( ch ) . indexOf ( BiFunction . identity ( posChars . get ( ch ) ) ) ;
      if ( dp [ pos + 1 ] == k ) {
        ans . append ( ch ) ;
        i = pos + 1 ;
        break ;
      }
    }
  }
  System . out . println ( ans . toString ( ) ) ;
}
