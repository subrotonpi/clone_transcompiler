public static int [ ] [ ] proj ( int w , int h , int n ) {
  int x1 , y1 , x2 , y2 ;
  int [ ] [ ] ps = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    x1 = Integer . parseInt ( input . readLine ( ) ) ;
    y1 = Integer . parseInt ( input . readLine ( ) ) ;
    x2 = Integer . parseInt ( input . readLine ( ) ) ;
    y2 = Integer . parseInt ( input . readLine ( ) ) ;
    int [ ] p1 = proj ( x1 , y1 ) ;
    int [ ] p2 = proj ( x2 , y2 ) ;
    if ( p1 != null && p2 != null ) {
      ps [ i ] = p1 ;
    }
  }
  Arrays . sort ( ps ) ;
  Stack < Integer > stk = new Stack < > ( ) ;
  for ( final int i : ps ) {
    if ( stk . isEmpty ( ) && stk . peek ( ) == i ) {
      stk . pop ( ) ;
    }
    else {
      stk . push ( i ) ;
    }
  }
  boolean result = ! stk . isEmpty ( ) ;
  System . out . println ( new String [ ] {
    "NO" , "YES" }
    ) ;
    return ps ;
  }
  