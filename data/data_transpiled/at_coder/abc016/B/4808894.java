public static int x , int y , char c ;
int judge = 0 ;
if ( x + y == c ) judge += 2 ;
if ( x - y == c ) judge -= 1 ;
switch ( judge ) {
  case 2 : System . out . println ( "+" ) ;
  break ;
  case - 1 : System . out . println ( "-" ) ;
  break ;
  case 1 : System . out . println ( "?" ) ;
  break ;
  case 0 : System . out . println ( "!" ) ;
  break ;
}
return judge ;
}
