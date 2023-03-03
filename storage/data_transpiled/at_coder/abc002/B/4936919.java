public static void input ( ) {
  s = input ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) != 'a' && s . charAt ( i ) != 'i' && s . charAt ( i ) != 'u' && s . charAt ( i ) != 'e' && s . charAt ( i ) != 'o' ) {
      System . out . print ( s . charAt ( i ) + " " ) ;
    }
  }
  System . out . println ( ) ;
}
