public static void input ( ) {
  int x = Integer . MAX_VALUE - 1 , y = Integer . MAX_VALUE - 1 , w = Integer . MAX_VALUE - 1 ;
  int [ ] [ ] l = new int [ 9 ] [ ] ;
  for ( int i = 0 ;
  i < 9 ;
  i ++ ) l [ i ] = input . nextInt ( ) ;
  HashMap < String , Integer > ma = new HashMap < String , Integer > ( ) ;
  ma . put ( "R" , ( short ) 1 ) ;
  ma . put ( "L" , ( short ) - 1 ) ;
  ma . put ( "U" , ( short ) 0 ) ;
  ma . put ( "D" , ( short ) 0 ) ;
  ma . put ( "RU" , ( short ) 1 ) ;
  ma . put ( "RD" , ( short ) 1 ) ;
  ma . put ( "LU" , ( short ) - 1 ) ;
  ma . put ( "LD" , ( short ) - 1 ) ;
  int tx = ma . get ( w ) ;
  int ty = ma . get ( w ) ;
  String res = "" ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    res += l [ y ] [ x ] ;
    y += ty ;
    x += tx ;
    if ( x < 0 ) {
      x = 1 ;
      tx = - tx ;
    }
    else if ( x > 8 ) {
      x = 7 ;
      tx = - tx ;
    }
    if ( y < 0 ) {
      y = 1 ;
      ty = - ty ;
    }
    else if ( y > 8 ) {
      y = 7 ;
      ty = - ty ;
    }
  }
  System . out . println ( res ) ;
}
