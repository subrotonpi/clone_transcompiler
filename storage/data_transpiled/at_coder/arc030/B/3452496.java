public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int x = Integer . parseInt ( input ) ;
  int [ ] H = {
    0 }
    ;
    List < List < Integer >> T = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < n + 1 ;
    i ++ ) {
      H [ i ] = i ;
      T . add ( new ArrayList < > ( ) ) ;
    }
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      int a = i ;
      int b = i ;
      T . add ( a ) ;
      T . add ( b ) ;
      T . add ( b ) ;
    }
  }
  