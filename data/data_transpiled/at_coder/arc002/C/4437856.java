static final int input ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  String C = input ( ) ;
  String R [ ] = {
    "A" , "B" , "X" , "Y" }
    ;
    double num = Double . MAX_VALUE ;
    for ( int a = 0 ;
    a < R . length ;
    a ++ ) {
      int b = R [ a ] . charAt ( 0 ) ;
      int L = a + b ;
      for ( int c = 0 ;
      c < R . length ;
      c ++ ) {
        int d = R [ c ] . charAt ( 0 ) ;
        int P = c + d ;
        int i = 0 ;
        int tmp = 0 ;
        while ( i < N ) {
          if ( i + 1 < N && ( C . charAt ( i ) + C . charAt ( i + 1 ) == L || C . charAt ( i ) + C . charAt ( i + 1 ) == P ) ) {
            i += 2 ;
            tmp ++ ;
          }
          else {
            i ++ ;
            tmp ++ ;
          }
        }
        num = Math . min ( num , tmp ) ;
      }
    }
    System . out . println ( num ) ;
    return num ;
  }
  