public static void input ( Scanner in ) {
  int n = in . nextInt ( ) ;
  int aSum = 0 ;
  int abSum = 0 ;
  int bMin = Integer . MIN_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = in . nextInt ( ) ;
    int b = in . nextInt ( ) ;
    abSum += a ;
    if ( a > b ) bMin = Math . min ( bMin , b ) ;
    else aSum += a ;
  }
  if ( aSum == abSum ) System . out . println ( 0 ) ;
  else System . out . println ( abSum - bMin ) ;
}
