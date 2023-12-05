def _import ( ) :
    import numpy as np
    import numpy
    import numpy.core as np
    import numpy.core as np
    import Scanner
    class Main ( object ) :
        def __init__ ( self , N ) :
            self.t = np.zeros ( N + 1 )
            self.N = N
        def add ( self , i , v ) :
            if i > N :
                return
            i = max ( i , 1 )
            for j in range ( i , len ( self.t ) + 1 ) :
                self.t [ j - 1 ] += v
        def cumsum ( self ) :
            s = 0
            for j in range ( i , 0 ) :
                s += self.t [ j - 1 ]
            return s
    def main ( ) :
        sc = Scanner ( )
        N = np.size ( sc.next ( ) )
        M = np.size ( sc.next ( ) )
        cumsum = np.cumsum ( M )
        ind_count_sum = np.cumsum ( M )
        num_by_length = [ 0 ] * M + 1
        start_index_list_by_len = { }
        for i in range ( 1 , N + 1 ) :
            l = np.size ( sc.next ( ) )
            r = np.size ( sc.next ( ) )
            length = r - l + 1
            cumsum ( length , 1 )
            num_by_length [ length ] += 1
            if length not in start_index_list_by_len :
                start_index_list_by_len [ length ] = [ ]
            lst = start_index_list_by_len [ length ]
            lst.append ( l )
        sc.close ( )
        for length in range ( 1 , M + 1 ) :
            smaller_length = length - 1
            if length in start_index_list_by_len :
                lst = start_index_list_by_len [ length ]
                for x in lst :
                    ind_count_sum ( x , 1 )
                    ind_count_sum ( x + smaller_length , - 1 )
    return Main ( )
