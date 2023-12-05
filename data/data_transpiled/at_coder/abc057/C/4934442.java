@ MoreRequires public static void main ( String [ ] args ) {
  final int N = Integer . parseInt ( input ( args ) . replaceAll ( " " , "" ) ) ;
  double ans = 1e10 ;
  int d = 0 ;
  for ( int i = ( int ) Math . sqrt ( N ) + 1 ;
  i > 0 ;
  i -- ) {
    if ( ( N % i ) == 0 ) {
      d = Math . max ( String . valueOf ( i ) . length ( ) , String . valueOf ( N / i ) . length ( ) ) ;
      ans = Math . min ( d , ans ) ;
    }
  }
  System . out . println ( ans ) ;
}
