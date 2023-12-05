[ 10 ] ;
for ( int i = 0 ;
i < 10 ;
i ++ ) {
  a [ i ] = new LinkedList < > ( ) ;
}
/* dfs the first 10 chars */
arr [ y ] [ x ] = "x" ;
for ( int i = - 1 ;
i < 2 ;
i ++ ) {
  for ( int j = - 1 ;
  j < 2 ;
  j ++ ) {
    if ( i == j || i == - j ) continue ;
    if ( 0 <= x + i && x + i < 10 && 0 <= y + j && y + j < 10 ) {
      if ( arr [ y + j ] [ x + i ] == "o" ) {
        dfs ( x + i , y + j , arr ) ;
      }
    }
  }
}
/* land num */
int cnt = 0 ;
for ( int i = 0 ;
i < 10 ;
i ++ ) {
  for ( int j = 0 ;
  j < 10 ;
  j ++ ) {
    if ( arr [ i ] [ j ] == "o" ) {
      dfs ( j , i , arr , 0 , arr . length ) ;
      cnt ++ ;
    }
  }
}
boolean ans = false ;
int [ ] [ ] b = new int [ 10 ] [ 10 ] ;
for ( int i = 0 ;
i < 10 ;
i ++ ) {
  for ( int j = 0 ;
  j < 10 ;
  j ++ ) {
    for ( int k = 0 ;
    k < 10 ;
    k ++ ) {
      for ( int l = 0 ;
      l < 10 ;
      l ++ ) {
        b [ k ] [ l ] = a [ k ] [ l ] ;
      }
    }
    b [ j ] [ i ] = "o" ;
    if ( landNum ( b ) == 1 ) {
      ans = true ;
      break ;
    }
  }
}
if ( ans ) {
  System . out . println ( "YES" ) ;
}
else {
  System . out . println ( "NO" ) ;
}
return a ;
}
