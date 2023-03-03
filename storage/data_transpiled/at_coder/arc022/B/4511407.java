public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( 0 ) ;
  }
  int [ ] Aji = new int [ 10 * 5 + 1 ] ;
  for ( int i = 0 ;
  i < Aji . length ;
  i ++ ) {
    Aji [ i ] = 0 ;
  }
  int S = 0 ;
  int ans = 0 ;
  int F = 0 ;
  int E = 0 ;
  for ( int i = 0 ;
  i < 10 * 6 ;
  i ++ ) {
    if ( F == N ) {
      break ;
    }
    else if ( Aji [ A [ F + 1 ] ] == 0 ) {
      Aji [ A [ F + 1 ] ] = 1 ;
      F ++ ;
      S ++ ;
      if ( S > ans ) {
        ans = S ;
      }
    }
    else if ( Aji [ A [ E + 1 ] ] == 1 ) {
      Aji [ A [ E + 1 ] ] = 0 ;
      E ++ ;
      S -- ;
    }
  }
  System . out . println ( ans ) ;
}
