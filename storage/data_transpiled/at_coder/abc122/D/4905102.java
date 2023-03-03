public static int N = Integer . parseInt ( input ) {
  int mod = 10 * 9 + 7 ;
  Map < String , Integer > data = Maps . newHashMap ( ) ;
  for ( int i = 0 ;
  i < "ACGT" . length ( ) ;
  i ++ ) {
    for ( int j = 0 ;
    j < "ACGT" . length ( ) ;
    j ++ ) {
      for ( int k = 0 ;
      k < "ACGT" . length ( ) ;
      k ++ ) {
        data . put ( "AGC" . charAt ( k ) , 0 ) ;
      }
    }
  }
  data . put ( "ACG" . charAt ( 0 ) , 0 ) ;
  data . put ( "GAC" . charAt ( 0 ) , 0 ) ;
  /* check the text */
  String one = data . get ( "AGC" ) ;
  String two = data . get ( "ACG" ) ;
  String three = data . get ( "ACG" ) ;
  String four = data . get ( "GAC" ) ;
  /* check the text */
  if ( "AGC" . charAt ( 0 ) == one ) {
    return false ;
  }
  if ( two . charAt ( 0 ) == one + three . charAt ( 0 ) + four . charAt ( 0 ) ) {
    return false ;
  }
  for ( int i = 0 ;
  i < N - 3 ;
  i ++ ) {
    Map < String , Integer > newData = Maps . newHashMap ( ) ;
    for ( String s : data . keySet ( ) ) {
      for ( char c : "ACGT" . charAt ( 0 ) . toCharArray ( ) ) {
        if ( ( ! data . containsKey ( s + c ) ) ) {
          continue ;
        }
        newData . put ( s . substring ( 1 ) + c , data . get ( s ) % mod ) ;
      }
    }
    data = newData . entrySet ( ) ;
  }
  System . out . println ( Arrays . toString ( data . values ( ) ) % mod ) ;
  return N ;
}
