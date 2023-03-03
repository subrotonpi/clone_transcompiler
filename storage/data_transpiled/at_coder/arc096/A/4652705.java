static final int [ ] solve ( int [ ] input ) {
  int A = input [ 0 ] ;
  int B = input [ 1 ] ;
  int C = input [ 2 ] ;
  int X = input [ 3 ] ;
  int Y = input [ 4 ] ;
  int a = Math . min ( A , 2 * C ) ;
  int b = Math . min ( B , 2 * C ) ;
  int ab = Math . min ( A + B , 2 * C ) ;
  int cost = 0 ;
  if ( ab < ( a + b ) ) {
    if ( X == Y ) {
      System . out . println ( ab * X ) ;
      System . exit ( 0 ) ;
    }
    else if ( X > Y ) {
      cost += ab * Y ;
      if ( ab <= a ) {
        cost += ab * ( X - Y ) ;
        System . out . println ( cost ) ;
        System . exit ( 0 ) ;
      }
      else {
        cost += a * ( X - Y ) ;
        System . out . println ( cost ) ;
        System . exit ( 0 ) ;
      }
    }
    else {
      cost += ab * X ;
      if ( ab <= b ) {
        cost += ab * ( Y - X ) ;
        System . out . println ( cost ) ;
        System . exit ( 0 ) ;
      }
      else {
        cost += b * ( Y - X ) ;
        System . out . println ( cost ) ;
        System . exit ( 0 ) ;
      }
    }
  }
  else {
    System . out . println ( a * X + b * Y ) ;
    System . exit ( 0 ) ;
  }
  return new int [ ] {
    a , b , C , X , Y }
    ;
  }
  