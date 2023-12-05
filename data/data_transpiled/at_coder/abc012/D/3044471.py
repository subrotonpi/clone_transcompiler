def import import sys , StringIO , IntStream , IntStream , IntStream , OptionalInt
class Main ( object ) :
    input_file = sys.stdin
    output_file = sys.stdout
    with open ( input_file , 'r' ) as infile , open ( output_file , 'w' ) as outfile :
        solver = D ( )
        solver.solve ( 1 , infile , outfile )
class D ( object ) :
    def solve ( self , test_number , infile , outfile ) :
        n , m = infile.read ( ) , infile.read ( )
        dist = [ ]
        for i in range ( n ) :
            [ dist [ i ] ] = 1000000000
            dist [ i ].append ( 0 )
        for i in range ( m ) :
            a , b , t = infile.read ( ) - 1 , infile.read ( ) - 1 , infile.read ( )
            dist [ a ].append ( t )
            dist [ b ].append ( t )
        for i in range ( n ) :
            for j in range ( n ) :
                for k in range ( n ) :
                    dist [ j ] [ k ] = min ( dist [ j ] [ k ] , dist [ j ] [ i ] + dist [ i ] [ k ] )
        ans = sum ( dist )
        for i in range ( n ) :
            ans = min ( ans , IntStream ( dist [ i ] ).max ( ) or Integer ( 1 ) )
        outfile.write ( ans )
