def _import ( ) : return int ( next ( ) )
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( next ( ) )
    def __next__ ( self ) :
        self.N = int ( next ( ) )
    def __next__ ( self ) :
        self.N = int ( next ( ) )
    def __next__ ( self ) :
        self.N = int ( next ( ) )
    def __next__ ( self ) :
        self.N = int ( next ( ) )
    def __next__ ( self ) :
        self.N = int ( next ( ) )
    def __next__ ( self ) :
        self.N = int ( next ( ) )
    def __next__ ( self ) :
        self.N = int ( next ( ) )
    def __next__ ( self ) :
        self.N = int ( next ( ) )
    def __next__ ( self ) :
        for i in range ( self.N ) :
            self.N = int ( next ( ) )
    def __next__ ( self ) :
        for l in solve ( ) :
            yield l
    def __next__ ( self ) :
        for l in solve ( ) :
            yield l
    def solve ( ) :
        q = PriorityQueue ( ( p1 , p2 ) for p1 , p2 in q if p1.size != p2.size )
        q.sort ( )
        cnt = [ ]
        first = q.pop ( )
        no = first.no
        size = first.size
        piles = 1
        while not q.empty ( ) :
            p = q.peek ( )
            if p.size == size :
                piles += 1
                q.pop ( )
            else :
                diff = size - p.size
                cnt.append ( long ( diff ) * piles )
                if p.no < no :
                    no = p.no
                size -= diff
                piles += 1
                q.pop ( )
        cnt.append ( long ( size ) * piles )
        return cnt
