public static void solve ( int N , List < Integer > Xs ) {
  List < Integer > sortedXs = new ArrayList < Integer > ( Xs ) ;
  Collections . sort ( sortedXs ) ;
  int left = sortedXs . get ( N / 2 - 1 ) ;
  int right = sortedXs . get ( N / 2 ) ;
  StringBuilder ans = new StringBuilder ( ) ;
  for ( int x : Xs ) {
    if ( x <= left ) {
      ans . append ( right ) ;
    }
    else {
      ans . append ( left ) ;
    }
  }
  solve ( N , ans ) ;
}
