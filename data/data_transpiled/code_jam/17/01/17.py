def rayker.gcj2017 ( ) :
    import pysam
    import pysam
    import pysam
    import pysam
    class Solver :
        def solve ( self , input_stream , output_stream ) :
            n_tests = input_stream.tell ( )
            for t in range ( 1 , n_tests + 1 ) :
                v , k = input_stream.read ( )
                self.write ( t , output_stream , self.find ( v , k ) )
        def find ( self , line , k ) :
            b = line.chars.split ( ' ' )
            count = 0
            for i in range ( len ( b ) ) :
                if b [ i ] : continue
                count += 1
                for j in range ( k ) :
                    if i + j >= len ( b ) : return - 1
                    b [ i + j ] = not b [ i + j ]
            return count
        def write ( self , t , output_stream , v ) :
            if v == - 1 :
                output_stream.write ( "Case #%d: IMPOSSIBLE" % t )
            else :
                output_stream.write ( "Case #%d: %d" % ( t , v ) )
    return Solver ( )
