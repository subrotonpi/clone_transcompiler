def _ _ main _ _ ( ) :
    import os
    import sys
    import random
    import math
    class ProblemD :
        INF = - 10000000
        def do_main ( self ) :
            with open ( 'input.txt' , 'r' ) as f :
                with open ( 'output.txt' , 'w' ) as f :
                    self.do_main ( f )
    def do_main ( ) :
        with open ( 'input.txt' , 'r' ) as f :
            with open ( 'output.txt' , 'w' ) as f :
                self.do_main ( f )
    def do_main ( ) :
        with open ( 'input.txt' , 'r' ) as f :
            self.do_main ( f )
    def do_main ( ) :
        with open ( 'output.txt' , 'w' ) as f :
            self.do_main ( f )
    def do_main ( ) :
        for case_num in range ( 1 , case_num + 1 ) :
            print ( 'Case #%d: ' % case_num , end = ' ' )
            k = sc.randint ( 1 , len ( s ) )
            s = sc.next ( )
            gr_cnt = len ( s ) // k
            edge_cost = [ [ 0 for i in range ( k ) ] for j in range ( k ) ]
            next_cost = [ [ 0 for i in range ( k ) ] for j in range ( k ) ]
            for t in range ( gr_cnt ) :
                if s [ t * k + i ] == s [ t * k + j ] :
                    edge_cost [ i ] [ j ] += 1
                for t in range ( 1 , gr_cnt ) :
                    if s [ t * k + i ] == s [ ( t + 1 ) * k + j ] :
                        next_cost [ i ] [ j ] += 1
            res = 0
            for st in range ( k ) :
                F = [ [ i , i ] for i in range ( k ) ]
                F [ st ] [ 1 << st ] = 0
                for mask in range ( ( 1 , k ) ) :
                    for cur in range ( k ) :
                        for next in range (