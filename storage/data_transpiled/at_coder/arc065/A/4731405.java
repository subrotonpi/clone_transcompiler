{
  l = Arrays . asList ( "maerd" , "remaerd" , "esare" , "resare" ) ;
  boolean flag = false ;
  S = input . nextLine ( ) ;
  S = StringUtils . reverse ( S ) ;
  int j = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( l . contains ( S . substring ( j , i ) ) ) {
      j = i ;
      flag = true ;
    }
    else flag = false ;
  }
  System . out . println ( flag ? "YES" : "NO" ) ;
}
