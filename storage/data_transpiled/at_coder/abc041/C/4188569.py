def import key_sort
import sys
import getopt
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readInt ( )
        lst = [ ( i + 1 , sc.readInt ( ) ) for i in range ( n ) ]
        lst.sort ( key = lambda x : x [ 1 ] )
        for i in range ( n ) :
            print ( lst [ n - 1 - i ].key )
    def __init__ ( self , * args ) :
        self.key = args [ 0 ]
        self.sort = args [ 1 ]
    def key_sort_cmp ( self , sort1 , sort2 ) :
        return cmp ( self.key , sort1 )
