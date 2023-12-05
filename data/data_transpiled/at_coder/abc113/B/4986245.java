static final double diff = Double . MAX_VALUE ;
String ans = "" ;
int N = Integer . parseInt ( input ( ) ) ;
int T = Integer . parseInt ( input ( ) ) ;
int A = Integer . parseInt ( input ( ) ) ;
int [ ] H = Integer . parseInt ( input ( ) ) ;
for ( int i = 0 ;
i <= N ;
i ++ ) {
  int t = T - H [ i ] * .006 ;
  int d = Math . abs ( A - t ) ;
  if ( diff > d ) {
    ans = i + 1 ;
    diff = d ;
  }
}
System . out . println ( ans ) ;
}
