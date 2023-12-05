public static void ARC067 ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) , A = Integer . parseInt ( input . nextLine ( ) ) , B = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( A >= B ) A = B ;
  long ans = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( ( X - X ) > B ) ans += A ;
  }
  System . out . println ( ans ) ;
}
