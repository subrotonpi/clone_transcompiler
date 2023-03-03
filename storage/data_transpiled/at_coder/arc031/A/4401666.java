input ;
String name = input . next ( ) ;
List < Character > tmp1 = new ArrayList < Character > ( name ) ;
List < Character > tmp2 = new ArrayList < Character > ( name ) ;
tmp2 . reverse ( ) ;
String res = "YES" ;
for ( int i = 0 ;
i < tmp1 . size ( ) ;
i ++ ) {
  if ( tmp1 . get ( i ) != tmp2 . get ( i ) ) {
    res = "NO" ;
    break ;
  }
}
System . out . println ( res ) ;
}
