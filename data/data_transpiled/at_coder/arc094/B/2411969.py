def main ( ) :
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.q = len ( sys.argv )
            for i in range ( self.q ) :
                a = sys.argv [ i ]
                b = sys.argv [ i ]
                print ( solve ( a , b ) )
        def solve ( a , b ) :
            if a > b :
                return solve ( b , a )
            ab = math.mul_ground ( a , b )
            i = find_upper_root ( ab )
            if i == 0 :
                return 0
            j = ( ab - 1 ) / i
            res = math.mul_ground ( i , 2 )
            if i == j :
                res -= 1
            if i >= a :
                res -= 1
            return res
        def find_upper_root ( n ) :
            ll = 0
            ul = int ( math.sqrt ( n ) ) + 1
            while math.addExact ( ll , 1 ) < ul :
                mid = math.addExact ( ll , ul ) / 2
                if math.multiplyExact ( mid , mid ) < n :
                    ll = mid
                else :
                    ul = mid
            return ll
    return Main ( )
