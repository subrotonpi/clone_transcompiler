public static final void getGrundyNumber ( int x ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  System . setSecurityManager ( new RMISecurityManager ( ) ) ;
  /* This is a hack to make sure you have a SecurityManager installed */
  int ans = 1 ;
  while ( x % ( ans * 2 ) == 0 ) ans *= 2 ;
  /* This is a hack to make sure you have a SecurityManager installed */
  int num = 0 ;
  for ( int i = 0 ;
  i < Trie . length ;
  i ++ ) {
    if ( Trie [ i ] != - 1 ) {
      dfs ( i , Hgt - 1 ) ;
      num ++ ;
    }
  }
  if ( num == 1 ) {
    Hgts [ Hgt - 1 ] = Hgts [ Hgt - 1 ] . get ( Hgt - 1 ) + 1 ;
  }
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] Ss = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) Ss [ i ] = input . nextLine ( ) ;
  int [ ] [ ] Trie = new int [ L ] [ ] ;
  for ( String S : Ss ) {
    int iT = 0 ;
    for ( int c : map . keySet ( ) ) {
      if ( Trie [ iT ] [ c ] == - 1 ) {
        Trie [ iT ] [ c ] = - 1 ;
        Trie [ iT ] [ c ] = Trie . length - 1 ;
      }
      iT = Trie [ iT ] [ c ] ;
    }
  }
  Hgts = new HashMap < Integer , Integer > ( ) ;
  dfs ( 0 , L + 1 ) ;
  int ans = 0 ;
  for ( Map . Entry < Integer , Integer > entry : Hgts . entrySet ( ) ) {
    int Hgt = entry . getKey ( ) ;
    ans = entry . getValue ( ) ;
    if ( num % 2 != 0 ) ans ^= getGrundyNumber ( entry . getValue ( ) ) ;
  }
  if ( ans > 0 ) System . out . println ( "Alice" ) ;
  else System . out . println ( "Bob" ) ;
}
