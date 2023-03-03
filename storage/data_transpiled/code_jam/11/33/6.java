public static int T = Integer . parseInt ( input ) {
  for ( int num = 1 ;
  num <= T ;
  num ++ ) {
    String n = input . next ( ) ;
    String l = input . next ( ) ;
    String h = input . next ( ) ;
    n = Integer . parseInt ( n ) ;
    l = Integer . parseInt ( l ) ;
    h = Integer . parseInt ( h ) ;
    List < Integer > F = Lists . newArrayList ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) F . add ( Integer . parseInt ( input . next ( ) ) ) ;
    System . out . print ( "Case #" + num + ":" ) ;
    for ( int ans = l ;
    ans <= h ;
    ans ++ ) {
      boolean good = true ;
      for ( int elem : F ) {
        if ( elem % ans != 0 && ans % elem != 0 ) {
          good = false ;
        }
      }
      if ( good ) {
        System . out . println ( ans ) ;
        break ;
      }
    }
    else System . out . println ( "NO" ) ;
  }
  return T ;
}
