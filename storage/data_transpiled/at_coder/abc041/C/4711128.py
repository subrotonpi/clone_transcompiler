def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        pq = PriorityQueue ( N , key = _entry_key )
        for i in range ( 1 , N + 1 ) :
            pq.put ( ( sc.readline ( ) , i ) )
        while not pq.empty ( ) :
            e = pq.pop ( )
            print ( e.index )
    class EntryComparator ( object ) :
        def __init__ ( self , t1 , t2 ) :
            if t1.height < t2.height :
                return 1
            return - 1
    class Entry ( object ) :
        def __init__ ( self , height , index ) :
            self.height = height
            self.index = index
