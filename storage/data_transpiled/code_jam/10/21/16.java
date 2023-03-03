static int mkd ( String need , Set < String > have ) {
  if ( have . contains ( need ) || need . length ( ) == 0 ) {
    return 0 ;
  }
  int slash = need . lastIndexOf ( '/' ) ;
  String parent = need . substring ( 0 , slash ) ;
  int r = mkd ( parent , have ) ;
  have . add ( need ) ;
  return r + 1 ;
}
private void hv ( Set < String > have , String him ) {
  if ( him . length ( ) < 2 ) {
    return ;
  }
  have . add ( him ) ;
  int slash = him . lastIndexOf ( '/' ) ;
  String parent = him . substring ( 0 , slash ) ;
  hv ( have , parent ) ;
}
int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
for ( int testCase = 0 ;
testCase < T ;
testCase ++ ) {
  have = new HashSet < String > ( ) ;
  have . add ( "/" ) ;
  int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int M = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int r = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    hv ( have , System . console ( ) . readLine ( ) ) ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    need = System . console ( ) . readLine ( ) ;
    r += mkd ( need , have ) ;
  }
  System . out . println ( "Case #" + ( testCase + 1 ) + ": " + r ) ;
}
