@ VisibleForTesting static LinkedHashMap < String , String > readInput ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String L = "" ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L += input . nextLine ( ) ;
  }
  final Counter C = new Counter ( L ) ;
  String ans = "DRAW" ;
  if ( C . R > C . B ) {
    ans = "TAKAHASHI" ;
  }
  else if ( C . R < C . B ) {
    ans = "AOKI" ;
  }
  return ans ;
}
