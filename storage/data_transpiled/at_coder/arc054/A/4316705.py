def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.count = 0
    def __call__ ( self , * args ) :
        sc = _main.raw_input ( )
        l = sc.getmaxyx ( ) [ 0 ]
        x = sc.getmaxyx ( ) [ 0 ]
        y = sc.getmaxyx ( ) [ 0 ]
        s = sc.getmaxyx ( ) [ 1 ]
        d = sc.getmaxyx ( ) [ 1 ]
        ans = 0
        if x >= y :
            val = d - s
            if val < 0 :
                val += l
            ans = val / ( x + y )
        else :
            val1 = s - d
            if val1 < 0 :
                val1 += l
            ans1 = val1 / ( y - x )
            val2 = d - s
            if val2 < 0 :
                val2 += l
            ans2 = val2 / ( y + x )
            ans = min ( ans1 , ans2 )
        print ( ans )
