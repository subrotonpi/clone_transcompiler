public static void main ( String input ) {
  N = Integer . parseInt ( input ) ;
  List < Integer > numbersList = new ArrayList < > ( ) ;
  for ( int num : input . split ( " " ) ) {
    numbersList . add ( Integer . parseInt ( num ) ) ;
  }
  int Alice_sum = numbersList . get ( N ) ;
  int Bob_sum = numbersList . get ( N ) ;
  System . out . println ( Math . abs ( Alice_sum - Bob_sum ) ) ;
}
