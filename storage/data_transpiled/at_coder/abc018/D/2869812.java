static final int N = ( int ) input ( ) {
  int M = ( int ) input ( ) ;
  int P = ( int ) input ( ) ;
  int Q = ( int ) input ( ) ;
  int R = ( int ) input ( ) ;
  int [ ] [ ] A = new int [ N ] [ R ] ;
  for ( int i = 0 ;
  i <= R ;
  i ++ ) {
    int x = ( int ) input ( ) ;
    int y = ( int ) input ( ) ;
    int z = ( int ) input ( ) ;
    A [ x - 1 ] [ y ] = ( y - 1 ) ;
  }
  List < Integer > ls = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) ls . add ( i ) ;
  Iterable < Integer > it = new Iterable < Integer > ( ls , P ) ;
  int ans = - 10000000 ;
  for ( Integer [ ] X : it ) {
    int [ ] score = new int [ M ] ;
    for ( int i : Collections . list ( X ) ) {
      for ( int y = 0 ;
      y < A [ i ] . length ;
      y ++ ) {
        int z = A [ i ] [ y ] ;
        score [ y ] += z ;
      }
    }
    Arrays . sort ( score , Integer . reverseOrder ( ) ) ;
    int sum = 0 ;
    for ( int i = 0 ;
    i <= Q ;
    i ++ ) {
      sum += score [ i ] ;
    }
    ans = Math . max ( ans , sum ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
