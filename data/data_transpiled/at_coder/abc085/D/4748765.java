public static void main ( String input ) {
  int n = Integer . parseInt ( input ) , h = Integer . parseInt ( input ) ;
  ArrayList < Integer > ken = new ArrayList < > ( ) ;
  int res = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    ken . add ( new Integer ( a ) ) ;
    ken . add ( new Integer ( b ) ) ;
  }
  Collections . sort ( ken , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o2 . compareTo ( o1 ) ;
    }
  }
  ) ;
  for ( int d = 0 ;
  d < ken . size ( ) ;
  d ++ ) {
    int f = ken . get ( d ) ;
    if ( f > 0 ) {
      if ( h % d > 0 ) {
        res += h / d + 1 ;
      }
      else {
        res += h / d ;
      }
      h = 0 ;
    }
    else {
      res ++ ;
      h -= d ;
    }
    if ( h <= 0 ) {
      System . out . println ( res ) ;
      exit ( 0 ) ;
    }
  }
}
