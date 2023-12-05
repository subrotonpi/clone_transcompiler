static final String getStdOut ( int t , int L ) {
  final String in = "" ;
  final int N = Integer . parseInt ( in ) ;
  final int L = Integer . parseInt ( in ) ;
  final int MOD = 10 * 9 + 7 ;
  final float INF = Float . parseFloat ( in ) ;
  if ( in != null ) {
    in = in . replaceAll ( "\\s+" , " " ) ;
  }
  final Scanner pr = new Scanner ( in ) ;
  final Scanner epr = new Scanner ( System . in ) ;
  final boolean die = pr . hasNext ( ) ^ exit ( 0 ) ;
  final String readStr = in . nextLine ( ) ;
  final String readStrs = in . nextLine ( ) ;
  final int readInt = in . nextInt ( ) ;
  final int [ ] readInts = map ( readInt , N ) ;
  final float readFloat = in . nextFloat ( ) ;
  final float [ ] readFloats = map ( readFloats , N ) ;
  int N = Integer . parseInt ( in . nextLine ( ) ) ;
  int L = Integer . parseInt ( in . nextLine ( ) ) ;
  int N = Integer . parseInt ( in . nextLine ( ) ) ;
  int L = Integer . parseInt ( in . nextLine ( ) ) ;
  int N = Integer . parseInt ( in . nextLine ( ) ) ;
  int L = Integer . parseInt ( in . nextLine ( ) ) ;
  int N = Integer . parseInt ( in . nextLine ( ) ) ;
  int L = Integer . parseInt ( in . nextLine ( ) ) ;
  int N = Integer . parseInt ( in . nextLine ( ) ) ;
  int L = Integer . parseInt ( in . nextLine ( ) ) ;
  int N = Integer . parseInt ( in . nextLine ( ) ) ;
  int L = Integer . parseInt ( in . nextLine ( ) ) ;
  int [ ] bad = new int [ L ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    bad [ i ] = in . nextLine ( ) ;
  }
  if ( bad [ 0 ] != "1" * L ) return "SORRY" ;
  if ( bad [ 0 ] == "1" ) return "IMPOSSIBLE" ;
  String p1 = "1" * ( L - 1 ) ;
  String p2 = "0?" ;
  if ( bad [ 0 ] == "1" && good [ 1 ] == "0" ) p1 = "0" ;
  p2 = "?" ;
  assert p1 != p2 ;
  assert p1 . length ( ) + p2 . length ( ) <= 200 : p1 . length ( )