@ VisibleForTesting static String input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  Calendar cal = Calendar . getInstance ( ) ;
  cal . set ( 1970 , 1 , 1 , 0 , 0 , 0 ) ;
  cal . add ( Calendar . SECOND , n ) ;
  return cal . toString ( ) ;
}
