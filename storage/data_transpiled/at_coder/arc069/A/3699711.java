public static int N = Integer . parseInt ( input ) {
  int sNum = N ;
  int ccNum = M / 2 ;
  if ( Math . min ( sNum , ccNum ) == ccNum ) {
    System . out . println ( ccNum ) ;
    exit ( ) ;
  }
  int sccNum = sNum ;
  int ccremains = ccNum - sccNum ;
  return ccremains ;
}
