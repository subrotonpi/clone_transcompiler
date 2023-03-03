public static int [ ] [ ] [ ] A = new int [ 3 ] [ 3 ] ;
int [ ] [ ] B = new int [ 3 ] [ 3 ] ;
for ( int i = 0 ;
i < 3 ;
i ++ ) {
  A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  B [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( Math . abs ( A [ i ] ) < Math . abs ( B [ i ] ) ) System . out . println ( "Ant" ) ;
  else if ( Math . abs ( A [ i ] ) > Math . abs ( B [ i ] ) ) System . out . println ( "Bug" ) ;
  else System . out . println ( "Draw" ) ;
}
