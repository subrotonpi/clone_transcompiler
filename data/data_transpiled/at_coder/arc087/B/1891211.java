static final int [ ] getStdin ( int n , int t ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  int in [ ] = new int [ n ] ;
  int inx = 0 , iny = 0 ;
  HashMap < Tuple , Integer > memo = new HashMap < Tuple , Integer > ( ) ;
  Thread tg = new Thread ( ) {
    public void run ( ) {
      Arrays . sort ( g ) ;
      Collections . reverse ( g ) ;
    }
    private boolean tn ( Tuple [ ] g , int n , int t ) {
      int [ ] z ;
      if ( ( z = memo . get ( new Tuple ( g , n , t ) ) ) != null ) return ;
      if ( g . length == 0 ) {
        if ( n == t ) {
          return true ;
        }
        else {
          return false ;
        }
      }
      if ( n < t ) {
        z = tn ( g , 1 , n + g [ 0 ] , t ) ;
        memo . put ( new Tuple ( g , n , t ) , z ) ;
        return z ;
      }
      else {
        z = tn ( g , 1 , n - g [ 0 ] , t ) ;
        memo . put ( new Tuple ( g , n , t ) , z ) ;
        return z ;
      }
    }
  }
  ;
  if ( tg . run ( in , 1 , 0 , iny ) && tg . run ( in , 2 , 0 , iny ) ) System . out . println ( "Yes" ) ;
  else System . out . println ( "No" ) ;
  return null ;
}
