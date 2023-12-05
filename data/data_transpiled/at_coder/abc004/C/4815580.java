public static int N = Integer . parseInt ( input ) {
  int a = N % 30 ;
  String [ ] ls = {
    '1' , '2' , '3' , '4' , '5' , '6' }
    ;
    for ( int i = 0 ;
    i < a ;
    i ++ ) {
      int b = i % 5 ;
      ls [ b ] = ls [ b + 1 ] ;
    }
    return ls [ a ] ;
  }
  