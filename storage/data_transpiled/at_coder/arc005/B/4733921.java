public static String X , String Y , String W = "" ;
String [ ] [ ] c = {
  input . split ( " " ) }
  ;
  for ( int i = 0 ;
  i < 9 ;
  i ++ ) {
    c [ i ] = input . split ( " " ) ;
  }
  int x = Integer . parseInt ( X ) - 1 , y = Integer . parseInt ( Y ) - 1 ;
  int dx = 0 , dy = 0 ;
  {
    "U" : ( 0 , - 1 ) ;
    "D" : ( 0 , + 1 ) ;
    "R" : ( + 1 , 0 ) ;
    "L" : ( - 1 , 0 ) ;
    "RU" : ( + 1 , - 1 ) ;
    "RD" : ( + 1 , + 1 ) ;
    "LU" : ( - 1 , - 1 ) ;
    "LD" : ( - 1 , + 1 ) ;
  }
  String result = "" ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    result += c [ y ] [ x ] ;
    if ( x == 0 ) dx = + abs ( dx ) ;
    if ( x == 8 ) dx = - abs ( dx ) ;
    if ( y == 0 ) dy = + abs ( dy ) ;
    if ( y == 8 ) dy = - abs ( dy ) ;
    x += dx ;
    y += dy ;
  }
  System . out . println ( result ) ;
  return result ;
}
