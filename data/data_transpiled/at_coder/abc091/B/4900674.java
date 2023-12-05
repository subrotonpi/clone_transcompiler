public static int [ ] getBlue ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > blue = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int s = input . nextInt ( ) ;
    blue . add ( s ) ;
  }
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > red = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int t = input . nextInt ( ) ;
    red . add ( t ) ;
  }
  ArrayList < Integer > ans = new ArrayList < > ( ) ;
  ans . add ( 0 ) ;
  for ( int word : ( blue . size ( ) + red ) ) {
    int count = sum ( blue . get ( word ) ) ;
    count -= sum ( t ) ;
    ans . add ( count ) ;
  }
  System . out . println ( max ( ans ) ) ;
  return ans . toArray ( ) ;
}
