def _import ( ) :
    import defaultdict
    import string
    import string
    class B ( object ) :
        def __init__ ( self , a ) :
            super ( B , self ).__init__ ( a )
    def run ( self ) :
        with open ( 'input.txt' , 'r' ) as f :
            T = len ( f.read ( ) )
            for case in range ( 1 , T + 1 ) :
                H , W = map ( lambda x : x , f.read ( ) )
    def run ( self ) :
        for case in range ( 1 , T + 1 ) :
            for i in range ( H ) :
                for j in range ( W ) :
                    map [ i , j ] = f.read ( )
    dx = ( 0 , - 1 , 1 , 0 )
    dy = ( - 1 , 0 , 0 , 1 )
    for i in range ( H ) :
        for j in range ( W ) :
            ci , cj = i , j
            while True :
                min = map [ ci , cj ]
                for k in range ( 4 ) :
                    if 0 <= ci + dy [ k ] < H and 0 <= cj + dx [ k ] < W :
                        min = min ( min , map [ ci + dy [ k ] , cj + dx [ k ] ] )
                    if min == map [ ci , cj ] :
                        break
                for k in range ( 4 ) :
                    if 0 <= ci + dy [ k ] < H and 0 <= cj + dx [ k ] < W :
                        if min == map [ ci + dy [ k ] , cj + dx [ k ] ] :
                            ci , cj = ci + dy [ k ] , cj + dx [ k ]
                            break
            self.sink_map [ i ] = ci * W + cj
    altitudes = [ ]
    a = 'a'
    for case in range ( 1 , T + 1 ) :
        for i in range ( 1 , T + 1 ) :
            print ( char.upper ( ) , end = ' ' )
