public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int stack [ ] = {
    0 , 0 , 0 , 0 , 0 }
    ;
    char march [ ] = {
      'M' , 'A' , 'R' , 'C' , 'H' }
      ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        String k = input ;
        for ( int j = 0 ;
        j < 5 ;
        j ++ ) {
          if ( k . charAt ( 0 ) == march [ j ] ) {
            stack [ j ] ++ ;
            break ;
          }
        }
      }
      int ans = 0 ;
      for ( int i = 0 ;
      i < 3 ;
      i ++ ) {
        for ( int j = i + 1 ;
        j < 4 ;
        j ++ ) {
          for ( int k = j + 1 ;
          k < 5 ;
          k ++ ) {
            ans += stack [ i ] * stack [ j ] * stack [ k ] ;
          }
        }
      }
      System . out . println ( ans ) ;
    }
    