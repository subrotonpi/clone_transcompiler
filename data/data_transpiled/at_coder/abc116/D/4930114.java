static final double INF = Double . MAX_VALUE ;
int n = Integer . parseInt ( input . nextLine ( ) ) ;
int k = Integer . parseInt ( input . nextLine ( ) ) ;
HashMap < Integer , ArrayList < Integer >> sushi = new HashMap < > ( ) ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ! sushi . containsKey ( t ) ) sushi . put ( t , new ArrayList < > ( ) ) ;
  sushi . get ( t ) . add ( d ) ;
}
for ( ArrayList < Integer > s : sushi . values ( ) ) Collections . sort ( s , Collections . reverseOrder ( ) ) ;
HashMap < String , Integer > eat_counts = new HashMap < > ( ) ;
for ( String s : sushi . keySet ( ) ) {
  sushi . get ( s ) . add ( s ) ;
}
ArrayList < String > news = new ArrayList < > ( ) ;
ArrayList < Integer > repeats = new ArrayList < > ( ) ;
ArrayList < String > eats = new ArrayList < > ( ) ;
for ( Map . Entry < String , ArrayList < Integer >> entry : sushi . entrySet ( ) ) {
  String name = entry . getKey ( ) ;
  ArrayList < Integer > delili = entry . getValue ( ) ;
  heapSort ( news , new IntSort ( - delili . get ( 0 ) , name ) ) ;
}
int sum_deli = 0 ;
int variety = 0 ;
for ( int i = 0 ;
i < k ;
i ++ ) {
  if ( news . size ( ) > 0 && ( repeats . isEmpty ( ) || news . get ( 0 ) <= repeats . get ( 0 ) ) ) {
    int deli = heapSort ( news , name ) ;
    variety ++ ;
    String name = entry . getKey ( ) ;
    if ( eat_counts . get ( name ) < sushi . get ( name ) . size ( ) ) {
      heapSort ( repeats , new IntSort ( - sushi . get ( name ) . get ( eat_counts . get ( name ) ) , name ) ) ;
    }
  }
  double ans = sum_deli + variety * variety ;
  do {
    if ( news . isEmpty ( ) || eats . isEmpty ( ) ) break ;
    int ate_min_deli = heapSort ( eats , name ) ;
    e @ @