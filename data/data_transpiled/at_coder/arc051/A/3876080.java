public static int [ ] [ ] X1 = 0 , Y1 = 0 , R = 0 ;
int X2 = 0 , Y2 = 0 , X3 = 0 , Y3 = 0 ;
int min_x = 0 , max_x = X2 ;
int min_y = 0 , max_y = Y2 ;
boolean is_red = false ;
for ( int x = ( X1 + R ) ;
x <= ( X1 + Y1 ) ;
x ++ ) {
  if ( ( X1 - R ) <= x && ( Y1 - R ) <= y ) {
    continue ;
  }
  is_red = true ;
  break ;
}
return new int [ ] [ ] {
  is_red }
  ;
}
