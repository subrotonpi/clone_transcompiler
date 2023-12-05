static final ExecutorService executorService = Executors . newFixedThreadPool ( 3 , new ThreadFactory ( ) {
  private final Map < String , Object > se = Collections . synchronizedMap ( new HashMap < String , Object > ( ) ) ;
  @ Override public Object create ( ) {
    return new Object ( ) {
      private final Map < String , Object > se = Collections . synchronizedMap ( new HashMap < String , Object > ( ) ) ;
      @ Override public Object get ( String name ) {
        if ( se . containsKey ( name ) ) {
          return se . get ( name ) ;
        }
        Object o = f . get ( name ) ;
        se . put ( name , o ) ;
        return o ;
      }
    }
    ;
  }
  private static List < Integer > solveCase ( List < Integer > levels ) {
    Comparator < Integer > comparator = new Comparator < Integer > ( ) {
      @ Override public int compare ( Integer o1 , Integer o2 ) {
        Integer z = o1 ;
        final int tim = o2 ;
        final double prob = o2 ;
        final Double oo = new Double ( - 1.0 * ( 1 + ( prob / ( 1.0 - prob ) ) ) ) ;
        return z < tim ? - 1 : z ;
      }
    }
    ;
    List < Integer > gg = Lists . newArrayList ( levels ) ;
    Collections . sort ( gg , comparator ) ;
    return gg . stream ( ) . map ( i -> i . intValue ( ) ) . collect ( Collectors . toList ( ) ) ;
  }
  private static String formatAnswer ( int cn , List < Integer > answer ) {
    return "Case #" + cn + ": " + StringUtil . join ( answer , " " ) ;
  }
  private static List < List < Integer >> parseInput ( ) {
    Scanner cin = new Scanner ( System . in ) ;
    int N = Integer . parseInt ( cin . nextLine ( ) ) ;
    for ( int t : xrange ( N ) ) {
      int Z = Integer . parseInt ( cin . nextLine ( ) ) ;
      int [ ] [ ] vines = new int [ Z ] [ Z ] ;
      for ( int y = 0 ;
      y < Z ;
      y ++ ) {
        vines [ y ] = Integer . parseInt ( cin . nextLine ( ) . trim ( ) ) ;
      }
      for ( int y = 0 ;
      y < Z ;
      y ++ ) {
        vines [ y ] = vines [ y ] [ y ] * 0.01 ;
      }
      List < Integer > gg = Lists . newArrayList ( ) ;
      gg . add ( vines [ 0 ] ) ;
      gg . add ( gg ) ;
      