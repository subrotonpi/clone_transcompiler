@ Test ( file = "B-large.in" ) public static void main ( String infile ) throws IOException {
  boolean debug = false ;
  String [ ] data = instr . split ( " " ) ;
  int C = Integer . parseInt ( data [ 0 ] ) ;
  int D_ix = 1 + C ;
  String [ ] C_strs = Arrays . copyOfRange ( data , 1 , D_ix ) ;
  assert C_strs . length == C ;
  int D = Integer . parseInt ( data [ D_ix ] ) ;
  int N_ix = D_ix + 1 + D ;
  assert N_ix + 2 == data . length ;
  String [ ] D_strs = Arrays . copyOfRange ( data , D_ix + 1 , N_ix ) ;
  assert D_strs . length == D ;
  N = Integer . parseInt ( data [ N_ix ] ) ;
  String N_str = Arrays . copyOfRange ( data , N_ix + 1 , N_ix ) ;
  assert N_str . length ( ) == N ;
  if ( debug ) System . out . println ( "Input: " + Arrays . asList ( C , C_strs , D , D_strs , N , N_str ) ) ;
  HashMap < String , ArrayList < String >> opposed = new HashMap < String , ArrayList < String >> ( ) ;
  for ( String [ ] d : D_strs ) {
    assert d . length == 2 ;
    ArrayList < String > L = opposed . get ( d [ 0 ] ) ;
    L . add ( d [ 1 ] ) ;
    opposed . put ( d [ 0 ] , L ) ;
    if ( d [ 0 ] != d [ 1 ] ) {
      L = opposed . get ( d [ 1 ] ) ;
      L . add ( d [ 0 ] ) ;
      opposed . put ( d [ 1 ] , L ) ;
    }
  }
  if ( debug ) System . out . println ( "Opposed: " + opposed ) ;
  HashMap < String , HashMap < String , HashMap < String , HashMap < String , HashMap < String , HashMap < String , HashMap < String >>>> > combined = new HashMap < String , HashMap < String , HashMap < String , HashMap < String , HashMap < String , HashMap < String >>>> > ( ) ;
  for ( String [ ] c : C_strs ) {
    assert c . length == 3 ;
    HashMap < String , HashMap < String , HashMap < String , HashMap < String , HashMap < String , HashMap < String , HashMap < String , String >>>>>> M = combined