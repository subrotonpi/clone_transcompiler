public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] t = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    t [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( t ) ;
  long ans = 0 ;
  long time = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans += ( time + t [ i ] ) ;
    time += t [ i ] ;
  }
  System . out . println ( ans ) ;
  Map < Integer , Integer > di = new HashMap < > ( ) ;
  boolean [ ] li = new boolean [ 100001 ] ;
  for ( int i = 1 ;
  i < t . length ;
  i ++ ) {
    li [ i ] = false ;
  }
  for ( int i = 1 ;
  i <= t . length ;
  i ++ ) {
    if ( li [ i ] ) {
      di . put ( i , 1 ) ;
    }
    else {
      di . put ( i , 1 ) ;
      li [ i ] = true ;
    }
  }
  ans = 1 ;
  for ( int i = 1 ;
  i <= t . length ;
  i ++ ) {
    ans *= i ;
    ans %= 1000000007 ;
  }
}
