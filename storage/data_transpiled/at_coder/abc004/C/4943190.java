public static void print ( int N = Integer . parseInt ( input ) ) {
  N %= 30 ;
  char [ ] X = {
    '1' , '2' , '3' , '4' , '5' , '6' }
    ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int a = i % 5 ;
      int b = i % 5 + 1 ;
      X [ b ] = X [ a ] ;
      X [ a ] = X [ b ] ;
    }
    System . out . println ( X ) ;
  }
  