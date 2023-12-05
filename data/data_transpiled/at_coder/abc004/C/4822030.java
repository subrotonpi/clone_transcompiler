public static int N = Integer . parseInt ( input ) {
  int N_substance = N % 30 ;
  String [ ] list = {
    '1' , '2' , '3' , '4' , '5' , '6' }
    ;
    for ( int i = 0 ;
    i < N_substance ;
    i ++ ) {
      String tmp = list [ i % 5 ] ;
      list [ i % 5 ] = list [ i % 5 + 1 ] ;
      list [ i % 5 + 1 ] = tmp ;
    }
    return N ;
  }
  