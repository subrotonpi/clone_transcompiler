def import _stock_charts
import sys
import os
import sys
class StockCharts ( object ) :
    def do_main ( self ) :
        with open ( 'input.txt' , 'r' ) as sc :
            f = open ( 'output.txt' , 'w' )
    def do_main ( self ) :
        self.case_cnt = len ( sys.stdin.read ( ) )
        for case_num in range ( 1 , case_cnt + 1 ) :
            print ( 'solving case ' + str ( case_num ) )
            n , k = len ( sys.stdin.read ( ) ) , len ( sys.stdin.read ( ) )
            price = [ [ ] for i in range ( n ) for j in range ( k ) ]
            fl = [ [ ] for i in range ( 2 * n + 2 ) ]
            cp = [ [ ] for i in range ( 2 * n + 2 ) ]
            for i in range ( 1 , n + 1 ) :
                less = True
                for t in range ( k ) :
                    if price [ i ] [ t ] >= price [ j ] [ t ] :
                        less = False
                if less :
                    cp [ i + 1 ] [ j + n + 1 ] = 1
    res = n
    while True :
        q = [ ]
        q_beg , q_end = 0 , 0
        prev = [ - 1 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ] + [ 0 ]
