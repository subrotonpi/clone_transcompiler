public static void mincos ( int n , int [ ] [ ] ab ) {
  List < Pair < String , Integer >> aball = new ArrayList < > ( ) ;
  aball . add ( new Pair < > ( ab [ 0 ] [ 0 ] , i + 1 , 'a' ) ) ;
  aball . add ( new Pair < > ( ab [ i ] [ 1 ] , i + 1 , 'b' ) ) ;
  aball . forEach ( i -> {
    int ans1 = Integer . valueOf ( i . getFirst ( ) ) ;
    int hen = aball . get ( i ) . getFirst ( ) ;
    int hen2 = aball . get ( i + 1 ) . getFirst ( ) ;
    Set < Character > set = new HashSet < > ( ) ;
    Character t = null ;
    boolean hantei = true ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      char c = aball . get ( j ) . getFirst ( ) ;
      char mab = aball . get ( j ) . getSecond ( ) ;
      if ( t != null && t != mab ) hantei = false ;
    }
    if ( c != null ) {
      System . out . println ( ans1 ) ;
      exit ( ) ;
    }
  }
  ) ;
}
