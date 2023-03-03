def _import ( ) : return
from StringIO import StringIO
from itertools import deque
class Main ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.N = self.N
        self.A = sc.__next__ ( )
        print ( self.solve ( ) )
    def __next__ ( self ) :
        return int ( self.next ( ) )
    def __next__ ( self ) :
        return float ( self.next ( ) )
    def build ( self ) :
        first = build ( )
        sum = 0
        q = deque ( )
        q.append ( first )
        while not self.q.empty ( ) :
            node = q.popleft ( )
            prev = 0
            while node :
                time = prev + 1
                size = node.undersize ( ) + 1
                sum += long ( node.a ) * time * size
                if node.under :
                    q.append ( node.under )
                prev += size
                node = node.right
        return sum
    def build ( self ) :
        focus = Focus ( self.A [ 0 ] )
        for i in range ( 1 , N ) :
            focus.add ( self.A [ i ] )
        return focus.first
    class Focus ( object ) :
        def __init__ ( self , a ) :
            self.first = a
            self.nodes = [ ]
            self.nodes.append ( self.first )
            self.nodes.append ( self.first )
            self.nodes.append ( self.nodes.pop ( ) )
        def add ( self , a ) :
            arg = self.a
            low = 0
            high = self.nodes.pop ( )
            while low < high :
                mid = ( low + high ) // 2
                if self.nodes [ mid ].a < a :
                    low = mid + 1
                else :
                    high = mid
            if low < len ( self.nodes ) :
                self.nodes [ low ].right = arg
                self.nodes.append ( arg )
                self.nodes.append ( arg )
                self.nodes.append ( arg )
                self.nodes.append ( arg )
