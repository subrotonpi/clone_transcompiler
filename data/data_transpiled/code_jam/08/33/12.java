static final String getSumOfTest ( String iFName , String outFN ) throws IOException {
  final String iFName = "d:\\projekty\\google-jam\unda-1-b\\c\\C-small-attempt0.in" ;
  final String outFN = "d:\\projekty\\google-jam\unda-1-b\\c\\out-small0.txt" ;
  final BufferedReader iReader = new BufferedReader ( new FileReader ( iFName ) ) ;
  final PrintWriter outF = new PrintWriter ( outFN ) ;
  boolean verbose = false ;
  final int N = Integer . parseInt ( iReader . readLine ( ) ) ;
  for ( int testCase = 0 ;
  testCase < N ;
  testCase ++ ) {
    if ( verbose ) {
      print ( testCase ) ;
    }
    String S = iReader . readLine ( ) ;
    StringTokenizer st = new StringTokenizer ( S ) ;
    if ( verbose ) {
      print ( S ) ;
    }
    final int n = Integer . parseInt ( st . nextToken ( ) ) ;
    final int m = Integer . parseInt ( st . nextToken ( ) ) ;
    final int X = Integer . parseInt ( st . nextToken ( ) ) ;
    final int Y = Integer . parseInt ( st . nextToken ( ) ) ;
    final int Z = Integer . parseInt ( st . nextToken ( ) ) ;
    if ( verbose ) {
      print ( n , m , X , Y , Z ) ;
    }
    final int [ ] A = new int [ n ] ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      A [ j ] = Integer . parseInt ( iReader . readLine ( ) ) ;
    }
    if ( verbose ) {
      print ( A ) ;
    }
    final int [ ] SL = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      SL [ i ] = A [ i % m ] ;
      A [ i % m ] = ( X * A [ i % m ] + Y * ( i + 1 ) ) % Z ;
    }
    if ( verbose ) {
      print ( "SL" , SL ) ;
    }
    final int [ ] CNT = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      CNT [ i ] = 1 ;
    }
    int start = n - 2 ;
    while ( start >= 0 ) {
      int next = start + 1 ;
      while ( next < n ) {
        if ( SL [ next ] > SL [ start ] ) {
          CNT [ start ]