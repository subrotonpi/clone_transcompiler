public static void main ( String input ) {
  Scanner input = new Scanner ( System . in ) ;
  System . setIn ( input ) ;
  int H = input . nextInt ( ) ;
  int W = input . nextInt ( ) ;
  int N = input . nextInt ( ) ;
  int [ ] reslis ;
  if ( N == 0 ) {
    reslis = new int [ 10 ] ;
    reslis [ 0 ] = ( H - 2 ) * ( W - 2 ) - sum ( reslis ) ;
  }
  else {
    List < Integer > L = new ArrayList < Integer > ( ) ;
    for ( int k = 0 ;
    k < N ;
    k ++ ) {
      int a = input . nextInt ( ) ;
      int b = input . nextInt ( ) ;
      for ( int i = 0 ;
      i < 3 ;
      i ++ ) {
        for ( int j = 0 ;
        j < 3 ;
        j ++ ) {
          if ( 1 <= a - 2 + i && a - 2 + i <= H - 2 && 1 <= b - 2 + j && b - 2 + j <= W - 2 ) {
            L . add ( new Integer ( a - 2 + i ) ) ;
          }
        }
      }
      Collections . sort ( L ) ;
      Integer temp = null ;
      int cc = 1 ;
      reslis = new int [ 10 ] ;
      for ( Integer se : L ) {
        if ( temp == se ) {
          cc ++ ;
        }
        else {
          if ( temp == null ) {
          }
          else {
            reslis [ cc ] ++ ;
            cc = 1 ;
          }
          temp = se ;
        }
      }
      reslis [ cc ] ++ ;
      reslis [ 0 ] = ( H - 2 ) * ( W - 2 ) - sum ( reslis ) ;
    }
    for ( int i : reslis ) {
      System . out . println ( i ) ;
    }
  }
}
