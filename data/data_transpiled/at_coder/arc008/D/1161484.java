static final String [ ] [ ] string , Iterable < Integer > iterable , Iterable < Integer >> fractions , PriorityQueue < Integer > heapq , Iterable < Integer > collections , Pattern [ ] [ ] array , List < Integer > [ ] [ ] bisect , Random random , Time time ) {
  System . setSecurityManager ( new SecurityManager ( ) {
    private static final long serialVersionUID = 1L ;
    private static final long serialVersionUID = 1L ;
    private static final long inf = 10 * 20 ;
    private final long mod = 10 * 9 + 7 ;
    @ Override public List < String > list ( ) {
      return Lists . newArrayList ( String . valueOf ( inf ) , String . valueOf ( mod ) ) ;
    }
    @ Override public List < String > list ( ) {
      return Lists . newArrayList ( String . valueOf ( ma ) ) ;
    }
  }
  ) ;
  System . out . println ( main ( ) ) ;
  /* LF */
  /* II */
  /* LS */
  /* S */
  class Seg {
    private static final long N ;
    private final long [ ] [ ] aa ;
    {
      N = 2 * 20 ;
      private final long [ ] [ ] aa = new long [ N ] [ N ] ;
      {
        this . N = N ;
      }
      public void update ( int n , long defaultValue ) {
        this . N = n ;
        aa = new long [ n ] [ ] ;
        for ( int i = 1 ;
        i < 100 ;
        i ++ ) {
          if ( aa [ i - 1 ] . length == 1 ) break ;
          final long [ ] ba = aa [ i - 1 ] ;
          final int l = ba . length / 2 ;
          final long [ ] a = new long [ l ] ;
          for ( int j = 0 ;
          j < l ;
          j ++ ) a [ j ] = merge ( ba [ j * 2 ] , ba [ j * 2 + 1 ] ) ;
          aa [ l ] = a ;
        }
        this . aa = aa ;
      }
      @ Override public void update ( int i , long x ) {
        this . aa [ 0 ] [ i ] = x ;
        final int l = this . aa . length ;
        for ( int j = 1 ;
        j < l ;
        j ++ ) {
          i /= 2 ;
          this . aa [ j ] [ i ] = merge ( this . aa [ j - 1 ] [ i * 2 ] , this . aa [ j - 1 ] [ i * 2 + 1 ] ) ;
        }
      }
    }
    @ Override public long total ( ) {
      return x * a . length + a .