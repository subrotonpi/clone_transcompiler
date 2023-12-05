def round1B ( ) :
    import os
    import sys
    import itertools
    import round1B.pushRelabelNodeEdge
    class ProblemC ( object ) :
        def solve ( self ) :
            n = len ( self.input )
            map1 = { }
            map2 = { }
            start = Node ( 'start' )
            end = Node ( 'end' )
            for first_word , second_word in self.input :
                if first_word not in map1 :
                    node = Node ( first_word )
                    map1 [ first_word ] = node
                    pushRelabelNodeEdge.add_directed ( start , node , 1 )
                if second_word not in map2 :
                    node = Node ( second_word )
                    map2 [ second_word ] = node
                    pushRelabelNodeEdge.add_directed ( node , end , 1 )
                pushRelabelNodeEdge.add_directed ( map1 [ first_word ] , map2 [ second_word ] , 1 )
            nodes = [ start , end ]
            nodes.extend ( map1.values ( ) )
            nodes.extend ( map2.values ( ) )
            flow = pushRelabelNodeEdge.get_max_flow ( nodes , start , end )
            greedy = len ( nodes ) - 2 - 2 * flow
            print ( n - flow - greedy )
    def main ( ) :
        with open ( 'C-large.in' , 'r' ) as f :
            f.seek ( 0 )
            cases = len ( f.readlines ( ) )
            for i in range ( 1 , cases + 1 ) :
                print ( 'Case #%d: ' % i )
                solve ( f )
            f.close ( )
