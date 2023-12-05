def import _readline
import sys
import readline
import readline
import sys
class Main ( readline ) :
    def readline ( self ) :
        try :
            readline.readline ( )
        except EOFError :
            pass
        return int ( readline.readline ( ) )
    def readline ( self ) :
        return int ( readline.readline ( ) )
    def readline ( self ) :
        return float ( readline.readline ( ) )
    def readline ( self ) :
        return readline.readline ( )
    def solve ( ) :
        former = PriorityQueue ( )
        latter = PriorityQueue ( reverse = True )
        former_sum = 0
        latter_sum = 0
        for i in range ( n ) :
            former_sum += long ( as [ i ] )
            former.put ( as [ i ] )
        for i in range ( 2 * n , 3 * n ) :
            latter_sum += long ( as [ i ] )
            latter.put ( as [ i ] )
        latter_sums = [ ]
        latter_sums.append ( latter_sum )
        for i in range ( 2 * n - 1 , - 1 , - 1 ) :
            max = latter.peek ( )
            if max > as [ i ] :
                latter_sum -= long ( max )
                latter_sum += long ( as [ i ] )
                latter.poll ( )
                latter.put ( as [ i ] )
            latter_sums.append ( latter_sum )
        former_sums = [ ]
        former_sums.append ( former_sum )
        for i in range ( n , 2 * n ) :
            min = former.peek ( )
            if min < as [ i ] :
                former_sum -= long ( min )
                former_sum += long ( as [ i ] )
                former.poll ( )
                former.put ( as [ i ] )
            former_sums.append ( former_sum )
        diff = former_sums [ 0 ] - latter_sums [ 0 ]
        return diff
