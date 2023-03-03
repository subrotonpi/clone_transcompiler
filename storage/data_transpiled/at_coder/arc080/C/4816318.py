def _gen_min_even_elementtree ( start , end , index ) :
    from io import StringIO
    from io import BufferedReader
    from io import BufferedWriter
    from util import PriorityQueue
    from util import parse_string
    class Main ( object ) :
        def __init__ ( self , start , end , index ) :
            if start % 2 == 1 :
                self.min_even_elementtree [ index ] = self.sequence [ start ]
            else :
                self.min_even_elementtree [ index ] = self.sequence [ start ]
        def min_even_element ( self , start , query_end , index ) :
            if query_start <= start and query_end >= start :
                return self.min_even_elementtree [ index ]
            else :
                self.min_even_elementtree [ index ] = self.sequence [ start ]
        def min_even_element ( self , start , query_end , index ) :
            if query_start > end or query_end < start :
                return self.min_even_elementtree [ index ]
            else :
                self.min_even_elementtree [ index ] = self.sequence [ start ]
        def create_interval ( self , start , end , even_first ) :
            interval = Interval ( start , end , even_first )
            if even_first :
                self.min_first_value = self.sequence [ start ]
                self.index_in_sequence = [ self.sequence [ start ] ]
                self.min_second_value = self.sequence [ start ]
                for i in range ( self.sequence [ start ] ) :
                    self.sequence [ i ] = int ( self.sequence [ i ] ) - 1
                    self.index_in_sequence [ i ] = self.sequence [ i ]
            else :
                self.min_first_value = self.sequence [ start ]
                self.index_in_sequence = [ self.sequence [ start ] ]
                self.min_second_value = self.sequence [ start ]
                self.index_in_sequence = [ self.sequence [ start ] ]
                self.min_first_value = self.sequence [ start ]
                self.min_second_value = self.sequence [ end ]
                self.index_in_sequence = [ self.sequence [ start ] ]
    return Main
