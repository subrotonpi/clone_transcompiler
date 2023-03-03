def _import ( ) :
    from itertools import islice
    class Main ( object ) :
        def __init__ ( self ) :
            self.n , x , ans = self.n , self.x , 0
            a = islice ( range ( n ) , n )
            for i , ans in enumerate ( a ) :
                if x >= a [ i ] :
                    x -= a [ i ]
                else :
                    break
            if ans == n and x != 0 :
                ans -= 1
            print ( ans )
    return Main
