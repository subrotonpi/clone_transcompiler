def _import ( ) :
    import os
    import sys
    class Solution ( object ) :
        def __init__ ( self , filename ) :
            self.filename = 'sample'
        def __init__ ( self , f ) :
            self.filename = filename
        def __init__ ( self , x , y ) :
            self.x = x
            self.y = y
        def diff ( self , b ) :
            return ( self.x - b.x , self.y - b.y )
        def uniform ( self , x , y ) :
            return math.sqrt ( x ** 2 + y ** 2 )
    last_ans = ans
    try :
        f = open ( filename + '.in' , 'r' )
        f.close ( )
    except Exception :
        sys.exit ( - 1 )
    def eat ( string ) :
        st = string.split ( ' ' )
        for i in range ( 1 , len ( st ) ) :
            if not st :
                return None
            self.x = st [ 0 ]
            self.y = st [ 1 ]
        return st [ 0 ]
    def dist ( a , b , c ) :
        return a.diff ( b ).len
    def per ( a , b , c ) :
        return dist ( a , b ) + dist ( b , c ) + dist ( c , a )
    def solve ( self , test ) :
        print ( 'Case #%d: ' % test , end = ' ' )
        n = randint ( 1 , n )
        ( vs , xs , ys ) = [ ( x , y ) for x in st ]
        xs.sort ( key = lambda x : x [ 0 ] )
        ys.sort ( key = lambda y : y [ 0 ] )
        xid = [ x [ 0 ] for x in xs ]
        last_ans = [ y [ 0 ] for y in ys ]
        for i in range ( 1 , len ( xs ) ) :
            self.xs [ i ] = xs [ i ]
    return last_ans
