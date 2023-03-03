def import readline
import readline
import readline
class C2 ( readline ) :
    def __init__ ( self ) :
        readline.parse_and_bind ( '' )
        n = readline.get_blocksize ( )
        for x , k2 , k in [ ( 'a' , 'b' ) , ( 'c' , 'd' ) , ( 'd' , 'e' ) ] :
            self.queue = defaultdict ( int )
            self.queue [ k2 ] += 1
            start_count = 0
            prev_dist = - 1
            while True :
                dist , prev_dist = self.queue.lastkey ( )
                freq = self.queue.lastentry ( ) [ 1 ]
                start_count += freq
                if start_count >= k :
                    break
                self.queue.remove ( dist )
                self.insert ( self.queue , ( dist - 1 ) / 2 , freq )
                self.insert ( self.queue , ( ( dist - 1 ) / 2 ) + ( ( dist - 1 ) % 2 ) , freq )
            left = ( prev_dist - 1 ) / 2
            right = ( ( prev_dist - 1 ) / 2 ) + ( ( prev_dist - 1 ) % 2 )
            print ( 'Case #%d: %d %d' % ( x + 1 , max ( left , right ) , min ( left , right ) ) )
    def insert ( self , queue , l , freq ) :
        if l not in self.queue :
            self.queue [ l ] = ( 0 , 0 )
        self.queue [ l ] = self.queue [ l ] + freq
    def range ( self , _dist ) :
        self.dist = _dist
    def read ( self ) :
        return readline.get_blocksize ( )
    def readline ( self ) :
        while not self._dist or not self._dist :
            try :
                self._dist = self._dist
            except :
                pass
        return self._dist
    def readline ( self ) :
        return readline.get_blocksize ( )
