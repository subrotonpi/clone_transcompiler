def import _main
class Main ( object ) :
    class Section ( object ) :
        def __init__ ( self , now , t , v ) :
            self.l = now
            self.r = now + t
            self.v = v
        def max_v ( self , t ) :
            if t < self.l :
                return v + ( self.l - t )
            elif r < self.t :
                return v + ( t - r )
            else :
                return v
    def main ( sc ) :
        n = sc.recv_number ( )
        t = [ sc.recv_number ( ) for _ in range ( n ) ]
        secs = [ ]
        sum = 0
        for i in range ( 1 , n + 1 ) :
            v = sc.recv_number ( )
            secs.append ( Section ( sum , t [ i - 1 ] , v ) )
            sum += t [ i - 1 ]
        secs.append ( Section ( 0 , 0 , 0 ) )
        secs.append ( Section ( sum , 0 , 0 ) )
        ans = 0.0
        for now in [ 0.0 , sum - 0.5 , 0.5 ] :
            v1 = secs [ 0 ].max_v ( now )
            v2 = secs [ 0 ].max_v ( now + 0.5 )
            for i in range ( 1 , n + 2 ) :
                v1 = min ( v1 , secs [ i ].max_v ( now ) )
                v2 = min ( v2 , secs [ i ].max_v ( now + 0.5 ) )
            ans += ( v1 + v2 ) * 0.25
        print ( ans )
