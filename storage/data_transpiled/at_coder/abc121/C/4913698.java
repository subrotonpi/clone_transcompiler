public static void main ( String input ) {
  int N = Integer . parseInt ( ( input ) ) ;
  int M = Integer . parseInt ( input ) ;
  ArrayList < Integer > List = new ArrayList < Integer > ( ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    Integer [ ] AB = new Integer [ N ] ;
    for ( int j = 0 ;
    j < AB . length ;
    j ++ ) AB [ j ] = Integer . parseInt ( input ) ;
    List . add ( AB ) ;
  }
  Collections . sort ( List ) ;
  int S = 0 ;
  int P = 0 ;
  int k = 0 ;
  while ( S < M ) {
    int a = List . get ( k ) . intValue ( ) ;
    int b = List . get ( k ) . intValue ( ) ;
    if ( S + b <= M ) {
      P = P + a * b ;
      S = S + b ;
    }
    else {
      P = P + a * ( M - S ) ;
      S = M ;
    }
    k = k + 1 ;
  }
  System . out . println ( P ) ;
}
