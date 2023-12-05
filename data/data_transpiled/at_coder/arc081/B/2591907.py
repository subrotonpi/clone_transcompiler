def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.MOD = 1_000_000_007
    def solve ( self , N , S1 , S2 ) :
        print ( solve ( self , N , S1 , S2 ) )
    def solve ( self , N , S1 , S2 ) :
        if S1 [ 0 ] == S2 [ 0 ] :
            prev_tate = True
            i = 1
            ans = 3
        else :
            prev_tate = False
            i = 2
            ans = 6
        while N > i :
            if S1 [ i ] == S2 [ i ] :
                if prev_tate :
                    ans = ans * 2 % self.MOD
                i += 1
                prev_tate = True
            else :
                if prev_tate :
                    ans = ans * 2 % self.MOD
                else :
                    ans = ans * 3 % self.MOD
                i = i + 2
                prev_tate = False
        return int ( ans )
return Main
