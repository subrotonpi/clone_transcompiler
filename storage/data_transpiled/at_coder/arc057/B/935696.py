def _import ( * , bif , default ) :
    from itertools import repeat
    from itertools import chain
    from itertools import chain
    from itertools import repeat
    class Main ( object ) :
        def __init__ ( self , bif , default ) :
            super ( Main , self ).__init__ ( )
            self.bif = default
            for x in repeat ( 0 , n ) :
                self.bif = bif ( x )
        def run ( self ) :
            self.n = ni ( )
            k = ni ( )
            sum = 0
            a = [ ]
            for i in range ( n ) :
                a.append ( ni ( ) )
                sum += a [ i ]
            if sum == k :
                print ( 1 )
            else :
                dp = [ [ ] for _ in range ( n + 1 ) ]
                for i in range ( 0 , n ) :
                    dp.append ( [ 0 ] )
                dp [ 0 ].append ( 0 )
                s = 0
                for i in range ( 0 , n ) :
                    for j in range ( 0 , n ) :
                        if dp [ i ] [ j ] == int ( n ) :
                            continue
                        dp [ i + 1 ] [ j ] = min ( dp [ i + 1 ] [ j ] , dp [ i ] [ j ] )
                        u = dp [ i ] [ j ]
                        ns = s + a [ i ]
                        if s == 0 :
                            v = 1
                        else :
                            v = ( u * ns ) / s + 1
                        dp [ i + 1 ] [ j + 1 ] = min ( dp [ i + 1 ] [ j + 1 ] , int ( v ) )
                    s += a [ i ]
                for i in range ( 0 , n ) :
                    if dp [ n ] [ i ] <= k :
                        print ( i )
                        break
    ni ( )
    return int ( sc.next ( ) )
def debug ( * os ) :
    print ( "".join ( map ( str , os ) ) )
class BIT ( object ) :
    def __init__ ( self , bif , default ) :
        super ( ).__init__ ( )
        self.bif = bif
