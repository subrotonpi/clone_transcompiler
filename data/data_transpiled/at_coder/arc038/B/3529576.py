def _ _ main _ _ ( ) : return 0
class Main ( object ) :
    def __init__ ( self , h , w ) :
        self.h , self.w = h , w
    def __eq__ ( self , o ) :
        if self.__main != o.__main : return False
        self.cord = o.__main
        return self.cord
    def __hash__ ( self ) :
        return hash ( self.h , self.w )
    @ staticmethod
    def readline ( ) :
        if not self.__main : return False
        self.cord = ord ( self.cord )
        return hash ( self.h , self.w )
    def __next__ ( self ) :
        a = [ ]
        for i in range ( self.h ) :
            a.append ( randint ( self.h , self.w ) )
        return a
    def solve ( ) :
        for c in bfs ( ) :
            S [ c.h ] [ c.w ] = 'W' if win_lose ( c.h , c.w ) else 'L'
        return S [ 0 ] [ 0 ] == 'W'
    def bfs ( ) :
        q = PriorityQueue ( )
        result = [ ]
        done = set ( )
        first = ( 0 , 0 )
        q.add ( first )
        done.add ( first )
        result.append ( first )
        while not q.empty ( ) :
            c = q.pop ( )
            for i in range ( 3 ) :
                nh = c.h + self.h
                nw = c.w + self.w
                n = ( nh , nw )
                if in_range ( nh , nw ) and S [ nh ] [ nw ] == '.' and n not in done :
                    q.add ( n )
                    result.append ( n )
                    done.add ( n )
        result.reverse ( )
        return result
    def winlose ( h , w ) :
        for i in range ( 3 ) :
            nh = h + self.h
            nw = w + self.w
            if in_range ( nh , nw ) and S [ nh ] [ nw ] == '.' and n not in done :
                q.remove ( n )
                