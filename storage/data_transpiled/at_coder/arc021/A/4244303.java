public static int [ ] [ ] L = new int [ 4 ] [ 4 ] ;
for ( int i = 0 ;
i < 4 ;
i ++ ) {
  L [ i ] = new int [ 3 ] ;
  for ( int j = 0 ;
  j < 3 ;
  j ++ ) {
    L [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
}
boolean flag = false ;
for ( int i = 0 ;
i < 4 ;
i ++ ) {
  for ( int j = 0 ;
  j < 3 ;
  j ++ ) {
    if ( L [ i ] [ j ] == L [ i ] [ j + 1 ] ) {
      flag = true ;
      break ;
    }
    else {
      for ( int k = 0 ;
      k < 3 ;
      k ++ ) {
        for ( int l = 0 ;
        l < 4 ;
        l ++ ) {
          if ( L [ k ] [ l ] == L [ k + 1 ] [ l ] ) {
            flag = true ;
            break ;
          }
        }
      }
    }
  }
}
if ( flag ) {
  System . out . println ( "CONTINUE" ) ;
}
else {
  System . out . println ( "GAMEOVER" ) ;
}
return L ;
}
