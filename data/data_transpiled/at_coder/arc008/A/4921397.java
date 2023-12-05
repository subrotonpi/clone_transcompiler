static final String print ( ) {
  final String input = System . console ( ) . readLine ( ) ;
  final int N = Integer . parseInt ( input ) ;
  long ans = 1000000000000000 ;
  for ( int i = 0 ;
  i < 100 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 100 ;
    j ++ ) {
      final int money = i * 15 + j * 100 ;
      final int tako = i + j * 10 ;
      if ( tako >= N ) {
        ans = Math . min ( ans , money ) ;
      }
    }
  }
  System . out . println ( ans ) ;
  return input ;
}
