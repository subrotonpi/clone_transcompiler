public static void input ( Scanner scanner ) {
  int N = scanner . nextInt ( ) ;
  ArrayList < Integer > mylist = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    mylist . add ( scanner . nextInt ( ) ) ;
  }
  int [ ] newlist = new int [ mylist . size ( ) ] ;
  for ( int s : mylist ) {
    newlist [ s ] = Integer . parseInt ( scanner . nextLine ( ) ) ;
  }
  int divisor = 0 ;
  for ( int j = 0 ;
  j < newlist . length ;
  j ++ ) {
    divisor += newlist [ j ] ;
  }
  int i = scanner . nextInt ( ) ;
  if ( i % divisor == 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
