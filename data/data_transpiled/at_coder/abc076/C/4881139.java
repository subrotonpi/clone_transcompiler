public static void input ( ) {
  String a = input . nextLine ( ) ;
  String b = input . nextLine ( ) ;
  int la = a . length ( ) ;
  int lb = b . length ( ) ;
  String ans = "UNRESTORABLE" ;
  for ( int i = 0 ;
  i < la - lb + 1 ;
  i ++ ) {
    int k = 1 ;
    for ( int j = 0 ;
    j < lb ;
    j ++ ) {
      if ( a . charAt ( i + j ) == '?' ) {
        continue ;
      }
      if ( a . charAt ( i + j ) != b . charAt ( j ) ) {
        k = 0 ;
      }
    }
    if ( k == 1 ) {
      ans = i ;
    }
  }
  if ( ans . equals ( "UNRESTORABLE" ) ) {
    System . out . println ( ans ) ;
  }
  else {
    ans = a . substring ( 0 , ans ) + b + a . substring ( ans + lb ) ;
    System . out . println ( ans . replace ( "?" , "a" ) ) ;
  }
}
