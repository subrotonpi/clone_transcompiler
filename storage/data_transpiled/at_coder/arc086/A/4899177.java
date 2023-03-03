static final int [ ] [ ] binarySearch ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = new ArrayList < > ( Collections . nCopies ( N , K ) ) ;
  List < int [ ] > data = new ArrayList < > ( ) ;
  int i = 0 ;
  while ( i < A . size ( ) ) {
    int x = A . get ( i ) ;
    int a = binarySearch ( A , x ) ;
    int b = binarySearch ( A , x ) ;
    data . add ( new int [ ] {
      x , b - a }
      ) ;
      i = b ;
    }
    data . sort ( ) ;
    int m = data . size ( ) - K ;
    int ans = 0 ;
    for ( int i = 0 ;
    i <= m ;
    i ++ ) {
      ans += data . get ( i ) [ 1 ] ;
    }
    System . out . println ( ans ) ;
    return data ;
  }
  