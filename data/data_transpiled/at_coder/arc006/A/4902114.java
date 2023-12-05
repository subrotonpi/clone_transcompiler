public static int [ ] E = new int [ 6 ] ;
for ( int i = 0 ;
i < 6 ;
i ++ ) {
  E [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
}
int B = Integer . parseInt ( input . nextLine ( ) ) ;
int [ ] L = new int [ 6 ] ;
for ( int i = 0 ;
i < 6 ;
i ++ ) {
  L [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
}
int bonus = 0 ;
int count = 0 ;
for ( int i = 0 ;
i < 6 ;
i ++ ) {
  if ( E [ i ] >= 0 ) {
    count ++ ;
  }
  if ( L [ i ] == B ) {
    bonus = 1 ;
  }
}
switch ( count ) {
  case 6 : System . out . println ( 1 ) ;
  break ;
  case 5 : if ( bonus == 1 ) {
    System . out . println ( 2 ) ;
  }
  else {
    System . out . println ( 3 ) ;
  }
  break ;
  case 4 : System . out . println ( 4 ) ;
  break ;
  case 3 : System . out . println ( 5 ) ;
  break ;
  default : System . out . println ( 0 ) ;
  break ;
}
return L ;
}
