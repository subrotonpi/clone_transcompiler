public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  int Q = Integer . parseInt ( input ) ;
  List < Integer > A = new ArrayList < > ( ) ;
  List < Integer > B = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N - Q + 1 ;
  i ++ ) {
    A . add ( i ) ;
    B . add ( i ) ;
  }
  List < Integer > L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N - Q + 1 ;
  i ++ ) {
    L . add ( i ) ;
  }
  List < Integer > sL = new ArrayList < > ( L ) ;
  Collections . sort ( sL ) ;
  if ( Q == 1 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  if ( Q == N - K + 1 ) {
    System . out . println ( L . get ( 0 ) . intValue ( ) ) ;
    exit ( ) ;
  }
  if ( K == 1 ) {
    System . out . println ( sL . get ( 0 ) . intValue ( ) ) ;
    exit ( ) ;
  }
  if ( sL . get ( 0 ) . intValue ( ) == 0 ) {
    System . out . println ( sL . get ( 0 ) . intValue ( ) ) ;
    exit ( ) ;
  }
  if ( sL . get ( 0 ) . intValue ( ) == sL . get ( sL . size ( ) - 1 ) . intValue ( ) ) {
    System . out . println ( sL . get ( 0 ) . intValue ( ) ) ;
    exit ( ) ;
  }
  for ( Integer key : sL ) {
    Integer value = key ;
    Integer maxValue = B . get ( key + Q - 1 ) ;
    Integer minValue = B . get ( key ) ;
    List < Integer > C = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      C . add ( ( i >= minValue ? A . get ( i ) : null ) ) ;
    }
    int i = 0 ;
    int j = 0 ;
    int count = 0 ;
    boolean minOK = false ;
    boolean maxOK = false ;
    while ( i < N ) {
      if ( C . get ( i ) == null ) {
        i ++ ;
        continue ;
      }
      j = i + 1 ;
      while ( j < N ) {
        if ( C . get ( j ) == null )