def main ( ) :
    import sys
    import copy
    class Main ( object ) :
        def __init__ ( self , n , p ) :
            self.n = n
            self.p = p
        def __repr__ ( self ) :
            return "%d:%d" % ( n , p )
    class Range ( object ) :
        def __init__ ( self , src , dst ) :
            self.src , self.dst = src , dst
        def len ( self ) :
            return self.dst - self.src + 1
        def is_inc ( self , tgt ) :
            return self.src <= tgt <= self.dst
        def __repr__ ( self ) :
            return "%d-%d" % ( self.src , self.dst )
    def main ( sc ) :
        n , k , q = select.select ( [ ] , [ ] , [ ] , [ ] )
        a = [ ]
        data = [ ]
        for i in range ( n ) :
            a.append ( sc.read ( ) )
            data.append ( Data ( a [ i ] , i ) )
        sc.close ( )
        sort ( data , lambda x , y : x.n - y.n )
        data = { }
        data [ 0 ] = { }
        ans = sys.maxint
        for i in range ( n ) :
            tmp = list ( )
            for r in data.values ( ) :
                tmp.extend ( zip ( * ( map ( lambda x : x.n , r.src , r.dst + 1 ) ) ) )
            tmp.sort ( )
            if len ( tmp ) < q :
                break
            y = tmp [ q - 1 ]
            x = data [ i ] [ 'n' ]
            ans = min ( ans , y - x )
            splash ( data , k , data [ i ] [ 'p' ] )
            while i < n and data [ i ] [ 'n' ] == x :
                splash ( data , k , data [ i ] [ 'p' ] )
                i += 1
        print ( ans )
