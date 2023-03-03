@ VisibleForTesting static final LinkedHashMap < Integer , Attack > attack = new LinkedHashMap < Integer , Attack > ( ) {
  private static final long serialVersionUID = - 594790692699L ;
  private final long d = 0 ;
  private static final long n = 0 ;
  private final long w = 0 ;
  private final long e = 0 ;
  private final long s = 0 ;
  private final long delta_d = 0 ;
  private final long delta_p = 0 ;
  private final long delta_s = 0 ;
  private final long attacked = 0 ;
  @ Override public boolean move ( ) {
    n -- ;
    if ( n <= 0 ) return false ;
    d += delta_d ;
    w += delta_p ;
    e += delta_p ;
    s += delta_s ;
    return true ;
  }
  @ Override public boolean get ( ) {
    n = input . nextInt ( ) ;
    wall = new long [ n ] ;
    h = new ArrayList < > ( ) ;
    for ( int x : xrange ( n ) ) {
      d = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
      n = Integer . parseInt ( input . nextLine ( ) ) ;
      w = Integer . parseInt ( input . nextLine ( ) ) ;
      e = Integer . parseInt ( input . nextLine ( ) ) ;
      s = Integer . parseInt ( input . nextLine ( ) ) ;
      delta_d = Integer . parseInt ( input . nextLine ( ) ) ;
      delta_p = Integer . parseInt ( input . nextLine ( ) ) ;
      delta_s = Integer . parseInt ( input . nextLine ( ) ) ;
      Attack a = new Attack ( d , n , w , e , s , delta_d , delta_p , delta_s ) ;
      heappush ( h , new Pair < > ( d , a ) ) ;
    }
    return true ;
  }
  @ Override public boolean attack ( int w , int e , int s ) {
    return Math . min ( wall . get ( x ) , s ) < s ;
  }
  @ Override public void resolve ( final Iterable < Attack > attacks ) {
    for ( final Attack a : attacks ) {
      for ( final int x : xrange ( a . w , a . e ) ) {
        wall . put ( x , Math . max ( wall . get ( x ) , a . s ) ) ;
      }
    }
  }
  int ret = 0 ;
  while ( h . size ( ) > 0 ) {
    final Iterable < Attack > attacks = new Iterable < Attack > ( ) ;
    for ( final Attack a : attacks ) {
      if ( a . move ( ) ) {
        heappush ( h , new Pair <