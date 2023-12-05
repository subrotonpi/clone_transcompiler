public static void UnionFind ( int n ) {
  int [ ] par = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) par [ i ] = i ;
  rank = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( par [ i ] == par [ i ] ) {
      return ;
    }
    else {
      par [ i ] = find ( par [ i ] ) ;
      return ;
    }
  }
  boolean same ( int x , int y ) {
    System . out . println ( "The union of " + x + " " + y ) ;
  }
  void union ( int x , int y ) {
    int x = find ( x ) ;
    int y = find ( y ) ;
    if ( rank [ x ] < rank [ y ] ) par [ x ] = y ;
    else {
      par [ y ] = x ;
      if ( rank [ x ] == rank [ y ] ) rank [ x ] ++ ;
    }
  }
  int N = Integer . parseInt ( input ( ) ) ;
  int Q = Integer . parseInt ( input ( ) ) ;
  UnionFind towns = new UnionFind ( 2 * N ) ;
  List < String > answers = new ArrayList < String > ( ) ;
  for ( int k = 0 ;
  k < Q ;
  k ++ ) {
    int wi = Integer . parseInt ( input ( ) ) ;
    int xi = Integer . parseInt ( input ( ) ) ;
    int yi = Integer . parseInt ( input ( ) ) ;
    int zi = Integer . parseInt ( input ( ) ) ;
    if ( wi == 1 ) {
      if ( zi % 2 == 0 ) {
        towns . union ( xi - 1 , yi - 1 ) ;
        towns . union ( xi - 1 + N , yi - 1 + N ) ;
      }
      else {
        towns . union ( xi - 1 , yi - 1 + N ) ;
        towns . union ( xi - 1 + N , yi - 1 + N ) ;
      }
    }
    else {
      answers . add ( towns . same ( xi - 1 , yi - 1 ) ? "YES" : "NO" ) ;
    }
  }
  for ( String ans : answers ) {
    System . out . println ( ans ) ;
  }
}
