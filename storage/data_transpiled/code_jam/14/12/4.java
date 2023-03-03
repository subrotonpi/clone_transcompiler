@ Sys public static int trimmed ( List < List < Integer >> E , int v , int u ) {
  List < Integer > t = new ArrayList < > ( ) ;
  for ( int n : E . get ( v ) ) {
    if ( n != u ) {
      t . add ( trimmed ( E , n , v ) ) ;
    }
  }
  if ( t . size ( ) <= 1 ) {
    return 1 ;
  }
  else {
    return 1 + t . get ( t . size ( ) - 2 ) + t . get ( t . size ( ) - 1 ) ;
  }
  int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    List < List < Integer >> E = new ArrayList < > ( N ) ;
    for ( int v = 0 ;
    v < N ;
    v ++ ) {
      E . add ( new LinkedList < > ( ) ) ;
    }
    for ( int e = 0 ;
    e < N - 1 ;
    e ++ ) {
      int a = Integer . parseInt ( System . console ( ) . readLine ( ) ) - 1 , b = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      E . get ( a ) . add ( b ) ;
      E . get ( b ) . add ( a ) ;
    }
    int minTrim = N ;
    for ( int root = 0 ;
    root < N ;
    root ++ ) {
      minTrim = Math . min ( minTrim , N - trimmed ( E , root , null ) ) ;
    }
    System . out . println ( "Case #" + t + ":" ) ;
    System . out . println ( minTrim ) ;
  }
  return T ;
}
