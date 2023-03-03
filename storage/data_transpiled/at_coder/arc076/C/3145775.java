public static void print ( int r , int c , int n ) {
  List < Point > dots = new ArrayList < Point > ( ) ;
  int num = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x1 = Integer . parseInt ( input . nextLine ( ) ) ;
    int y1 = Integer . parseInt ( input . nextLine ( ) ) ;
    int x2 = Integer . parseInt ( input . nextLine ( ) ) ;
    int y2 = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( ( 0 < x1 < r && 0 < y1 && 0 < c ) || ( 0 < x2 < r && 0 < y2 && 0 < c ) ) {
      continue ;
    }
    else {
      num ++ ;
      Point d1 = new Point ( x1 , y1 ) ;
      Point d2 = new Point ( x2 , y2 ) ;
      if ( x1 == 0 ) {
        dots . add ( new Point ( y1 , i ) ) ;
      }
      else if ( y1 == c ) {
        dots . add ( new Point ( c + x1 , i ) ) ;
      }
      else if ( x1 == r ) {
        dots . add ( new Point ( 2 * c + r - y1 , i ) ) ;
      }
      else {
        dots . add ( new Point ( 2 * ( r + c ) - x1 , i ) ) ;
      }
      if ( x2 == 0 ) {
        dots . add ( new Point ( y2 , i ) ) ;
      }
      else if ( y2 == c ) {
        dots . add ( new Point ( c + x2 , i ) ) ;
      }
      else if ( x2 == r ) {
        dots . add ( new Point ( 2 * c + r - y2 , i ) ) ;
      }
      else {
        dots . add ( new Point ( 2 * ( r + c ) - x2 , i ) ) ;
      }
    }
  }
  if ( num <= 1 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    Collections . sort ( dots , new Comparator < Point > ( ) {
      public int compare ( Point o1 , Point o2 ) {
        return o1 . x - o2 . x ;
      }
    }
    ) ;
    Stack < Point > stack = new Stack < Point > ( ) ;
    for ( int i = 0 ;
    i < num * 2 ;
    i ++ ) {
      if ( stack . isEmpty ( ) ) {
        stack . push ( dots . get ( i ) . y ) ;
      }
      else {
        if ( stack . peek ( ) == dots . get ( i ) . y ) {
          stack . pop ( ) ;
        }
        else {
          stack