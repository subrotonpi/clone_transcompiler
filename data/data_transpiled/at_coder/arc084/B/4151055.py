def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
    def main ( self ) :
        k = len ( self.sc )
        dp = [ ]
        dp.append ( int ( self.sc [ 0 ] ) / 10 )
        dp.append ( 1 )
        queue = PriorityQueue ( ( x , y ) for x , y in self.sc [ 1 : ] )
        queue.append ( 1 )
        while queue :
            cur = queue.pop ( )
            for i in range ( 10 ) :
                next = ( 10 * cur + i ) % k
                if dp [ next ] > ( dp [ cur ] + i ) :
                    dp [ next ] = dp [ cur ] + i
                    queue.append ( next )
        print ( dp [ 0 ] )
