private static String S = input ( ) ;
int N = Integer . parseInt ( input ( ) ) ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  int l = Integer . parseInt ( input ( ) ) ;
  int r = Integer . parseInt ( input ( ) ) ;
  String a = S . substring ( l - 1 , r ) ;
  String b = a . substring ( 0 , r ) ;
  S = S . substring ( 0 , l - 1 ) + b + S . substring ( r ) ;
}
System . out . println ( S ) ;
}
