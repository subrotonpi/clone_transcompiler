public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > hoge = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) hoge . add ( Integer . parseInt ( input ) ) ;
  int kei = Integer . parseInt ( input ) ;
  int hei = kei / n ;
  int nokori = 0 ;
  int ans = 0 ;
  if ( ( kei % n ) > 0 ) System . out . println ( - 1 ) ;
  else {
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      nokori += hoge . get ( i ) ;
      if ( ( nokori != hei * ( i + 1 ) ) && ( nokori != hei * ( i + 1 ) ) ) ans ++ ;
    }
    System . out . println ( ans ) ;
  }
}
