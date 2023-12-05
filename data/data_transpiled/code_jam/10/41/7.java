static final Map < String , Object > cache = new HashMap < String , Object > ( ) {
  private final File cacheOut = new File ( "cache" ) ;
  private final File cacheIn = new File ( "cache" ) ;
  String line ;
  {
    try ( BufferedReader reader = new BufferedReader ( new FileReader ( cacheIn ) ) ) {
      final String key = reader . readLine ( ) ;
      final Object data = reader . readLine ( ) ;
      cache . put ( key , data ) ;
    }
  }
  private static final long serialVersionUID = - 1L ;
  private static final long serialVersionUID = 1L ;
  private static final long serialVersionUID = 1L ;
  private static final long serialVersionUID = 1L ;
  private static final long serialVersionUID = 1L ;
  private static final long serialVersionUID = 1L ;
  private static final long serialVersionUID = 1L ;
  private static final long serialVersionUID = 1L ;
  private static final long serialVersionUID = 1L ;
  private static final long serialVersionUID = 1L ;
  private static final long serialVersionUID = 1L ;
  private final String inFilename = System . getProperty ( "test.in" ) ;
  private final File outFilename = System . getProperty ( "test.out" ) ;
  final File input = new File ( inFilename . replace ( ".in" , ".out" ) ) ;
  final File output = new File ( output . getAbsolutePath ( ) . replace ( ".out" , ".out" ) ) ;
  final int n = Integer . parseInt ( input . readLine ( ) ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    final int result = solve ( i ) ;
    System . out . println ( "Case #" + i + ": " + result + " \t " + now ( ) ) ;
  }
  private static final long serialVersionUID = 1L ;
  private final String doMemoize2 ( final String keyformat , final boolean filesystem ) {
    String key ;
    if ( keyformat == null ) {
      key = doMemoize2 ( keyformat , input . getAbsolutePath ( ) . substring ( 0 , keyformat . indexOf ( '%' ) ) ) ;
    }
    else if ( keyformat . equals ( "" ) ) {
      key = doMemoize2 ( keyformat , input . getAbsolutePath ( ) . substring ( 0 , keyformat . indexOf ( '%' ) ) ) ;
    }
    else {
      throw new IllegalArgumentException ( "Memoize keyformat must be non-null or non-empty" ) ;
    }
    if ( cache . containsKey ( key ) ) return cache . get ( key ) ;
    final