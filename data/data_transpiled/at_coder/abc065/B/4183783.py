def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main.sc
        mod = 1000000007
        def __init__ ( self ) :
            self.n = sc.randint ( 0 , 1000000007 )
            buttons = [ Button ( sc.randint ( - 1 , 1 ) , False ) for i in range ( n ) ]
            buttons [ 0 ].light = True
            ans = - 1
            now_light = 0
            for i in range ( n ) :
                buttons [ now_light ].light = False
                now_light = buttons [ now_light ].Push ( )
                buttons [ now_light ].light = True
                if now_light == 1 :
                    ans = i + 1
                    break
            print ( ans )
    class Button ( object ) :
        def __init__ ( self , n , l ) :
            self.num = n
            self.light = l
        def Push ( self ) :
            return self.num
