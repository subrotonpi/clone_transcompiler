def _ ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.exec ( )
        def solve ( n , m , d , l ) :
            ret = [ ]
            for i in range ( m ) :
                ret.append ( solve ( n , d , l [ i ] ) )
            return ret
        def solve ( n , d , s ) :
            map = { 'a' : '' }
            for i in range ( 26 ) :
                map [ i ] = ord ( 'a' ) + i
            D = [ ]
            for i in range ( n ) :
                D.append ( Dict ( convert ( d [ i ] , map ) , i ) )
            return d [ find ( D , n ) ]
    class Dict ( object ) :
        def __init__ ( self , body , index ) :
            self.body = body
            self.index = index
            self.body = body
            self.hide = ''
            for i in range ( len ( self.body ) ) :
                self.hide += '_'
            self.score = 0
        def open ( self , d ) :
            if self.body [ index ] == c :
                return - 1
            if self.body [ index ] > self.body [ index ] :
                return 1
            return self.hide [ index ]
        def find ( self , n ) :
            [ ] = self.body [ index ]
            ans = self.check ( 0 , n , d , 'a' )
            return ans.index
    def check ( L , R , d , c ) :
        if L + 1 == R :
            return d [ L ]
    p = 0
    ret = None
    while p < R :
        [ ] = d [ p ]
    ans = Dict ( p , d , c )
    if not ans :
        return ans
    if not ans :
        return ans
    p = Dict ( p , d , c )
    return ret
