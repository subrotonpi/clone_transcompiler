public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
  }
  int M = 0 , M_index = - 1 ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    int a = A [ i ] ;
    if ( Math . abs ( M ) <= Math . abs ( a ) ) {
      M = a ;
      M_index = i ;
    }
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] += A [ M_index ] ;
  }
  ArrayList < Integer > ans = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans . add ( new Integer ( M_index ) ) ;
  }
  if ( M >= 0 ) {
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      if ( A [ i ] > A [ i + 1 ] ) {
        A [ i + 1 ] += A [ i ] ;
        ans . add ( new Integer ( i ) ) ;
      }
    }
  }
  else {
    for ( int i = N - 1 ;
    i > 0 ;
    i -- ) {
      if ( A [ i - 1 ] > A [ i ] ) {
        A [ i - 1 ] += A [ i ] ;
        ans . add ( new Integer ( i ) ) ;
        ans . add ( new Integer ( i ) ) ;
        ans . add ( new Integer ( i ) ) ;
        ans . add ( new Integer ( i ) ) ;
        ans . add ( new Integer ( i ) ) ;
        ans . add ( new Integer ( i ) ) ;
        ans . add ( new Integer ( i ) ) ;
        ans . add ( new Integer ( i ) ) ;
        ans . add ( new Integer ( i ) ) ;
        ans . add ( new Integer ( i ) ) ;
        ans . add ( new Integer ( i ) ) ;
        ans . add ( new Integer ( i ) ) ;
        ans . add ( new Integer ( i ) ) ;
        ans . add ( new Integer ( i ) ) ;
        ans . add ( new Integer ( i ) ) ;
        ans . add ( new Integer ( i ) ) ;
        ans . add ( new Integer ( i ) ) ;
        ans . add ( new Integer ( i ) ) ;
      }
      