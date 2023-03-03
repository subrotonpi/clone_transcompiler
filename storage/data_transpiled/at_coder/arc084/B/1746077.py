def import _main
from collections import deque
from collections import defaultdict
from collections import deque
from collections import defaultdict
from collections import deque
from collections import defaultdict
from collections import deque
from collections import defaultdict
from collections import deque
class Main ( object ) :
    def compute ( self ) :
        with self.open ( "/proc/self/compute" ) as sc :
            K = sc.read ( )
    def compute ( self ) :
        with self.open ( "/proc/self/compute" ) as sc :
            K = sc.read ( )
    def compute ( self ) :
        one = [ ( i + 1 ) % K for i in range ( K ) ]
        zero = [ ( i * 10 ) % K for i in range ( K ) ]
        que = deque ( )
        min = defaultdict ( int )
        for i in range ( K ) :
            min [ i ] = min [ i ]
        que.append ( 1 )
        min [ 1 ] = 1
        while not que.empty ( ) :
            cur = que.popleft ( )
            if min [ cur ] + 1 < min [ one [ cur ] ] :
                que.append ( one [ cur ] )
                min [ one [ cur ] ] = min [ cur ] + 1
            if min [ cur ] < min [ zero [ cur ] ] :
                que.append ( zero [ cur ] )
                min [ zero [ cur ] ] = min [ cur ]
        print ( min [ 0 ] )
