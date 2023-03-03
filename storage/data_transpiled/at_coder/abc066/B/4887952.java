public static boolean f ( String s ) {
  int l = s . length ( ) ;
  if ( l % 2 == 0 ) {
    return s . regionMatches ( true , 0 , s , 0 , l / 2 ) ;
  }
}
s = input . nextLine ( ) ;
int L = s . length ( ) ;
for ( int i = 1 ;
i < L ;
i ++ ) {
  String a = s . substring ( 0 , L - i ) ;
  if ( f ( a ) ) {
    ans = a . length ( ) ;
    break ;
  }
}
System . out . println ( ans ) ;
}
