public static final Audience . Reader < String > reader = new Audience . Reader < String > ( ) {
  private float x ;
  private final List < String > pointList ;
  private int [ ] contestantPoints ;
  @ Override public void init ( final List < String > pointList ) {
    this . x = ( float ) Math . pow ( pointList . size ( ) , 2 ) ;
    pointList = pointList . toArray ( new String [ pointList . size ( ) ] ) ;
  }
  @ Override public String getAnswer ( ) {
    return StringUtils . join ( String . valueOf ( getFraction ( c , c ) * 100 ) , " " ) ;
  }
  @ Override public float getFraction ( final int c , final int d ) {
    List < String > filtList = Stream . of ( pointList ) . map ( line -> line . substring ( 0 , 1 ) ) . collect ( Collectors . toList ( ) ) ;
    List < String > convFiltList = Stream . of ( pointList ) . filter ( line -> line . substring ( 1 , 2 ) . compareTo ( line . substring ( 2 , 3 ) ) > 0 ) . collect ( Collectors . toList ( ) ) ;
    float s = ( Float ) Math . pow ( filtList . size ( ) + x , 2 ) / filtList . size ( ) ;
    float answ = Math . max ( 0 , ( s - c ) / x ) ;
    if ( convFiltList . size ( ) > 0 && answ * x + c > Math . min ( convFiltList . size ( ) ) ) {
      return getFraction ( c , Math . min ( convFiltList . size ( ) , c ) ) ;
    }
    else {
      return answ ;
    }
  }
}
