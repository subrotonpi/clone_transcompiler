def import readline
import readline
import readline
import sys
import readline
import readline
import random
import sys
class Main ( readline ) :
    def __init__ ( self ) :
        sc = readline
        n , k , q = sc.__next__ ( )
        as = [ ]
        for i in range ( n ) :
            as.append ( sc.__next__ ( ) )
        self.solve ( )
    def solve ( ) :
        bs = as [ : ]
        bs.sort ( )
        prev_min = - 1
        diff = sys.maxint
        for i in range ( n ) :
            min_num = bs [ i ]
            if prev_min == min_num :
                prev_min = min_num
                continue
            prev_min = min_num
            l = 0
            candidates = [ ]
            p_queue = [ ]
            for j in range ( 0 , n ) :
                if j == n or as [ j ] < min_num :
                    if j - l >= k :
                        temp_queue = [ ]
                        for m in range ( l , j ) :
                            temp_queue.append ( as [ m ] )
                        for m in range ( j - l - k + 1 ) :
                            candidates.append ( temp_queue.pop ( ) )
                l = j + 1
            if len ( candidates ) < q :
                continue
            candidates.sort ( )
            temp_diff = candidates [ q - 1 ] - candidates [ 0 ]
            if temp_diff < diff :
                diff = temp_diff
        print ( diff )
    class FastReader ( readline ) :
        def __init__ ( self ) :
            readline.__init__ ( self )
            self.tokens = readline
        def readline ( self ) :
            while not self.tokens or not self.tokens :
                try :
                    readline.__init__ ( self )
                except EOFError :
                    pass
            return self.tokens [ 0 ]
