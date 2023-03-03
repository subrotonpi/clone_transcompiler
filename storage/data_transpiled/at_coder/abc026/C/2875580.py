def import _main
from sys import stdout
from itertools import count
from itertools import chain
from itertools import chain
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
    def start ( self ) :
        N = next ( self )
        B = chain ( range ( N - 1 ) )
        d = { }
        for i in range ( 1 , N - 1 ) :
            if B [ i - 1 ] in d :
                list = d [ B [ i - 1 ] ]
                list.append ( i + 1 )
                d [ B [ i - 1 ] ] = list
            else :
                list = [ i + 1 ]
                d [ B [ i - 1 ] ] = list
        m = [ ]
        for i in range ( 1 , N + 1 ) :
            if i not in d :
                m.append ( 1 )
        for i in range ( N , 1 , - 1 ) :
            if i in d :
                list = d [ i ]
                if len ( list ) == 1 :
                    m [ i ] = 2 * m [ list [ 0 ] ] + 1
                else :
                    t1 , t2 = list [ 0 ] , list [ 1 ]
                    min = min ( m [ t1 ] , m [ t2 ] )
                    max = max ( m [ t1 ] , m [ t2 ] )
                    for t in list [ 2 : ] :
                        min = min ( min , m [ t ] )
                        max = max ( max , m [ t ] )
                    m [ i ] = min + max + 1
        print ( m [ 1 ] )
    def disp ( self ) :
        for i in range ( len ( self ) - 1 ) :
            print ( self._disp ( i ) )
