def _import ( ) :
    import os
    import sys
    class ProblemC ( object ) :
        FILENAME = 'problemC_large'
        def _infile_name ( self ) :
            return '%s.in' % self.FILENAME
        def _out_file_name ( self ) :
            return '%s.out' % self.FILENAME
        def main ( self ) :
            with open ( self.in_file_name ( ) , 'r' ) as infile :
                with open ( self.out_file_name ( ) , 'w' ) as outfile :
                    outfile.write ( '%.9f ' % self.__dict__ [ 'problemC' ] )
    def _problem_c ( ) :
        with open ( self.in_file_name ( ) , 'r' ) as infile :
            with open ( self.out_file_name ( ) , 'w' ) as outfile :
                with open ( self.in_file_name ( ) , 'r' ) as outfile :
                    for test , n , nr_pairs in enumerate ( infile ) :
                        max_dist = [ n for n , _ in range ( n ) ]
                        speed = [ n for n , _ in range ( n ) ]
                        dist = [ [ n for n , _ in range ( n ) ] for _ in range ( n ) ]
                        for i , j in range ( n ) :
                            dist [ i ] [ j ] = min ( dist [ i ] [ j ] , dist [ i ] [ k ] + dist [ k ] [ j ] )
    time = [ [ min ( x , y ) for x , y in range ( n ) ] for x in range ( n ) ]
    time = [ [ min ( x , y ) for x , y in range ( n ) ] for x in range ( n ) ]
    time = [ [ min ( x , y ) for x , y in range ( n ) ] for x in range ( n ) ]
    time = [ [ min ( x , y ) for x , y in range ( n ) ] for x in range ( n ) ]
    time = [ [ min ( x , y ) for x , y in range ( n ) ] for x in range ( n ) ]
    time = [ [ min ( x , y ) for x , y in range ( n ) ] for x in range ( n )